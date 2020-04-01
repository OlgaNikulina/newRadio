package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStation = 5;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on;
}








