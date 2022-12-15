package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        Homework hw = new Homework();
        System.out.println("Список без четных чисел: " + hw.removeEvenNumbers(list));
        System.out.println("Минимальное значение в списке: " + hw.getMin(list));
        System.out.println("Максимальное значение в списке: " + hw.getMax(list));
        System.out.println("Среднее значение в списке: " + hw.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenNumbers(List<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++) {
            Integer temp;
            if (list.get(i)%2 != 0){
                list2.add(list.get(i));
            }
        }
        return list2;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        Collections.sort(list);
        Integer min = list.get(0);
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        Collections.sort(list);
        Integer max = list.get(list.size() - 1);
        return max;
    }

    // Найти среднее значение
    public Double getAverage(List<Integer> list){
        Integer sum = 0;
        for (int i = 0; i < list.size()-1; i++) {
            sum += list.get(i);
        }
        Double average = (double)(sum/list.size());
        return average;
    }
}
