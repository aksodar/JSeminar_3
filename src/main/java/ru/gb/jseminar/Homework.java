package JSeminar_3.src.main.java.ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework task = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 11, 4, 6, 22, 7, 9, 1, 8, 10, 3));
        System.out.println("Исходный список: " + list);
        System.out.println("Список без четных чисел: " + task.removeEvenValue(list));
        System.out.println("Минимальное значение: " + task.getMin(list));
        System.out.println("Максимальное значение: " + task.getMax(list));
        System.out.println("Среднее значение: " + task.getAverage(list));
    }

    // Нужно удалить из него четные числа

    public List<Integer> removeEvenValue(List<Integer> list) {
        list.removeIf(number -> number % 2 == 0);
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {
        return Collections.min(list);
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {
        return Collections.max(list);
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }
}
