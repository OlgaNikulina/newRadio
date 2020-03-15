package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setStation() {
        Radio radio = new Radio();
        int expected = 2;
        int actual = radio.setStation();
        assertEquals(expected, actual);
    }

    @Test
    void setLoudness() {
        Radio radio = new Radio();
        int expected = 6;
        int actual = radio.setLoudness();
        assertEquals(expected, actual);
    }
}