package ru.gb.jseminar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 12, 270, 64, 14, 33, 5, 7, 8, 5));
        Logger log = Logger.getLogger(Homework.class.getName());
        log.info(String.valueOf(hw.getMin(list)));
        log.info(String.valueOf(hw.getMax(list)));
        log.info(String.valueOf(hw.getAverage(list)));
        log.info(String.valueOf(hw.removeEvenNumbers(list)));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenNumbers(List<Integer> list){
        for (int i=0; i<list.size(); i++){
            if (list.get(i)%2 ==0) {
                list.remove(i);
                i=i-1;
            }
        }
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = list.get(0);
        for (int i=1; i<list.size(); i++){
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int max = list.get(0);
        for (int i=1; i<list.size(); i++){
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        int sum = list.get(0);
        for (int i=1; i<list.size(); i++){
            sum+=list.get(i);
        }
        return sum/list.size();
    }
}
