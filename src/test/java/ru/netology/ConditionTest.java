package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @Test
    void increaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.increaseCurrentTemperature();
    }


    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.decreaseCurrentTemperature();
    }
}