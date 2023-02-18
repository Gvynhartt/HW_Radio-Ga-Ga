package ru.netology.mein.Radio;

public class Radio {
    private int nmbStation;
    /**
     * сохраняет номер станции [0...9]
     */

    private int volSound;

    /**
     * сохраняет громкость звука [0...10]
     */

    public int getNmbStation() { /** геттер для номера станции*/
        return nmbStation;
    }

    public int setNmbStation(int newNmbStation) { /** сеттер (НЕтривиальный) для номера станции*/
        if (newNmbStation >= 0 && newNmbStation <= 9) {
            nmbStation = newNmbStation;
        } else {
            nmbStation = getNmbStation(); /** в задании не прописано, какое поведение предполагается
             в случае ввода недопустимого номера станции, поэтому пускай возвращается ранее заданный*/
        }
        return nmbStation;
    }

    public int getVolSound() { /** геттер для громкости звука*/
        return volSound;
    }

    public void setVolSound(int newVolSound) { /** сеттер (тривиальный) для громкости звука*/
        volSound = newVolSound;
    }

    public int increaseVolume() { /** метод для увеличения громкости на 1*/
        if (volSound < 10) {
            volSound = volSound + 1;
        }
        return volSound;
    }

    public int decreaseVolume() { /** метод для уменьшения громкости на 1*/
        if (volSound > 0) {
            volSound = volSound - 1;
        }
        return volSound;
    }

    public int nextStation() { /** метод для переключения станции на следующую (по кнопке)*/
        if (nmbStation < 9) {
            nmbStation = nmbStation + 1;
        } else {
            nmbStation = 0;
        }
        return nmbStation;
    }

    public int previousStation() { /** метод для переключения станции на предыдущую (по кнопке)*/
        if (nmbStation > 0) {
            nmbStation = nmbStation - 1;
        } else {
            nmbStation = 9;
        }
        return nmbStation;
    }
}
