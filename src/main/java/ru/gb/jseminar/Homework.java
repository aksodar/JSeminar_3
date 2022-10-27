package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List <Integer> numbers = new ArrayList <Integer> ();
        Collections.addAll(numbers, 4, 5, 2, 1, 6, 8);
        System.out.printf("Список: " + numbers);
        System.out.println();
        System.out.printf("Четные: " + hw.removeNegativeValue(numbers));
        System.out.println();
        System.out.printf("Минимальное значение: " + hw.getMin(numbers));
        System.out.println();
        System.out.printf("Максимальное значение: " + hw.getMax(numbers));
        System.out.println();
        System.out.printf("Ср. арифметическое: " + hw.getAverage(numbers));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        ArrayList <Integer> evenList = new ArrayList<Integer>(list);
        evenList.removeIf(x -> x % 2 == 1);
        return new ArrayList<Integer>(evenList);
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
        int length = list.size();
        int sum = list.stream().mapToInt(a -> a).sum();
        int average = sum / length;
        return average;
    }
}
