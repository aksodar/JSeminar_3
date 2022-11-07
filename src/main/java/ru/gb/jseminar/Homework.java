package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7));
        Homework homework = new Homework();
        System.out.println(homework.removeNegativeValue(array));
        System.out.println(homework.getMax(array));
        System.out.println(homework.getMin(array));
        System.out.println(homework.getAverage(array));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int item : list) {
            if(item % 2 != 0){
                newList.add(item);
            }
        }
        return newList;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int item : list){
            if (item < min){
                min = item;
            }
        }

        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int item : list) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    // Найти среднее значение
    public double getAverage(List<Integer> list) {
        double sum = 0;
        for (int item : list) {
            sum = item + sum;
        }
        double average = sum/ list.size();
        return average;
    }
}
