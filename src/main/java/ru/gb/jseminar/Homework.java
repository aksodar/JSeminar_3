package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {

        Homework task = new Homework();

        List <Integer> arrayNumber = new ArrayList<Integer>();
        Integer LONG_ARRAY = 10;

        for(int i = 0; i < LONG_ARRAY; i++){
            arrayNumber.add((int)(Math.random() * 100));
        }

        System.out.printf("Входной массив данных: %s\n\n", arrayNumber);
        System.out.printf("Массив без четных чисел: %s\n", task.removeEvenValue(arrayNumber));
        System.out.printf("Минимальное число массива: %s\n", task.getMin(arrayNumber));
        System.out.printf("Максимальное число массива: %s\n", task.getMax(arrayNumber));
        System.out.printf("Среднее число массива: %s\n", task.getAverage(arrayNumber));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> arrayNumber){
        List <Integer> list = new ArrayList <Integer>(arrayNumber.size());
        for(int item: arrayNumber) list.add(item);
        list.removeIf(p -> p % 2 == 0);
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        Integer resultMin = list.get(0);

        for(int item: list){
            if(item < resultMin) resultMin = item;
        }

        return resultMin;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        Integer resultMax = list.get(0);

        for(int item: list){
            if(item > resultMax) resultMax = item;
        }

        return resultMax;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> arrayNumber){
        List <Integer> list = new ArrayList <Integer>(arrayNumber.size());
        for(int item: arrayNumber) list.add(item);
        list.sort(null);

        if(list.size() % 2 == 0) return list.get((list.size() / 2) - 1);
        else return list.get((int)(list.size() / 2));
    }
}
