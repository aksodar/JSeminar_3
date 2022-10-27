package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hmw = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 7, -5, 0, 16, 11, -3, 1, 10));
        // List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        System.out.println(hmw.removeEvenValue(list));
        System.out.println(hmw.getMin(list));
        System.out.println(hmw.getMax(list));
        System.out.println(hmw.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){
        List<Integer> new_list = new ArrayList<>();
        for (int elem: list){
            if (elem % 2 != 0) new_list.add(elem);
        }
        return new_list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int minimum = 0;
        minimum = Collections.min(list);
        return minimum;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int maximum = 0;
        maximum = Collections.max(list);
        return maximum;
    }

    // Найти среднее значение
    public Double getAverage(List<Integer> list){

        double total = 0;
        double qty = list.size();
        for (int elem: list){
            total += elem;
        }
        return total / qty;
    }
}
