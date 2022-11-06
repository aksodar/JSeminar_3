package ru.gb.jseminar;

import java.util.*;
import java.util.logging.Logger;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {

        Homework hw = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 12, 25, 3, -8, 7, -7, 14, -3, 11, 10));
        Logger log = Logger.getLogger(Homework.class.getName());
        log.info("List of positive integers: " + hw.removeNegativeValue(list).toString());
        log.info("Minimal value is: " + hw.getMin(list).toString());
        log.info("Maximum value is: " + hw.getMax(list).toString());
        log.info("Average value is: " + hw.getAverage(list));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> res = new ArrayList<>(list);
        Iterator<Integer> temp = res.iterator();
        while (temp.hasNext()) {
            if (temp.next() % 2 == 0) {
                temp.remove();
            }
        }
        return res;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = list.get(0);
        for (Integer item: list) {
            if (item < min) {
                min = item;
            }
        }
        return min;
//        return Collections.min(list); // как вариант
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){

        int max = list.get(0);
        for (Integer item : list) {
            if (item > max) {
                max = item;
            }
        }
        return max;
//        return Collections.max(list); // как вариант
    }

    // Найти среднее значение
    public Double getAverage(List<Integer> list){
        double sum = 0;
        for (Integer i: list) {
            sum += i;
        }
        double res = sum / list.size();
        return Math.ceil(res * 1000) / 1000;
    }
}
