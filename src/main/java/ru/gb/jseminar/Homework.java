package Homework.homework3.JSeminar_3.src.main.java.ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework test = new Homework();
        List <Integer> Numbers = List.of(0,2,7,8,5,3);
        System.out.println(test.removeEvenValue(Numbers));
        System.out.println(test.getMin(Numbers));
        System.out.println(test.getMax(Numbers));
        System.out.println(test.getAverage(Numbers));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){
        List <Integer> OddNumbers =  new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                OddNumbers.add(list.get(i));
            }
        }
        return OddNumbers;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min>list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max<list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum/list.size();
    }
}
