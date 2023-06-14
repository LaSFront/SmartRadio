
package ru.netology.smart;
public class Radio {
    private int maxStation, minStation;
    private int currentStation;
    private final int maxVolume = 100, minVolume = 0;
    private int currentVolume;

    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
     }
     public Radio(int quantityOfStations) {
        this.maxStation = quantityOfStations - 1;
     }

    public int getCurrentStation() {
        return currentStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            currentStation = maxStation;
            return;
        }
        if (newCurrentStation < minStation) {
            currentStation = minStation;
            return;
        }
        this.currentStation = newCurrentStation;
     }

    public int nextStation() {
        if (currentStation >= maxStation) {
           return minStation;
        } else {
            currentStation ++;
            return currentStation;
        }
    }

    public int prevStation() {
        if (currentStation <= minStation) {
            return maxStation;
        } else {
            currentStation --;
            return currentStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public int higherVolume() {
        if (currentVolume >= maxVolume) {
            return maxVolume;
        } else {
            currentVolume ++;
            return currentVolume;
        }
    }

    public int lowerVolume() {
        if (currentVolume <= minVolume) {
            return minVolume;
        } else {
            currentVolume = currentVolume - 1;
            return currentVolume;
        }
    }
}