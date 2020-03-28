package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio(2, 10, 0, 25, 100, 0, true);
        radio.setCurrentStation(2);
        int actual = radio.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    void shouldNotSetOverMaxStation() {
        Radio radio = new Radio(11, 10, 0, 25, 100, 0, true);
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        assertEquals(11, actual);
    }

    @Test
    void shouldNotSetUnderMinStation() {
        Radio radio = new Radio(-1, 10, 0, 25, 100, 0, true);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        assertEquals(-1, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio(7, 10, 0, 25, 100, 0, true);
        radio.setCurrentVolume(25);
        int actual = radio.getCurrentVolume();
        assertEquals(25, actual);
    }

    @Test
    void shouldNotSetOverMaxVolume() {
        Radio radio = new Radio(7, 10, 0, 101, 100, 0, true);
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        assertEquals(101, actual);
    }

    @Test
    void shouldNotSetUnderMinVolume() {
        Radio radio = new Radio(7, 10, 0, -1, 100, 0, true);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        assertEquals(-1, actual);
    }

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio(7, 10, 0, 25, 100, 0, true);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(8, actual);
    }

    @Test
    void shouldNotSetNextStation() {
        Radio radio = new Radio(10, 10, 0, 25, 100, 0, true);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio(9, 10, 0, 25, 100, 0, true);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(8, actual);
    }

    @Test
    void shouldNotSetPrevStation() {
        Radio radio = new Radio(0, 10, 0, 25, 100, 0, true);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(10, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio(0, 10, 0, 25, 100, 0, true);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(26, actual);
    }

    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio(0, 10, 0, 100, 100, 0, true);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio(0, 10, 0, 50, 100, 0, true);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(49, actual);
    }

    @Test
    void shouldNotDecreaseVolume() {
        Radio radio = new Radio(0, 10, 0, 0, 100, 0, true);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }
}