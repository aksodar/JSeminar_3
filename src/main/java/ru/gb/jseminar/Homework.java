package ru.gb.jseminar;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework tkhw = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(11, 22, 45, 14, 5, 62, 57, 37, 83, 2));
        System.out.printf("Дан список чисел %s\n", list);
        System.out.printf("Максимальное число: " + tkhw.getMax(list));
        System.out.printf("\nМаксимальное число: " + tkhw.getMin(list));
        System.out.printf("\nСписок без четных чисел: " + tkhw.removeNegativeValue(list));
        System.out.print("\nСреднее значение: " + tkhw.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer>listRemove = new ArrayList<>();
        for (int i:list) {
            if (i %2!=0){
                listRemove.add(i);
            }
        }
        return listRemove;
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
    public Double getAverage(List<Integer> list) {
        double sum = 0;
        for (Integer item : list) {
            sum += item;

        }
        return sum/list.size();
    }
}

