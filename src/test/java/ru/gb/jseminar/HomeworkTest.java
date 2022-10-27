package ru.gb.jseminar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeworkTest {

    @Test
    void removeNegativeValueText() {
        List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> expectedEvenList = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8));

        Homework hw = new Homework();
        List<Integer> actualList = new ArrayList<Integer>(hw.removeNegativeValue(expectedList));

        Assertions.assertEquals(expectedEvenList, actualList);
    }
    
    @Test
    void getMin() {
        List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int expectedNum = 1;

        Homework hw = new Homework();
        int actualNum = hw.getMin(expectedList);

        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    void getMax() {
        List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int expectedNum = 9;

        Homework hw = new Homework();
        int actualNum = hw.getMax(expectedList);

        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    void getAverage() {
        List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int expectedNum = 5;

        Homework hw = new Homework();
        int actualNum = hw.getAverage(expectedList);

        Assertions.assertEquals(expectedNum, actualNum);
    }
}