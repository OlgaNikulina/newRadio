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
    void increaseCurrentTemperature2() {
        Condition condition = new Condition(21 );
        int expected = 22;
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

    @Test
    void decreaseCurrentTemperature2() {
        Condition condition = new Condition(21);
        int expected = 20;
        condition.decreaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}

