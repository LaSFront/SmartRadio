package ru.netology.smart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCheckNumberOfMaxStation() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation2() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation3() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation4() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation5() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation6() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(10);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseNextStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(8);

        int expected = 9;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseNextStation2() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);

        int expected = 0;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseNextStation3() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoosePrevStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoosePrevStation2() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(0);

        int expected = 9;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoosePrevStation3() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(1);

        int expected = 0;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radioV = new Radio();

        radioV.setCurrentVolume(99);

        int expected = 99;
        int actual = radioV.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetHigherVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 100;
        int actual = radio.higherVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetHigherVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.higherVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetHigherVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.higherVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLowerVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.lowerVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLowerVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.lowerVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLowerVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 0;
        int actual = radio.lowerVolume();

        Assertions.assertEquals(expected, actual);
    }
}

