package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
        @Test
        public void shouldCreate() {
            Radio radio = new Radio();
            radio.getCurrentStation();
        }
    }

