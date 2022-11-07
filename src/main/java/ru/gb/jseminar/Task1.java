package ru.gb.jseminar;

import java.util.*;

public class Task1 {

    // Дан список с десятью случайными числами, нужно отсортировать
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        Task1 ts = new Task1();
        System.out.println(ts.sortByCollections(list));
        System.out.println(ts.sortByComparator(list));
    }

    public List<Integer> sortByCollections(List<Integer> list){
        Collections.sort(list);
        return list;
    }

    public List<Integer> sortByComparator(List<Integer> list){
        list.sort(Comparator.reverseOrder());
        return list;
    }

}
