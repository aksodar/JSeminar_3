package ru.gb.jseminar;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Homework {

    // Пусть дан произвольный список целых чисел
    


    public static void main(String[] args) {
        Homework hw = new Homework();
        List <Integer> list = new ArrayList<>(Arrays.asList (1, 9, 2, 6, 4, 3, 5, 7, 8, 0));        
        System.out.printf("минимальное значение - %d\n", hw.getMin(list));
        System.out.printf("максимальное значение - %d\n", hw.getMax(list));
        System.out.printf("среднее значение - %.1f\n", hw.getAverage(list));
        System.out.print(hw.removeNegativeValue(list));


    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> array = new ArrayList<>(Arrays.asList ());
        for (int item : list) {
            if (item%2 != 0){
                array.add(item);
            }            
        }        
        return array;
    }
    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        // list.toArray();
        int min = list.get(0);
        for (int item : list) {
            if (item<min){
                min = item;
            }
        }
        return min;
    }
    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        return Collections.max(list);
    }
    // Найти среднее значение
    public double getAverage(List<Integer> list){
        double sum = 0;
        double count = 0;
        for (int item : list) {
            sum += item;
            count++;                      
        }        
        return sum/count;
    }
}
