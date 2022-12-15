package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 85, -98, 0, 6, -7, 657, 2, 127, -1));
        Homework hwObject = new Homework();
        System.out.println(list);
        System.out.println((hwObject.getMin(list)));
        System.out.println((hwObject.getMax(list)));
        System.out.println(hwObject.getAverage(list));
        System.out.println(hwObject.removeNegativeValue(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) %2 == 0 && list.get(i) != 0){
            list.remove(i);
            }
        }
        return list;

    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = list.get(0);
        for (Integer item: list){
            if (item < min){
                min = item;
            }
        }
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int max = Collections.max(list);
        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        int count = 0;
        int sum = 0;
        for (Integer item: list){
            sum += item;
            count++;
        }
        int avr = sum/count;
        return avr;
    }
}
