package ru.netology.mein.Radio;

public class Radio {
    public int nmbStation; /** сохраняет номер станции [0...9] */

    public int volSound; /** сохраняет громкость звука [0...10] */

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

    public int setNmbStation(int inputNmb) { /** метод для переключения на конкретную станцию (по номеру)*/
        if (0 <= inputNmb && inputNmb <= 9) {
            nmbStation = inputNmb;
        } else {
            System.out.println(nmbStation);
        }
        return nmbStation;
    }
}
