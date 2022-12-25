package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.*;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 10, 5, 6, 4, 8, 9));
        Homework test = new Homework();
        System.out.println(test.removeEvenValue(list));
        System.out.println(test.getMin(list));
        System.out.println(test.getMax(list));
        System.out.println(test.getAverage(list));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){
        for (int item : list){
            if (item % 2 == 0){
                list.remove(item);
            }
        }
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
        int sum = 0;
        int count = 0;
        for (int item : list){
            sum += item;
            count++;
        }

        return sum/count;
    }
}
