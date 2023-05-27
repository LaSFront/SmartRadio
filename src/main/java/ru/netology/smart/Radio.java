
package ru.netology.smart;
public class Radio {
    private int currentStation;
    private final int maxStation = 9, minStation = 0;
    private int currentVolume;
    private final int maxVolume = 100, minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
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
        currentStation = newCurrentStation;
     }

    public int nextStation() {
        if (currentStation >= maxStation) {
           return minStation;
        } else {
            currentStation = currentStation +1;
            return currentStation;
        }
    }

    public int prevStation() {
        if (currentStation <= minStation) {
            return maxStation;
        } else {
            currentStation--;
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
        currentVolume = newCurrentVolume;
    }

    public int higherVolume() {
        if (currentVolume >= maxVolume) {
            return maxVolume;
        } else {
            currentVolume = currentVolume + 1;
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