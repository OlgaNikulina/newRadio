package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {
    @Test
    void increaseCurrentTemperature() {
        Condition condition = new Condition(33 );
        int expected = 33;
        condition.increaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition(18);
        int expected = 18;
        condition.decreaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}

