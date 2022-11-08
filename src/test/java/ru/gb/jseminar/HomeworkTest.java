package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @Test
    void removeEvenNumberedValueSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expectedReturnList = new ArrayList<>(Arrays.asList(1, 3, 5));

        Homework hw = new Homework();
        List<Integer> actualList = hw.removeEvenNumberedValue(expectedList);

        Assertions.assertEquals(expectedReturnList, actualList);
    }

    @Test
    void getMinSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int expected = 1;

        Homework hw = new Homework();
        int actual = hw.getMin(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int expected = 4;

        Homework hw = new Homework();
        int actual = hw.getMax(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSumSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int expected = 10;

        Homework hw = new Homework();
        int actual = hw.getSum(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverageSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int expected = 3;

        Homework hw = new Homework();
        int actual = hw.getAverage(expectedList);

        Assertions.assertEquals(expected, actual);
    }
}