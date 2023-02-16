import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.mein.Radio.Radio;

public class RadioTest {

    @Test /** проверяет метод увеличения громкости при значении ниже максимального*/
    public void shdIncrVolIfBelowMax() {
        Radio curVolume = new Radio();

        curVolume.volSound = 9;
        int actVolume = curVolume.increaseVolume();
        int expVolume = 10;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test /** проверяет метод увеличения громкости при максимальном значении*/
    public void shdIncrVolIfMaxReached() {
        Radio curVolume = new Radio();

        curVolume.volSound = 10;
        int actVolume = curVolume.increaseVolume();
        int expVolume = 10;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test /**проверяет метод уменьшения громкости при значении выше минимального*/
    public void shdDecrVolIfAboveMin() {
        Radio curVolume = new Radio();

        curVolume.volSound = 1;
        int actVolume = curVolume.decreaseVolume();
        int expVolume = 0;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test /**проверяет метод уменьшения громкости при минимальном значении*/
    public void shdDecrVolIfMinReached() {
        Radio curVolume = new Radio();

        curVolume.volSound = 0;
        int actVolume = curVolume.decreaseVolume();
        int expVolume = 0;

        Assertions.assertEquals(expVolume, actVolume);
    }

    @Test /** проверяет метод для переключения на следующую станцию со значением ниже максимального*/
    public void shdSwitchToNextIfBelowMax() {
        Radio curStation = new Radio();

        curStation.nmbStation = 8;
        int actStation = curStation.nextStation();
        int expStation = 9;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет метод для переключения на следующую станцию при максимальном значении*/
    public void shdSwitchToNextIfMaxReached() {
        Radio curStation = new Radio();

        curStation.nmbStation = 9;
        int actStation = curStation.nextStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет переключение на предыдущую станцию при значении выше минимального*/
    public void shdSwitchToPrevIfAboveMin() {
        Radio curStation = new Radio();

        curStation.nmbStation = 1;
        int actStation = curStation.previousStation();
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет переключение на предыдущую станцию при минимальном значении*/
    public void shdSwitchToPrevIfMinReached() {
        Radio curStation = new Radio();

        curStation.nmbStation = 0;
        int actStation = curStation.previousStation();
        int expStation = 9;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет переключение станции по вводу для числа в пределах условия*/
    public void shdSwitchToInputIfWithinBounds() {
        Radio curStation = new Radio();

        int actStation = curStation.setNmbStation(5);
        int expStation = 5;

        Assertions.assertEquals(expStation, actStation);
    }

    @Test /** проверяет переключение станции по вводу для числа за пределами условия*/
    public void shdSwitchToInputIfOutsideBounds() {
        Radio curStation = new Radio();

        int actStation = curStation.setNmbStation(13);
        int expStation = 0;

        Assertions.assertEquals(expStation, actStation);
    }
}
