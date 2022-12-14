package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        Homework h = new Homework();
        System.out.println(h.removeNegativeValue(list));
        System.out.println(h.getMin(list));
        System.out.println(h.getMax(list));
        System.out.println(h.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){

        list.removeIf(i -> i % 2 == 0);

        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){

        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){

        int avg = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        avg = sum / list.size();

        return avg;
    }
}
