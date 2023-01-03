package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
          List<Integer> arrNumbers = new Random().ints(10, 1, 100).boxed().collect(Collectors.toList());

          printList(arrNumbers,"Произвольный список целых чисел:");

          printList(removeEvenValue(arrNumbers),"\nНечентые числа:");
          System.out.printf("\nМинимальное значение равно: %d", getMin(arrNumbers));
          System.out.printf("\nМаксимальное значение равно: %d", getMax(arrNumbers));
          System.out.print("\nCреднее арифметическое чисел равно: " + getAverage(arrNumbers));
    }

    // Нужно удалить из него четные числа
    public static  List<Integer> removeEvenValue(List<Integer> list){
          return list
                    .stream()
                    .filter(e -> !(e % 2 == 0))
                    .collect(Collectors.toList());
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
          return list.stream().mapToInt((value) -> value).min().getAsInt();
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
          return list.stream().mapToInt((value) -> value).max().getAsInt();
    }

    // Найти среднее значение
    public static Double getAverage(List<Integer> list){
          return list.stream().mapToInt((value) -> value).average().getAsDouble();
    }
	 public static void printList(List<Integer> list,String info){
	  System.out.print(info +"\n");
	  for (int i : list) {
		   System.out.print(i + "\t");
	  }
	}
}
