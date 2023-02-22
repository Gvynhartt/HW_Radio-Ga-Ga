package ru.netology.mein.Radio;

public class Radio {
    private int nmbStation;
    /**
     * сохраняет номер станции [0...9]
     */

    private int totalStations;
    /**
     * поле с числом станций, необходимое для конструктора
     */

    private int volSound;

    /**
     * сохраняет громкость звука [0...10]
     */
    private int minVolSound = 0;
    /**
     * ПЕРЕДЕЛКА ГРОМКОСТИ ПРЕДПОЛАГАЕТ КОНСТРУКТОР ИЛИ НЕТ?
     */
    private int maxVolSound = 100;

    /**
     * ТОТ ЖЕ ВОПРОС
     */

    public Radio(int totalStations) { /** параметризованный конструктор с указанием числа станций*/
        this.totalStations = totalStations;
    }

    public Radio() { /** НЕпараметризованный конструктор, предполагающий число станции по умолчанию (10)*/
        totalStations = 10;
    }

    public int getNmbStation() { /** геттер для номера станции*/
        return nmbStation;
    }

    public int setNmbStation(int newNmbStation) { /** сеттер (НЕтривиальный) для номера станции*/
        if (newNmbStation >= (totalStations - totalStations) && newNmbStation < totalStations) {
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
