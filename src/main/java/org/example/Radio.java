package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsCount = 10;

    public Radio() {
    }

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < stationsCount) {
            this.currentStation = currentStation;
        }
    }

    public void next() {
        if (currentStation < stationsCount - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = stationsCount - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
