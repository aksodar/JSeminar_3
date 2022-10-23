package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @org.junit.jupiter.api.Test
    void removeNegativeValue() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(7, 5, 2, 9, 8, 1, 6, 4, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(7, 5, 9, 1, 3));


        Homework homework = new Homework();
        List<Integer> actual = homework.removeNegativeValue(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getMinSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(7, 5, 2, 9, 8, 1, 6, 4, 3));
        int expected = 1;

        Homework homework = new Homework();
        int actual = homework.getMin(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getMaxSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(7, 5, 2, 9, 8, 1, 6, 4, 3));
        int expected = 9;

        Homework homework = new Homework();
        int actual = homework.getMax(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getAverageSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(7, 5, 2, 9, 8, 1, 6, 4, 3));
        int expected = 5;

        Homework homework = new Homework();
        int actual = homework.getAverage(expectedList);

        Assertions.assertEquals(expected, actual);
    }
}