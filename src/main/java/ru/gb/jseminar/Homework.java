package ru.gb.jseminar;

import java.util.*;
import java.util.logging.Logger;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Integer> list = new ArrayList<>();
        list = hw.fillArray(list);
        hw.removeNegativeValue(list);
        hw.getMin(list);
        hw.getMax(list);
        hw.getAverage(list);
    }

    // Создадим наполняемый массив для наглядности
    public List<Integer> fillArray(List<Integer> list) {
        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger(Homework.class.getName());
        log.info("Введите длину списка");
        int lenList = sc.nextInt();
        log.info("Заполняем список числами");
        String number;
        for (int i = 0; i < lenList; i++) {
            number = sc.next();
            try {                                                   // Насколько правильно создавать обработку
                Integer.valueOf(number);                            // исключений внутри цикла?
                list.add(Integer.parseInt(number));
            } catch (NumberFormatException e) {
                log.warning("Вводить необходимо число");
                i--;
            }
        }
        sc.close();
        log.info("Вот такой список получился " + list.toString());
        return list;
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        Logger log = Logger.getLogger(Homework.class.getName());
        List<Integer> oddList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) oddList.add(integer);
        }
        log.info("Вот такой список, из нечетных чисел, получился " + oddList);
        return oddList;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        Logger log = Logger.getLogger(Homework.class.getName());
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i));
        }
        log.info("Минимальное значение в списке " + min);
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        Logger log = Logger.getLogger(Homework.class.getName());
        int max = Collections.max(list);
        log.info("Максимальное значение в списке " + max);
        return max;
    }

    // Найти среднее значение
    public Double getAverage(List<Integer> list){
        Logger log = Logger.getLogger(Homework.class.getName());
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        double average = (double) sum / (double) list.size();
        log.info("Среднее значение " + average);
        return average;
    }
}
