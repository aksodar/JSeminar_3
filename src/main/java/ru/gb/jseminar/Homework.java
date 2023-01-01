package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 22, 99, 0));
        Homework taskObject = new Homework();
        System.out.println(taskObject.removeEvenValue(list) + " - odds number");
        System.out.println(taskObject.getMin(list) + " - minimum number");
        System.out.println(taskObject.getMax(list) + " - maximum number");
        System.out.println(taskObject.getAverage(list) + " - Average");

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) { // обрабатываем с конца потомучто remove
            if ((list.get(i) % 2 == 0) || (list.get(i) == 0)) {
                list.remove(i);
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
    public double getAverage(List<Integer> list) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = (double) sum / list.size();
        return average;
    }
}
