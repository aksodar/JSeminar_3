package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeworkTest {

    @Test
    void getMaxSuccessful() {
        // что-то исходное
        List<Integer> listTest = new ArrayList<>(Arrays.asList(11, 385, 2, 123, 11, 3, 51, 210, 84, 72));
        int expected = 385;
        // что-то делаем
        Homework homework = new Homework();
        int actual = homework.getMax(listTest);
        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinSuccessful() {
        // что-то исходное
        List<Integer> listTest = new ArrayList<>(Arrays.asList(11, 385, 0, 123, 11, 3, 51, 210, 84, 72));
        int expected = 0;
        // что-то делаем
        Homework homework = new Homework();
        int actual = homework.getMin(listTest);
        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeNegativeValueSuccessful() {
        // что-то исходное
        List<Integer> listTest = new ArrayList<>(Arrays.asList(11, 385, 0, 123, 11, 3, 51, 210, 84, 72));
        List<Integer> expected = new ArrayList<>(Arrays.asList(11, 385, 123, 11, 3, 51));
        // что-то делаем
        Homework homework = new Homework();
        List<Integer> actual = homework.removeNegativeValue(listTest);
        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverageSuccessful() {
        // что-то исходное
        List<Integer> listTest = new ArrayList<>(Arrays.asList(11, 385, 3, 123, 11, 3, 51, 210, 84, 72));
        double expected = 95.3;
        // что-то делаем
        Homework homework = new Homework();
        double actual = homework.getAverage(listTest);
        // проверяем
        Assertions.assertEquals(expected, actual);
    }

}