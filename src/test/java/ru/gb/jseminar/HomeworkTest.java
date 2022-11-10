package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @Test
    void removeEvenNumbersTest() {
        List<Integer> incomeList = new ArrayList<>(Arrays.asList(1, 12, 27, 4, 14, 5));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 27, 5));
        Homework hw = new Homework();
        List<Integer> actual = hw.removeEvenNumbers(incomeList);
        Assertions.assertEquals(expectedList, actual);
    }

    @Test
    void getMinTest() {
        List<Integer> incomeList = new ArrayList<>(Arrays.asList(1, 12, 27, 4, 14, 5));
        int expected = 1;
        Homework hw = new Homework();
        int actual = hw.getMin(incomeList);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxTest() {
        List<Integer> incomeList = new ArrayList<>(Arrays.asList(1, 12, 27, 4, 14, 5));
        int expected = 27;
        Homework hw = new Homework();
        int actual = hw.getMax(incomeList);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverage() {
        List<Integer> incomeList = new ArrayList<>(Arrays.asList(1, 12, 29));
        int expected = 14;
        Homework hw = new Homework();
        int actual = hw.getAverage(incomeList);
        Assertions.assertEquals(expected, actual);
    }
}