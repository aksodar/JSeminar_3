

import java.util.*;

public class ZelendewagenHW {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            lst.add(i);
        }

        ZelendewagenHW testObject = new ZelendewagenHW();

        System.out.println(testObject.removeNegativeValue(lst));
        System.out.println(testObject.getMin(lst));
        System.out.println(testObject.getMax(lst));
        System.out.println(testObject.getAverage(lst));
    }

    //     Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();
        for (int i : list) if (i % 2 != 0) resultList.add(i);
        return resultList;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {
        int min = list.get(0);
        for (int i : list) if (i < min) min = i;
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {
        int max = list.get(0);
        for (int i : list) if (i > max) max = i;
        return max;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list) {
        int avg = list.get(0);
        for (int i : list) avg += i;
        avg /= list.size();
        return avg;
    }

}



