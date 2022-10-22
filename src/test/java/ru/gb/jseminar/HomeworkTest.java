package ru.gb.jseminar;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HomeworkTest {

    @Test
    public void testGetAverage() {
       //что-то исходное 
       List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
       int expected = 2;

       // что-то делаем
       Homework homework = new Homework();
       int actual = homework.getAverage(expectedList);

       // проверяем
       assertEquals(expected, actual);
    }

    @Test
    public void testGetMax() {
       //что-то исходное 
       List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
       int expected = 4;

       // что-то делаем
       Homework homework = new Homework();
       int actual = homework.getMax(expectedList);

       // проверяем
       assertEquals(expected, actual);
    }

    @Test
    public void testGetMin() {
       //что-то исходное 
       List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
       int expected = 1;

       // что-то делаем
       Homework homework = new Homework();
       int actual = homework.getMin(expectedList);

       // проверяем
       assertEquals(expected, actual);
    }

    @Test
    public void testRemoveNegativeValue() {
       //что-то исходное 
       List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
       List<Integer> expected = new ArrayList<>(Arrays.asList(1,3));

       // что-то делаем
       Homework homework = new Homework();
       List<Integer> actual = homework.removeNegativeValue(expectedList);

       // проверяем
       assertEquals(expected, actual);
    }
    
}
