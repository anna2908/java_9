import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RadioTest {


    @Test
    public void newRadio1() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.getCountStation();

        assertEquals(expected, actual);
    }

    @Test
    public void newRadio2() {
        Radio radio = new Radio(15);

        int expected = 15;
        int actual = radio.getCountStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest1() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(150);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}