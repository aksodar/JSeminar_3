package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List <Integer> lst = new ArrayList<>(Arrays.asList(44, 35, 34, 99, 11, 66, 13, 101, 666, 777));
        System.out.println(lst);
        Homework hw = new Homework();
        System.out.println("Список без четных чисел " + hw.removeNegativeValue(lst));
        System.out.println("Min = " + hw.getMin(lst));
        System.out.println("Max = " + hw.getMax(lst));
        System.out.println("Среднее значение = " + hw.getAverage(lst));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List <Integer> listNotEven = new ArrayList<>();
        for(int i : list) {
            if (i % 2 != 0) {
                listNotEven.add(i);
            }
        }

        return listNotEven;
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
        for (int item : list){
            sum += item;
        }

        return sum / list.size();
    }
}
