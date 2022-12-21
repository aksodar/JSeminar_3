package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(9, 2, 15, 3, 1, 4));
        Homework HW = new Homework();
        //System.out.println(HW.removeEvenValue(list));
        //System.out.println("Min element is "+ HW.getMin(list));
        //System.out.println("Max element is "+ HW.getMax(list));
        //System.out.println("Average value is "+ HW.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){
        //List<Integer> temp = null;
        list.removeIf(i -> i % 2 == 0);
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
    public Double getAverage(List<Integer> list){
        int sum = 0;
        double count= list.size();
        for (Integer i: list){
            sum +=i;
        }


        return sum/count;
    }
}
