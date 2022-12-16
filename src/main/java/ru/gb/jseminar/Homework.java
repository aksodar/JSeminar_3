package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(8, 999, 2, 67, 4, 3, 5, 7, 1099));
        Homework h = new Homework();
        System.out.println(h.removeNegativeValue(list));
        System.out.println("Минимальное число равно: " + h.getMin(list));
        System.out.println("Максимальное число равно: " +h.getMax(list));
        System.out.println("Среднее значение равно: " +h.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        list.removeIf(n-> n%2==0);
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = Collections.min(list);
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int max =Collections.max(list);
        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            count ++;
        }
        int avg = sum /count;
        return avg;
    }
}
