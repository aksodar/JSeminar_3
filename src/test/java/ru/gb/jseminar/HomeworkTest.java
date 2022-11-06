package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @Test
    void removeNegativeValue() {
        List<Integer> entryList = new ArrayList<>(Arrays.asList(5, -4, 7, 8));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(5, 7));

        Homework hw = new Homework();
        List<Integer> actualList = hw.removeNegativeValue(entryList);

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void getMinSuccesful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(2, -5, 3, 1, 4));
        int expected = -5;

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
    void getAverageSuccesful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        double expected = 2.5;

        Homework hw = new Homework();
        double actual = hw.getAverage(expectedList);

        Assertions.assertEquals(expected, actual);
    }
}