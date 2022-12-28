package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, -6, 4, 33, 5, 7, -8, 0));
        System.out.println(list);

        Homework t = new Homework();
        System.out.println(t.removeEvenValue(list));
        System.out.println(t.getMin(list));
        System.out.println(t.getMax(list));
        System.out.println(t.getAverage(list));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list) {
        List<Integer> listTemp = new ArrayList<>();
        for (Integer element : list) {

            if (element % 2 != 0){
                listTemp.add(element);
            }
        }
        return listTemp;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {
        return Collections.min(list);
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {
        return Collections.max(list);
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list) {
        int sum = 0;
        for (Integer element: list) {
            sum += element;
        }
        return sum / list.size();
    }
}
