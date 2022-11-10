package ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5)) ;
        Homework hw = new Homework();
        System.out.println(hw.getMax(list));
        System.out.println(hw.getMin(list));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() % 2 == 0) {
                    iterator.remove();
                }
            }
            return list;
        }


    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = Collections.min(list);
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int max = Collections.max(list);
        return max;
    }

    // Найти среднее значение
    public Double getAverage(List<Integer> list){
        double sum = 0;
        for (int item : list){
            sum += item;
        }
        return sum/list.size();
    }
}
