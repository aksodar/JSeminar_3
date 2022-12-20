package ru.gb.jseminar;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        int size = 10;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(randomNum.nextInt(0, 100));
        }
        System.out.println("Исходный список - " + list);
        Homework T1 = new Homework();

        System.out.println("Минимальное значение: " + T1.getMin(list));
        System.out.println("Максимальное значение: " + T1.getMax(list));
        System.out.println("Среднее значение без дробной части: " + T1.getAverage(list));
        System.out.println("Среднее значение с дробной частью: " + T1.getAverageDouble(list));
        System.out.println("Список без четных чисел: " + T1.removeEvenValue(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list) {
        list.removeIf(integer -> integer % 2 == 0);
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {
        return Collections.min(list);
    }

    //    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {
        return Collections.max(list);
    }

    //
    // Найти среднее значение
    public Integer getAverage(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum / list.size();

    }

    public Double getAverageDouble(List<Integer> list) {
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum / list.size();
    }
}