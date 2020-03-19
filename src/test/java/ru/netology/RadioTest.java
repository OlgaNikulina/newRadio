package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setStation() {
        Radio radio = new Radio(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setVolume() {
        Radio radio = new Radio();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio radio = new Radio(5);
        int expected = 6;
        int actual = (radio.getCurrentStation()) + 1;
        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio radio = new Radio(5);
        int expected = 4;
        int actual = radio.getCurrentStation() - 1;
        assertEquals(expected, actual);
    }

    @Test
    void nextVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = (radio.getCurrentVolume()) + 1;
        assertEquals(expected, actual);
    }

    @Test
    void prevVolume() {
        Radio radio = new Radio();
        int expected = 4;
        int actual = radio.getCurrentVolume() - 1;
        assertEquals(expected, actual);
    }
}