package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @Test
    int increaseCurrentTemperature(int currentTemperature, int minTemperature, int maxTemperature) {
        Condition condition = new Condition();
        int expected = 21;
        long actual = increaseCurrentTemperature(20, 9, 29);
        assertEquals(expected, actual);
        return currentTemperature;
    }


    @Test
    int decreaseCurrentTemperature(int currentTemperature, int minTemperature, int maxTemperature) {
        Condition condition = new Condition();
        int expected = 19;
        int actual = decreaseCurrentTemperature(20, 9, 29);
        assertEquals(expected, actual);
        return currentTemperature;
    }
}