package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentStation() {
        Radio radio = new Radio(1, 5);
        radio.setCurrentStation(1);
        int actual = radio.getCurrentStation();
        assertEquals(1, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio(1, 10);
        radio.setCurrentVolume(10);
        int actual = radio.getCurrentVolume();
        assertEquals(10, actual);
    }

    @Test
    void nextStation() {
        Radio radio = new Radio(9, 5);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void nextStation2() {
        Radio radio = new Radio(5, 5);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(6, actual);
    }

    @Test
    void prevStation() {
        Radio radio = new Radio(0, 6);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(9, actual);
    }

    @Test
    void prevStation2() {
        Radio radio = new Radio(4, 6);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(3, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio(1, 10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(10, actual);
    }

    @Test
    void increaseVolume2() {
        Radio radio = new Radio(1, 7);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(8, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio(1, 1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(1, actual);
    }

    @Test
    void decreaseVolume2() {
        Radio radio = new Radio(1, 6);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(5, actual);
    }
}