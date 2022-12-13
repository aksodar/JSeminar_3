package ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("Исходная коллекция " + list);
        Homework homework = new Homework();
        System.out.println("После удаления четных " + homework.removeNegativeValue(list));
        System.out.println("Минимальный элемент  (из оставшихся)  " + homework.getMin(list));
        System.out.println("Максимальный элемент (из оставшихся)  " + homework.getMax(list));
        System.out.println("Среднее значение     (из оставшихся)  " + homework.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        list.removeIf(i -> i % 2 == 0);
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){

        return Collections.min(list);
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){

        return Collections.max(list);
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){

        return (int) list.stream().mapToInt(i -> i).average().orElse(0.0);
    }
}
