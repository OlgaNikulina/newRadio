package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {


    @Test
    void shouldIncreaseCurrentTemperature() {
        Condition condition = new Condition(21 );
        int expected = 22;
        condition.increaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
 flexible
    void shouldIncreaseCurrentTemperature() {
        Condition condition = new Condition(25 );
        int expected = 26;
        condition.increaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test

 master
    void shouldNotIncreaseCurrentTemperature() {
        Condition condition = new Condition(33 );
        int expected = 33;
        condition.increaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentTemperature() {
 flexible
        Condition condition = new Condition(20);
        int expected = 19;

        Condition condition = new Condition(21);
        int expected = 20;
> master
        condition.decreaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseCurrentTemperature() {
        Condition condition = new Condition(18);
        int expected = 18;
        condition.decreaseCurrentTemperature();
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}

