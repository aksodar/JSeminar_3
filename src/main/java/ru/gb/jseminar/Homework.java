package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 6, 1, 2, 6, 9, 13, 16));
        Homework hw = new Homework();
        System.out.println(hw.removeNegativeValue(list));
        System.out.println(hw.getMin(list));
        System.out.println(hw.getMax(list));
        System.out.println(hw.getAverage(list));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {
        List<Integer> list2 = new ArrayList<Integer>();
        for (int item : list) {
            if(item%2 == 1) {
                list2.add(item);
            }
        }
        return list2;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {
        int min = Collections.min(list);

        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {
        int max = Collections.max(list, null);
        
        return max;
    }

    // Найти среднее значение
    public double getAverage(List<Integer> list) {
        double sum = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        double volElements =list.size();
        double average = sum/volElements;
        
        return average;
    }
}