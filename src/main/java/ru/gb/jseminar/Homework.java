package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {

        ArrayList<Integer> list = (new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(3);
                add(5);
                add(6);
                add(10);
            }
        });
        System.out.println(list);
        System.out.println(removeNegativeValue(list));
        System.out.println(getMin(list));
        System.out.println(getMax(list));
        System.out.println(getAverage(list));
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeNegativeValue(ArrayList<Integer> list){
        

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
        
    }

    // Найти минимальное значение
    public static Integer getMin(ArrayList<Integer> list){

        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(ArrayList<Integer> list){

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(ArrayList<Integer> list){
            
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return (int) (sum / list.size());
    }
}
