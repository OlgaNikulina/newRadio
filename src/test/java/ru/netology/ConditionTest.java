package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
    void increaseCurrentTemperature() {
        Condition condition = new Condition();
        int expected = 23;
        int actual = condition.increaseCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition();
        int expected = 21;
        int actual = condition.decreaseCurrentTemperature();
        assertEquals(expected, actual);
    }
}

