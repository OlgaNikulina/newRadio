package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio(2, 5);
        radio.setCurrentStation(2);
        int actual = radio.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    void shouldNotSetOverMaxStation() {
        Radio radio = new Radio(9, 5);
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        assertEquals(9, actual);
    }

    @Test
    void shouldNotSetUnderMinStation() {
        Radio radio = new Radio(0, 5);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio(1, 5);
        radio.setCurrentVolume(5);
        int actual = radio.getCurrentVolume();
        assertEquals(5, actual);
    }

    @Test
    void shouldNotSetOverMaxVolume() {
        Radio radio = new Radio(1, 10);
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        assertEquals(10, actual);
    }

    @Test
    void shouldNotSetUnderMinVolume() {
        Radio radio = new Radio(1, 0);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio(5, 5);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(6, actual);
     }

    @Test
    void shouldNotSetNextStation() {
        Radio radio = new Radio(9, 5);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio(4, 6);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(3, actual);
    }

    @Test
    void shouldNotSetPrevStation() {
        Radio radio = new Radio(0, 6);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(9, actual);
    }

    @Test
     void shouldIncreaseVolume() {
        Radio radio = new Radio(1, 7);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(8, actual);
    }

    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio(1, 10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(10, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio(1, 6);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(5, actual);
    }

    @Test
    void shouldNotDecreaseVolume() {
        Radio radio = new Radio(1, 0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }
}