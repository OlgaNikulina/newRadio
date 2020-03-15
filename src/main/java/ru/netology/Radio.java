package ru.netology;

public class Radio {
    int currentStation = 1;
    int maxStation = 9;
    int minStation = 0;
    int currentloudness = 5;
    int maxLoudness = 10;
    int minLoudness = 1;
    boolean on;
    String next;
    String previous;

    public int setStation() {
        if (currentStation == maxStation) {
            return 0;
        }
        if (currentStation == minStation) {
            return 9;
        }

        currentStation++;
        return currentStation;
    }

    public int setLoudness() {
        if (currentloudness == maxLoudness) {
            return 0;
        }
        if (currentloudness == minLoudness) {
            return 0;
        }
        currentloudness++;
        return currentloudness;
    }
}





