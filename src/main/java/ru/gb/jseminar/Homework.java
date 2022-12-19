package ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8));
        Homework hW = new Homework();
        System.out.println("Исходный список целых чисел: " + list);
        System.out.println("Список без чётных чисел: " + hW.removeEvenValue(list));
        System.out.println("Минимальное значение: " + hW.getMin(list));
        System.out.println("Максимальное значение: " + hW.getMax(list));
        System.out.println("Среднее значение: " + hW.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){
        list.removeIf(number -> number % 2 == 0);
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
        int count = list.size();
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum / count;
    }
}

