package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentRadio() {
        Radio rad = new Radio();

        rad.setCurrentRadio(4);

        int expected = 4;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioOver9() {
        Radio rad = new Radio();

        rad.setCurrentRadio(4);
        rad.setCurrentRadio(10);

        int expected = 4;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioMax() {
        Radio rad = new Radio();

        rad.setCurrentRadio(4);
        rad.setCurrentRadio(9);

        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadio8() {
        Radio rad = new Radio();

        rad.setCurrentRadio(4);
        rad.setCurrentRadio(8);

        int expected = 8;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioZero() {
        Radio rad = new Radio();

        rad.setCurrentRadio(4);
        rad.setCurrentRadio(0);

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadio1() {
        Radio rad = new Radio();

        rad.setCurrentRadio(4);
        rad.setCurrentRadio(1);

        int expected = 1;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioMinus() {
        Radio rad = new Radio();

        rad.setCurrentRadio(4);
        rad.setCurrentRadio(-1);

        int expected = 4;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    /*---------------------------------------------------------------------------------------------------------------------------------------*/
    @Test
    public void  testNextRadio () {
        Radio rad = new Radio();

        rad.setCurrentRadio(4);
        rad.nextRadio();

        int expected = 5;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  testNextRadio8 () {
        Radio rad = new Radio();

        rad.setCurrentRadio(8);
        rad.nextRadio();

        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  testNextRadio9 () {
        Radio rad = new Radio();

        rad.setCurrentRadio(9);
        rad.nextRadio();

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    /*---------------------------------------------------------------------------------------------------------------------------------------*/
    @Test
    public void  testPrevRadio1 () {
        Radio rad = new Radio();

        rad.setCurrentRadio(1);
        rad.prevRadio();

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  testPrevRadioMinus () {
        Radio rad = new Radio();

        rad.setCurrentRadio(-1);
        rad.prevRadio();

        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  testPrevRadioZero () {
        Radio rad = new Radio();

        rad.setCurrentRadio(0);
        rad.prevRadio();

        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    /*-------------------------------------------------------------------------------------------------------------------------------------*/

    @Test
    public void shouldCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeOver100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.setCurrentVolume(101);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume99() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.setCurrentVolume(99);

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentVolumeMinus() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.setCurrentVolume(-1);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.setCurrentVolume(1);

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
/*-----------------------------------------------------------------------------------------------------------------------------------------*/
    @Test
    public void increaseVolumeOver100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume50() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume99() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
/*-----------------------------------------------------------------------------------------------------------------------------------------*/
    @Test
    public void decreaseVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMinus() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}