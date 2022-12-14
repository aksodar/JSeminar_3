package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 4, 25, -8, 98));
        System.out.println("The desired array: " + list);

        Homework numbers = new Homework();
        System.out.println("The resulting array: " + numbers.removeNegativeValue(list));

        numbers.getMin(list);

        numbers.getMax(list);

        System.out.println("average amount: " + numbers.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {
        List<Integer> list2 = new ArrayList<>();
        for (int i : list) {
            if (i % 2 != 0) {
                list2.add(i);
            }
        }
        return list2;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        System.out.println("Min Element: " + Collections.min(list));
        return 0;
    }


    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        System.out.println("Max Element: " + Collections.max(list));
        return 0;
    }

    // Найти среднее значение
    public Double getAverage(List<Integer> list) {
        long sum = 0;
        for (int i : list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }
}