package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeworkTest {
    @Test
    void getMaxSuccessfull() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 9, 0, 8, -3, 10));
        int expected = 10;

        Homework hw = new Homework();
        int actual = hw.getMax(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeNegativeValueSuccessfull() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 9, 0, 8, -3, 5, 2));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 9, -3, 5));

        Homework hw = new Homework();
        List<Integer> actual = hw.removeNegativeValue(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinSuccessfull() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 9, 0, 8, -3, -10));
        int expected = -10;

        Homework hw = new Homework();
        int actual = hw.getMin(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverageSuccessfull() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 9, 0, 8, 2));
        int expected = 4;

        Homework hw = new Homework();
        int actual = hw.getAverage(expectedList);

        Assertions.assertEquals(expected, actual);
    }
}