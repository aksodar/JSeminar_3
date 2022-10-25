package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Integer> listOriginal = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 21, 8, 7));
        List<Integer> listClone = new ArrayList<Integer>(listOriginal);
        Logger log = Logger.getLogger(Homework.class.getName());
        log.info(hw.removeNegativeValue(listClone).toString());
        // log.info(listOriginal.toString());
        log.info(hw.getMin(listOriginal).toString());
        log.info(hw.getMax(listOriginal).toString());
        log.info(hw.getAverage(listOriginal).toString());

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {
        Iterator<Integer> iter = list.listIterator();
        while (iter.hasNext()) {
            int x = iter.next();
            // System.out.println(x);
            if (x % 2 == 0) {
                iter.remove();
            }
        }

        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {

        int min = list.get(0);

        for (Integer i : list) {
            if (i < min)
                min = i;
        }
        return min;
        // return Collections.min(list);
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {

        int max = list.get(0);

        for (Integer i : list) {
            if (i > max)
                max = i;
        }
        return max;
        // return Collections.max(list);
    }

    // Найти среднее значение
    public Double getAverage(List<Integer> list) {
        double sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        return sum / list.size();
    }
}
