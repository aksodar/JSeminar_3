package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {
    @Test
    void removeEvenValueSuccessful(){
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(2, 5, -1, 0, 8, 25, -3));
        List<Integer> expected = new ArrayList<> (Arrays.asList(5, -1, 25, -3));
        
        Homework hmw = new Homework();
        List<Integer> actual = hmw.removeEvenValue(expectedList);
        
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }
    
    @Test
    void getMinSuccessful(){
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(-3, 1, 0, 8, -1));
        int expected = -3;

        Homework hmw = new Homework();
        int actual = hmw.getMin(expectedList);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void getMaxSuccessful(){
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(2, -1, 0, 5, 2));
        int expected = 5;

        Homework hmw = new Homework();
        int actual = hmw.getMax(expectedList);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void getAverageSuccessful(){
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        double expected = 2.5;

        Homework hmw = new Homework();
        double actual = hmw.getAverage(expectedList);
        
        Assertions.assertEquals(expected, actual);
    }
}
