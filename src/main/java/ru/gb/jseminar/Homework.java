package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,50,89,11,30,31,90,55,24,22));
    Homework hw = new Homework();
        System.out.println("Список нечетных значений " + hw.removeEvenValue(list));
        System.out.println("Минимальное значение = " + hw.getMin(list));
        System.out.println("Максимальное значение = " + hw.getMax(list));
        System.out.println("Среднее значение = " + hw.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){
        List<Integer> list1 = new ArrayList<>(list.size());
        for (int i : list){
            if (i % 2 != 0){ list1.add(i);}
        }
        return list1;
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
        for (int i : list) {
            sum+=i;
        }
        return sum/list.size();
    }
}
