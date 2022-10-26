package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework HW3 = new Homework();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newList.add(i);
        }
        System.out.println(newList);
        System.out.println(HW3.removeNegativeValue(newList));
        System.out.println(HW3.getMin(newList));
        System.out.println(HW3.getMax(newList));
        System.out.println(HW3.getAverage(newList));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0){
                answer.add(list.get(i));
            }
        }
        return answer;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        list.sort(Comparator.naturalOrder());
        return list.get(0);
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }

    // Найти среднее значение
    public double getAverage(List<Integer> list){
        double answer = getMin(list) + (getMax(list) - getMin(list)) / (double) 2;
        return answer;
    }
}
