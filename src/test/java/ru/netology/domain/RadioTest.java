package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setDefaultStation() {
        Radio model = new Radio();
        model.setCurrentStation(20);
        int expected = 0;
        assertEquals(expected, model.getCurrentStation());
    }

    @Test
    void setAnyNumberStations() {
        int totalStation = 20;
        Radio model = new Radio(totalStation);
        model.setCurrentStation(15);
        int expected = 15;
        assertEquals(expected, model.getCurrentStation());
    }

    @Test
    void borderNewRadio() {
        int totalStation = 20;
        Radio model = new Radio(totalStation);
        model.setCurrentStation(20);

        int expected = 0;
        int actual = model.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void borderNewRadioMin() {
        int totalStation = 20;
        Radio model = new Radio(totalStation);
        model.setCurrentStation(-1);

        int expected = 0;
        int actual = model.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void newRadioNextMax() {
        int totalStation = 20;
        Radio model = new Radio(totalStation);
        model.setCurrentStation(19);

        int expected = 0;
        model.next();

        assertEquals(expected, model.getCurrentStation());
    }

    @Test
    void newRadioPrevMin() {
        int totalStation = 20;
        Radio model = new Radio(totalStation);
        model.setCurrentStation(0);

        int expected = 19;
        model.prev();

        assertEquals(expected, model.getCurrentStation());
    }

    @Test
    void newRadioNext() {
        int totalStation = 20;
        Radio model = new Radio(totalStation);
        model.setCurrentStation(13);

        int expected = 14;
        model.next();

        assertEquals(expected, model.getCurrentStation());
    }

    @Test
    void newRadioPrev() {
        int totalStation = 20;
        Radio model = new Radio(totalStation);
        model.setCurrentStation(13);

        int expected = 12;
        model.prev();

        assertEquals(expected, model.getCurrentStation());
    }


    @Test
    void StationBorderMax() {
        Radio model = new Radio();
        model.setCurrentStation(10);

        int expected = 0;
        int actual = model.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void StationBorderMin() {
        Radio model = new Radio();
        model.setCurrentStation(-1);
        int expected = 0;
        int actual = model.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentStation() {
        Radio model = new Radio();
        model.setCurrentStation(0);

        int expected = 0;
        int actual = model.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextMax() {
        Radio model = new Radio();
        model.setCurrentStation(9);

        int expected = 0;
        model.next();

        assertEquals(model.getCurrentStation(), expected);
    }

    @Test
    void next() {
        Radio model = new Radio();
        model.setCurrentStation(7);

        int expected = 8;
        model.next();

        assertEquals(model.getCurrentStation(), expected);
    }

    @Test
    void prevMin() {
        Radio model = new Radio();
        model.setCurrentStation(0);

        int expected = 9;
        model.prev();

        assertEquals(model.getCurrentStation(), expected);
    }

    @Test
    void prev() {
        Radio model = new Radio();
        model.setCurrentStation(7);

        int expected = 6;
        model.prev();

        assertEquals(model.getCurrentStation(), expected);
    }

    @Test
    void getCurrentVolume() {
        Radio model = new Radio();
        model.getCurrentVolume();

        int expected = 0;
        int actual = model.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolume() {
        Radio model = new Radio();
        model.setCurrentVolume(100);

        int expected = 100;
        int actual = model.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeBorderMax() {
        Radio model = new Radio();
        model.setCurrentVolume(100);
        model.increaseVolume();

        int expected = 100;
        int actual = model.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    void increaseVolume() {
        Radio model = new Radio();
        model.setCurrentVolume(70);
        model.increaseVolume();

        int expected = 71;
        int actual = model.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    void downVolumeBorderMin() {
        Radio model = new Radio();
        model.setCurrentVolume(0);
        model.downVolume();

        int expected = 0;
        int actual = model.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    void downVolume() {
        Radio model = new Radio();
        model.setCurrentVolume(70);
        model.downVolume();

        int expected = 69;
        int actual = model.getCurrentVolume();

        assertEquals(actual, expected);
    }
}