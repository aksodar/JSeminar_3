package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел.
    public static void main(String[] args) {
        int rnd = new Random().nextInt();


        // Нужно удалить из него четные числа.

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd;
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list1){
        int getMin = list1.get(0);
        for (int item : list1) {
            if (item < getMin) {
                getMin = item;
            }

            System.out.printf("Минимальный элемент %s\n", getMin);
        }
        return 0;
    }
    // Найти максимальное значение
    public Integer getMax(List<Integer> list1){

        int getMax = list1.get(0);

        for (int item : list1) {
            if (item > getMax) {
                getMax = item;

            }
            System.out.printf("Максимальный элемент %s\n", getMax);
        }
        return 0;
    }
    // Найти среднее значение

    public Integer getAverage (List < Integer > list1){
        int avg = getAverage(list1);


        System.out.println(avg);

        return 0;
    }
}