package ru.netology;

public class Condition {
    private String name;
    private int maxTemperature = 33;
    private int minTemperature = 18;
    private int currentTemperature = 22;
    private boolean on;

    public int increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return 0;
        }
        currentTemperature += 1;
        return currentTemperature;
    }

    public int decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return 0;
        }
        currentTemperature -= 1;
        return currentTemperature;
    }
}





