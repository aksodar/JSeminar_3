package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework homework = new Homework();
        List<Integer>list = new ArrayList<>(Arrays.asList(2, 5, 3, 7, 9, 6, 1, 8));
        List<Integer>list2 = new ArrayList<>();
        System.out.println(homework.removeNegativeValue(list));
        System.out.println(homework.getMin(list));
        System.out.println(homework.getMax(list));
        System.out.println(homework.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {
        List<Integer>listrem=new ArrayList<>();
        for (int i:list) {
            if (i % 2 != 0) {
                listrem.add(i);
            }
        }
        return listrem;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {
        Integer min = Collections.min(list);
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer > list) {
        Integer max = Collections.max(list);
        return max;
    }

    // Найти среднее значение
    public double getAverage(List<Integer> list) {
        Integer sum = 0;
        for (int i: list) {
            sum += i;
        }
        double average = sum / list.size();

        return average;
    }
}