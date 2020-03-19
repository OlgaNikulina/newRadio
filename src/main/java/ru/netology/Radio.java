package ru.netology;

public class Radio {
    int currentStation = 5;
    int maxStation = 9;
    int minStation = 0;
    int currentVolume = 5;
    int maxVolume = 10;
    int minVolume = 1;
    boolean on;
    String next;
    String previous;

    public Radio(int currentStation) {
        this.currentStation = currentStation;
    }



    public int getCurrentStation() {
        if (currentStation == maxStation) {
            return minStation;
        }
        if (currentStation == minStation) {
            return maxStation;
        }
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
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
        if (currentVolume == maxVolume) {
            return minVolume;
        }
        if (currentVolume == minVolume) {
            return maxVolume;
        }
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
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

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public void setStation() {
        if (currentStation == maxStation) {
        }

        if (currentStation == minStation) {
        }

        currentStation++;
    }

    public void setVolume() {
        if (currentVolume == maxVolume) {
        }
        if (currentVolume == minVolume) {
        }
        currentVolume++;
    }

    public void nextStation () {
        if (currentStation == maxStation) {
        }
        currentStation += 1;
            }

    public void prevStation () {
        if (currentStation == minStation) {
        }
        currentStation -= 1;
    }
}





