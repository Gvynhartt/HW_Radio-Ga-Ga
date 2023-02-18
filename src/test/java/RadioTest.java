import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.mein.Radio.Radio;

public class RadioTest {

    @Test /** проверяет метод увеличения громкости при значении ниже максимального*/
    public void shdIncrVolIfBelowMax() {
        Radio curVolume = new Radio();
        curVolume.setVolSound(9);
        curVolume.increaseVolume();

        int actVolume = curVolume.getVolSound();
        int expVolume = 10;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test /** проверяет метод увеличения громкости при максимальном значении*/
    public void shdIncrVolIfMaxReached() {
        Radio curVolume = new Radio();
        curVolume.setVolSound(10);
        curVolume.increaseVolume();

        int actVolume = curVolume.getVolSound();
        int expVolume = 10;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test /**проверяет метод уменьшения громкости при значении выше минимального*/
    public void shdDecrVolIfAboveMin() {
        Radio curVolume = new Radio();
        curVolume.setVolSound(1);
        curVolume.decreaseVolume();

        int actVolume = curVolume.getVolSound();
        int expVolume = 0;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test /**проверяет метод уменьшения громкости при минимальном значении*/
    public void shdDecrVolIfMinReached() {
        Radio curVolume = new Radio();
        curVolume.setVolSound(0);
        curVolume.decreaseVolume();

        int actVolume = curVolume.getVolSound();
        int expVolume = 0;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test /** проверяет метод для переключения на следующую станцию со значением ниже максимального*/
    public void shdSwitchToNextIfBelowMax() {
        Radio curStation = new Radio();
        curStation.setNmbStation(8);
        curStation.nextStation();

        int actStation = curStation.getNmbStation();
        int expStation = 9;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет метод для переключения на следующую станцию при максимальном значении*/
    public void shdSwitchToNextIfMaxReached() {
        Radio curStation = new Radio();
        curStation.setNmbStation(9);
        curStation.nextStation();

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет переключение на предыдущую станцию при значении выше минимального*/
    public void shdSwitchToPrevIfAboveMin() {
        Radio curStation = new Radio();
        curStation.setNmbStation(1);
        curStation.previousStation();

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет переключение на предыдущую станцию при минимальном значении*/
    public void shdSwitchToPrevIfMinReached() {
        Radio curStation = new Radio();
        curStation.setNmbStation(0);
        curStation.previousStation();

        int actStation = curStation.getNmbStation();
        int expStation = 9;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет переключение станции по вводу для числа в пределах условия*/
    public void shdSwitchToInputIfWithinBounds() {
        Radio curStation = new Radio();
        curStation.setNmbStation(5);

        int actStation = curStation.getNmbStation();
        int expStation = 5;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет переключение станции по вводу для числа за пределами условия (больше максимального)*/
    public void shdSwitchToInputIfAboveMax() {
        Radio curStation = new Radio();
        curStation.setNmbStation(13);

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет переключение станции по вводу для числа за пределами условия (меньше минимального)*/
    public void shdSwitchToInputIfOutsideBelowMin() {
        Radio curStation = new Radio();
        curStation.setNmbStation(-13);

        int actStation = curStation.getNmbStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }
}
