package ru.gb.jseminar;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework tk1 = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.print(tk1.getMin(list));
        System.out.print(tk1.getMax(list));
        System.out.print(tk1.getAverage(list));
        System.out.print(tk1.removeNegativeValue(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        Set<Integer> collection = new HashSet<>();
        for (Integer i : list) {
            if (i%2 == 0) {
               collection.add(i);    
            }
        }
        list.removeAll(collection);
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = Collections.min(list);
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int max = Collections.max(list);
        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        return (int) list.stream()
        .mapToInt(a -> a)
        .average().orElse(0);
    }
}
