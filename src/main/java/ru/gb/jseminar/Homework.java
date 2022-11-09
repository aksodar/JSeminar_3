package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        Logger log = Logger.getLogger(Homework.class.getName());
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 9, 6, 0, 3, 0, 4, 2, 3, 0, 8, -5, -3, -10));
        log.info("Cписок целых чисел:\t" + list.toString());
        log.info("Удалить из него четные числа:\t" + hw.removeNegativeValue(list).toString());
        log.info("Минимальное значение:\t" + hw.getMin(list).toString());
        log.info("Максимальное значение:\t" + hw.getMax(list).toString());
        log.info("Среднее значение:\t" + hw.getAverage(list).toString());
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {
        int min = list.get(0);
        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {
        int max = list.get(0);
        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum / list.size();
    }
}
