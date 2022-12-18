package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    private boolean getEven;


    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        Homework t = new Homework();

        System.out.println(t.getMax(list));
        System.out.println(t.getMin(list));
        System.out.println(Arrays.toString(t.getEven(list)));
        System.out.println(t.getAverage(list));
        System.out.println(t.removeEvenValue(list));

    }

    public int[] getEven(List<Integer> list) {
        int [] evens = new int[list.size()];
        int count = 0;
        for (Integer i : list){
            if (i % 2 == 0){
                evens[count] = i;
                count ++;
            }
        }


        return evens;
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;

            }

        }

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
    public double getAverage(List<Integer> list){
        double averge  = 0;
        int sum = 0;

        for (Integer i : list){
            sum += i;
        }
        averge = sum /list.size();

        return averge;
    }
}
