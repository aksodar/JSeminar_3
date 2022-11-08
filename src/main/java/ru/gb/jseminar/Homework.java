package ru.gb.jseminar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Homework.class.getName());

        Homework hw = new Homework();

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 92, -2, 52, 43, 3, 5, 7, 8, 23, 1));

        log.info("Without even numbers: " + hw.removeEvenNumberedValue(list));
        log.info("Minimal value: " + hw.getMin(list));
        log.info("Maximal value: " + hw.getMax(list));
        log.info("Sum: " + hw.getSum(list));
        log.info("Average: " + hw.getAverage(list));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenNumberedValue(List<Integer> list) {

        List<Integer> newlist = new ArrayList<>(Arrays.asList());

        for (Integer integer : list) {
            if (integer % 2 != 0) {
                newlist.add(integer);
            }
        }

        return newlist;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {

        return Collections.min(list);
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {

        return Collections.max(list);
    }

    public Integer getSum(List<Integer> list) {

        int sum = 0;

        for (Integer integer : list) {
            sum += integer;
        }

        return sum;
    }
    // Найти среднее значение
    public Integer getAverage(List<Integer> list) {

        return getSum(list) / list.size();
    }
}
