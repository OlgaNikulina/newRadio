package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @Test
    void increaseCurrentTemperature() {
        Condition condition = new Condition();
        int expected = 21;
        assertEquals(expected, condition.getCurrentTemperature());
    }


    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition();
        int expected = 19;
        assertEquals(expected, condition.getCurrentTemperature());
    }
}