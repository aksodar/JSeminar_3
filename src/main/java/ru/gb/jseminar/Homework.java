package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 3, 5, 6, 24, 7, 9, 1, 8, 28, 11);
        Homework homeworkObject = new Homework();
        System.out.println("Без четных чисел - " + homeworkObject.removeOddValue(list));
        System.out.println("Минимальное - " + homeworkObject.getMin(list));
        System.out.println("Максимальное - " + homeworkObject.getMax(list));
        System.out.println("Среднее значение - " + homeworkObject.getAverage(list));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeOddValue(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for (Integer item : list) {
            if (item % 2 != 0 ){
                result.add(item);
            }
        }
        return result;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int result = Collections.min(list);
        return result;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int result = Collections.max(list);
        return result;
    }

    // Найти среднее значение
    public Double getAverage(List<Integer> list){
        double result = list.stream().mapToInt(a->a).average().orElse(0);
        return result;
    }
}
