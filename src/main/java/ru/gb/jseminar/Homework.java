package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(234);
        arr.add(29867);
        arr.add(124);
        arr.add(2356);
        arr.add(65784);
        arr.add(4);
        arr.add(23);
        arr.add(2235654);
        arr.add(3);
        arr.add(5);

        System.out.println(hw.removeNegativeValue(arr));
        System.out.println(hw.getMax(arr));
        System.out.println(hw.getMin(arr));
        System.out.println(hw.getAverage(arr));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        ArrayList<Integer> not_even = new ArrayList<>();
        for (int i: list){
            if(i % 2 != 0){
                not_even.add(i);
            }
        }
        return not_even;
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
        Integer summ = list.stream().reduce(0, (a,b) -> a + b);
        return summ / 2;
    }

}
