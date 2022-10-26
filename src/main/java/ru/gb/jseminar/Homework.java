package ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-10, -8, -2, 0, 2, 8, 10));
        Homework hw = new Homework();
        System.out.println(list);
        System.out.println(hw.removeNegativeValue(list) + " << Remove negative");
        System.out.println(hw.getMin(list) + " << Min value");
        System.out.println(hw.getMax(list) + " << Max value");
        System.out.println(hw.getAverage(list) + " << Avg value");

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> tempList = new ArrayList<>(list);
        tempList.removeIf(integer -> integer < 0);
        // идея предложила заменить итератор своим решением на основе итератора.
        // А почему бы и нет?
        return tempList;
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
        int avg = 0;
        for (int item: list) {
            avg+=item;
        }
        avg /= list.size();
        return avg;
    }
}
