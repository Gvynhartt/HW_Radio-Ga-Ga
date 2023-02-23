package ru.netology.mein.Radio;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
public class Radio {
    @Getter  int nmbStation;
    @NonNull int totalStations;
    @Getter @Setter int volSound;

    int minVolSound = 0;
    int maxVolSound = 100;

    public Radio() {
        totalStations = 10;
    }

    public Radio(@NonNull int totalStations) {
        this.totalStations = totalStations;
    }

    public int getNmbStation() {
        return nmbStation;
    }

    public void setNmbStation(int nmbStation) {
        if (nmbStation >= (totalStations - totalStations) && nmbStation < totalStations) {
            nmbStation = nmbStation;
        } else {
            nmbStation = getNmbStation();
        }
        this.nmbStation = nmbStation;
    }

    public int increaseVolume() { /** метод для увеличения громкости на 1*/
        if (volSound < maxVolSound) {
            volSound = volSound + 1;
        }
        return volSound;
    }

    public int decreaseVolume() { /** метод для уменьшения громкости на 1*/
        if (volSound > minVolSound) {
            volSound = volSound - 1;
        }
        return volSound;
    }

    public int nextStation() { /** метод для переключения станции на следующую (по кнопке)*/
        if (nmbStation < (totalStations - 1)) {
            nmbStation = nmbStation + 1;
        } else {
            nmbStation = totalStations - totalStations; /** как альтернатива простому указанию 0,
             т.е. первой станции ПО НОМЕРУ*/
        }
        return nmbStation;
    }

    public int previousStation() { /** метод для переключения станции на предыдущую (по кнопке)*/
        if (nmbStation >= 1) {
            nmbStation = nmbStation - 1;
        } else {
            nmbStation = totalStations - 1; /** переключает на последнюю станцию ПО НОМЕРУ*/
        }
        return nmbStation;
    }
}