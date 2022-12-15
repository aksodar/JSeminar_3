package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 80, 4, 3, 5, 7, 8, 13));
        Homework hwResult = new Homework();
        System.out.println("ОТВЕТ:");
        System.out.println("Список значений: " + list);
        System.out.println("Список нечётных элементов: " + hwResult.removeNegativeValue(list));
        System.out.println("Минимальное значение: " + hwResult.getMin(list));
        System.out.println("Максимальное значение: " + hwResult.getMax(list));
        System.out.println("Среднее арифметическое: " + hwResult.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        list.removeIf(i -> i % 2 == 0);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0){
//                list.remove(i);
//                i--;
//            }
//        }
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
        int sum = 0;
        for (double d : list) {
            sum += d;
        }
        double avg = sum / list.size();
        return avg;
    }
}
