package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework obj = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 6, 12, 7, 39, 4, 8, 17, 8));

        System.out.println(obj.removeEvenValue(list));
        System.out.printf("Минимальное значение: %d\n", obj.getMin(list));
        System.out.printf("Максимальное значение: %d\n", obj.getMax(list));
        System.out.printf("Среднее значение: %d\n", obj.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int elem = list.get(i);
            if (elem % 2 == 0) {
                list.remove(i);
                i--;
                size--;
            }
        }
        return list;
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

        for (int item : list) {
            sum += item;
        }
        return sum / list.size();
    }
}
