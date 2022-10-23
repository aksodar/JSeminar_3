package ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);
        numbers.add(4);
        numbers.add(3);

        System.out.println("Даны числа: " + numbers);
        System.out.println(hw.removeNegativeValue(numbers));
        System.out.println(hw.getMin(numbers));
        System.out.println(hw.getMax(numbers));
        System.out.println(hw.getAverage(numbers));


    }


    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {

        return Collections.min(list);
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {

        return Collections.max(list);
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list) {
        int average = 0;
        if (list.size() > 0){
            {
                int sum = 0;
                for (int item : list) {
                    sum += item;
                }
                average = sum/list.size();
            }

        }
        return average;
    }
}