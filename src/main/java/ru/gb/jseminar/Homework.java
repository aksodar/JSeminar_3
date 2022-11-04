package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 1, 8, 4, 3, 5, 2, 0));

        System.out.println(hw.removeNegativeValue(list));
        System.out.println(hw.getMin(list));
        System.out.println(hw.getMax(list));
        System.out.println(hw.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> list2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
        if (list.get(i) % 2 != 0){
            list2.add(list.get(i));
        }
        }
        return list2;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = Collections.min(list);
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        return Collections.max(list);
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i ++){
            sum = sum + list.get(i);
        }
        return sum/list.size();
    }
}
