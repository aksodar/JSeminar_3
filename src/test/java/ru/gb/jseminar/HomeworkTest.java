package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @Test
    void getMaxSuccessful() {
        // что-то исходное
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 4;

        // что-то делаем
        Homework hw = new Homework();
        int actual = hw.getMax(expectedList);

        // проверяем
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getMinSuccessful() {
        // что-то исходное
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 1;

        // что-то делаем
        Homework hw = new Homework();
        int actual = hw.getMin(expectedList);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverageSuccessful() {
        // что-то исходное
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        float expected = 2.5f;

        // что-то делаем
        Homework hw = new Homework();
        float actual = hw.getAverage(expectedList);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeNegativeValueSuccessful() {
        // что-то исходное
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer>  expected = new ArrayList<>(Arrays.asList(1, 3));

        // что-то делаем
        Homework hw = new Homework();
        List<Integer> actual = hw.removeNegativeValue(expectedList);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }
}