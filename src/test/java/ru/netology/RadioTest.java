package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
flexible
        Radio radio = new Radio(2, 10, 25);
        radio.setCurrentStation(2);
        int actual = radio.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    void shouldNotSetOverMaxStation() {
        Radio radio = new Radio(10, 10, 25);
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();

        Radio radio = new Radio(5, 5);
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        assertEquals(5, actual);
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
 master
        assertEquals(10, actual);
    }

    @Test
 flexible
    void shouldNotSetUnderMinStation() {
        Radio radio = new Radio(0, 10, 25);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio(2, 10, 25);
        radio.setCurrentVolume(25);
        int actual = radio.getCurrentVolume();
        assertEquals(25, actual);
    }

    @Test
    void shouldNotSetOverMaxVolume() {
        Radio radio = new Radio(2, 10, 100);
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }

    @Test
    void shouldNotSetUnderMinVolume() {
        Radio radio = new Radio(2, 10, 0);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);

    void shouldNotSetUnderMinVolume() {
        Radio radio = new Radio(1, 1);
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        assertEquals(1, actual);
master
    }

    @Test
    void shouldSetNextStation() {
 flexible
        Radio radio = new Radio(7, 10, 25);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(8, actual);

        Radio radio = new Radio(5, 5);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(6, actual);
 master
    }

    @Test
    void shouldNotSetNextStation() {
 flexible
        Radio radio = new Radio(10, 10, 25);

        Radio radio = new Radio(9, 5);
 master
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetPrevStation() {
 flexible
        Radio radio = new Radio(9, 10, 25);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(8, actual);

        Radio radio = new Radio(4, 6);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(3, actual);
 master
    }

    @Test
    void shouldNotSetPrevStation() {
 flexible
        Radio radio = new Radio(0, 10, 25);

        Radio radio = new Radio(0, 6);
 master
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(10, actual);
    }

    @Test
 flexible
    void increaseVolume() {
        Radio radio = new Radio(2, 10, 25);

    void shouldIncreaseVolume() {
        Radio radio = new Radio(1, 7);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(8, actual);
    }

    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio(1, 10);
 master
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(26, actual);
    }

    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio(2, 10, 100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }

    @Test
flexible
    void decreaseVolume() {
        Radio radio = new Radio(2, 10, 50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(49, actual);

    void shouldDecreaseVolume() {
        Radio radio = new Radio(1, 6);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(5, actual);
 master
    }

    @Test
    void shouldNotDecreaseVolume() {
 flexible
        Radio radio = new Radio(2, 10, 0);

        Radio radio = new Radio(1, 1);
 master
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }
}