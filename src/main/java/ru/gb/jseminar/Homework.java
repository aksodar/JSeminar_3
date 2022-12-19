package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,23,4,5,6,7,8,9,10));
        Homework tetObject = new Homework();
        System.out.println(tetObject.removeEvenValue(list));
        tetObject.getMin(list);
        tetObject.getMax(list);
        tetObject.getAverage(list);
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){
        List<Integer> listNeChetn = new ArrayList<>();
        for (Integer i : list) {
            if (i%2 != 0){
                listNeChetn.add(i);
            }
            
        }
        return listNeChetn;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        Collections.sort(list);
        System.out.println(list.get(0));
        return 0;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list.get(0));
        return 0;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        double summ = 0;
        for (Integer i : list) {
            summ += i;
        }
        System.out.println(summ/list.size());
        return 0;
    }
}
