import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testOnCountRadiostation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        Assertions.assertEquals(19, radio.getCurrentStation());
    }

    @Test
    public void testOnCountRadiostation60() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(59);
        Assertions.assertEquals(59, radio.getCurrentStation());
    }

    @Test
    public void testIfNotCountRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void ifNotCountButMoreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testOnNextAt7() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOnNextAt9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOnNextAt8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOnPrevAt1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOnPrevAt0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOnIncreaseAt100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOnIncreaseVolumeAt99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOnDecreaseVolumeAt0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOnDecreaseVolumeAt1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMinRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldMaxRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldMoreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldMoreMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldLessMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
