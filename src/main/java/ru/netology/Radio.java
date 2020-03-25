package ru.netology;

public class Radio {
    private int currentStation = 5;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume = 5;
    private int maxVolume = 10;
    private int minVolume = 1;
    private boolean on;

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation == maxStation) {
            return;
        }
        if (currentStation == minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }



    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume == maxVolume) {
            return;
        }
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        }
        currentStation ++;
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        }
        currentStation --;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume -= 1;
    }
}





