package JSeminar_3.src.main.java.ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        Homework findResult = new Homework();
        findResult.removeEvenValue(list);
        System.out.println("Min: " + getMin(list));
        System.out.println("Max: " + getMax(list));
        System.out.println("Average: " + getAverage(list));
        System.out.println(list);
    }

    // Нужно удалить из него четные числа
    public void removeEvenValue(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(sortedlist.size() - 1);
    }

    // Найти среднее значение
    public static double getAverage(List<Integer> list) {
        double average = 0;
        if (list.size() > 0) {
            double sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum = sum + list.get(j);
            }
            average = sum / list.size();
        }
        return average;
    }
}
