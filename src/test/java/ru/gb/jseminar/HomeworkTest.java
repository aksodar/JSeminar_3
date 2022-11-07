package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @Test
    void removeNegativeValueSuccessful() {
        // Входные данные
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5));

        // Действия
        Homework hw = new Homework();
        List<Integer> actual = hw.removeNegativeValue(expectedList);

        // Проверка
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinSuccessful() {
        // Входные данные
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int expected = 1;

        // Действие
        Homework hw = new Homework();
        int actual = hw.getMin(expectedList);

        // Проверка
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxSuccessful() {
        // Входные данные
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int expected = 5;

        // Действие
        Homework hw = new Homework();
        int actual = hw.getMax(expectedList);

        // Проверка
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverageSuccessful() {
        // Входные данные
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        double expected = 3.0;

        // Действие
        Homework hw = new Homework();
        double actual = hw.getAverage(expectedList);

        // Проверка
        Assertions.assertEquals(expected, actual);
    }
}