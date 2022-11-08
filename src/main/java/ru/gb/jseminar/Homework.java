package ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(3,12,55,2,6,3));

        System.out.println(list);
        System.out.println(hw.getMax(list));
        System.out.println(hw.getMin(list));
        System.out.println(hw.getAverage(list));
        System.out.println(hw.removeNegativeValue(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
//        List<Integer> resList = new ArrayList<>();
//        for (Integer i: list) {
//            if (i % 2 != 0) {resList.add(i);}
//        }
        list.removeIf(i -> i % 2 == 0);
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {return Collections.min(list);}

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {return Collections.max(list);}

    // Найти среднее значение
    public double getAverage(List<Integer> list){
        double temp = 0;
        for (int i : list) {
            temp+=i;
        }
        return temp/list.size();
    }
}
