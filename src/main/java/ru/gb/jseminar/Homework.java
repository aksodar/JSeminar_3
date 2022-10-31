package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;


public class Homework {

    // Пусть дан произвольный список целых чисел
    

    public static void main(String[] args) {
        Homework homework = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 7, -4, 0, 6, -8, 5));
        System.out.println(list);
        Logger l = Logger.getLogger(Homework.class.getName());
        l.info(homework.removeNegativeValue(list).toString());
        l.info(homework.getMin(list).toString());
        l.info(homework.getMax(list).toString());
        l.info(homework.getAverage(list).toString());


    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List <Integer> withoutNegative = new ArrayList<>();
        for (Integer item : list) {
            if (item%2 != 0){
                withoutNegative.add(item);
            }
        }

        return withoutNegative;
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
        int sum = 0;
        
        for (int item : list) {
            sum +=item;
        }

        return (sum/(list.size()));
    }
}
