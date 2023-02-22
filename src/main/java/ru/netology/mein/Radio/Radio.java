package ru.netology.mein.Radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int nmbStation;
    private int totalStations;
    private int volSound;

    private int minVolSound = 0;
    private int maxVolSound = 100;

    public Radio(int totalStations) {
        this.totalStations = totalStations;
    }

    public Radio() {
        totalStations = 10;
    }

    public int getNmbStation() {
        return nmbStation;
    }

    public int setNmbStation(int nmbStation) {
        if (nmbStation >= (totalStations - totalStations) && nmbStation < totalStations) {
            this.nmbStation = nmbStation;
        } else {
            nmbStation = getNmbStation();
        }
        return nmbStation;
    }

    public int getVolSound() {
        return volSound;
    }

    public void setVolSound(int volSound) {
        this.volSound = volSound;
    }

    public int increaseVolume() {
        if (volSound < maxVolSound) {
            volSound = volSound + 1;
        }
        return volSound;
    }

    public int decreaseVolume() {
        if (volSound > minVolSound) {
            volSound = volSound - 1;
        }
        return volSound;
    }

    public int nextStation() {
        if (nmbStation < (totalStations - 1)) {
            nmbStation = nmbStation + 1;
        } else {
            nmbStation = totalStations - totalStations;
        }
        return nmbStation;
    }

    public int previousStation() {
        if (nmbStation >= 1) {
            nmbStation = nmbStation - 1;
        } else {
            nmbStation = totalStations - 1;
        }
        return nmbStation;
    }
}