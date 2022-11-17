package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework homework = new Homework();
        List<Integer> intList = new ArrayList<>();
        
        for (int i = 0; i < 15; i++)
            intList.add(new Random().nextInt(1, 100));

        System.out.println(intList);
        System.out.println("Без чётных " + homework.removeNegativeValue(intList));
        System.out.println("Мин знач " + homework.getMin(intList));
        System.out.println("Мах знач " + homework.getMax(intList));
        System.out.println("Среед знач " + homework.getAverage(intList));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) % 2 != 0)
                result .add(list.get(i));
       
        return result;
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
        double result = getMin(list) + (getMax(list) - getMin(list)) / (double) 2;
        return result;
    }
}