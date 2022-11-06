package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 0, 5, 8, 7, 4, 5, 3, 6, 9));
        Homework homework = new Homework();
        System.out.println(homework.removeNegativeValue(list));
        System.out.println(homework.getMin(list));
        System.out.println(homework.getMax(list));
        System.out.println(homework.getAverage(list));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {
        List<Integer> listTemp = new ArrayList<>();
        for (int i : list) {
            if (i % 2 != 0) {
                listTemp.add(i);

            }

        }
        return listTemp;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {
        int min = Collections.min(list);
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {
        int max = Collections.max(list);
        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list) {
            int sum = 0;
            for (int i : list) {
                sum += i;
            }
            int average = sum / list.size();

            return average;
        }
    }
