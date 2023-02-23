import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.mein.Radio.Radio;

public class RadioTest {

    @Test
    /** проверяет метод увеличения громкости при значении ниже максимального*/
    public void shdIncrVolIfBelowMax() {
        Radio curVolume = new Radio();
        curVolume.setVolSound(99);
        curVolume.increaseVolume();

        int actVolume = curVolume.getVolSound();
        int expVolume = 100;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test
    /** проверяет метод увеличения громкости при максимальном значении*/
    public void shdIncrVolIfMaxReached() {
        Radio curVolume = new Radio();
        curVolume.setVolSound(100);
        curVolume.increaseVolume();

        int actVolume = curVolume.getVolSound();
        int expVolume = 100;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test
    /**проверяет метод уменьшения громкости при значении выше минимального*/
    public void shdDecrVolIfAboveMin() {
        Radio curVolume = new Radio();
        curVolume.setVolSound(1);
        curVolume.decreaseVolume();

        int actVolume = curVolume.getVolSound();
        int expVolume = 0;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test
    /**проверяет метод уменьшения громкости при минимальном значении*/
    public void shdDecrVolIfMinReached() {
        Radio curVolume = new Radio();
        curVolume.setVolSound(0);
        curVolume.decreaseVolume();

        int actVolume = curVolume.getVolSound();
        int expVolume = 0;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test
    /** проверяет метод для переключения на следующую станцию со значением ниже максимального (по умолчанию)*/
    public void shdSwitchToNextIfBelowMaxDefault() {
        Radio curStation = new Radio();
        curStation.setNmbStation(8);
        curStation.nextStation();

        int actStation = curStation.getNmbStation();
        int expStation = 9;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет метод для переключения на следующую станцию при максимальном значении (по умолчанию)*/
    public void shdSwitchToNextIfMaxReachedDefault() {
        Radio curStation = new Radio();
        curStation.setNmbStation(9);
        curStation.nextStation();

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет переключение на предыдущую станцию при значении выше минимального (по умолчанию)*/
    public void shdSwitchToPrevIfAboveMinDefault() {
        Radio curStation = new Radio();
        curStation.setNmbStation(1);
        curStation.previousStation();

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет переключение на предыдущую станцию при минимальном значении (по умолчанию)*/
    public void shdSwitchToPrevIfMinReachedDefault() {
        Radio curStation = new Radio();
        curStation.setNmbStation(0);
        curStation.previousStation();

        int actStation = curStation.getNmbStation();
        int expStation = 9;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет переключение станции по вводу для числа в пределах условия (по умолчанию)*/
    public void shdSwitchToInputIfWithinBoundsDefault() {
        Radio curStation = new Radio();
        curStation.setNmbStation(5);

        int actStation = curStation.getNmbStation();
        int expStation = 5;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет переключение станции по вводу для числа больше максимального (по умолчанию)*/
    public void shdSwitchToInputIfAboveMaxDefault() {
        Radio curStation = new Radio();
        curStation.setNmbStation(13);

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет переключение станции по вводу для числа меньше минимального (по умолчанию)*/
    public void shdSwitchToInputIfBelowMinDefault() {
        Radio curStation = new Radio();
        curStation.setNmbStation(-13);

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет переключение станции по вводу с произвольным числом станций (внутри диапазона)*/
    public void shdSwitchToInputWithCustomTotalStations() {
        Radio curStation = new Radio(42);
        curStation.setNmbStation(26);

        int actStation = curStation.getNmbStation();
        int expStation = 26;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет переключение станции по вводу с произвольным числом станций
     * (для максимального номера станции)*/
    public void shdSwitchToInputWithCustomTotalStationsIfMax() {
        Radio curStation = new Radio(42);
        curStation.setNmbStation(41);

        int actStation = curStation.getNmbStation();
        int expStation = 41;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет переключение станции по вводу с произвольным числом станций
     * (для номера станции больше максимального)*/
    public void shdSwitchToInputWithCustomTotalStationsIfAboveMax() {
        Radio curStation = new Radio(42);
        curStation.setNmbStation(5928);

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** проверяет переключение станции по вводу с произвольным числом станций,
     * если задан диапазон в 0 станций*/
    public void shdSwitchToInputWithCustomTotalStationsIfZeroRange() {
        Radio curStation = new Radio(0);
        curStation.setNmbStation(404);

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test
    /** намекает аутсосерам на кодерах, набранным по объявлению: с их поделием явно
     * что-то не так, ибо заданный диапазон станций ниже нуля, а в сеттере нет проверки
     * (ЛАЛ)*/
    public void shdSwitchToInputWithCustomTotalStationsIfRangeIsNegative() {
        Radio curStation = new Radio(-300);
        curStation.setNmbStation(-273);

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }
}

