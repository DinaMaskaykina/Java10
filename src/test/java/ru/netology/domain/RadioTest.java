package ru.netology.domain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void StationBorderMin() {
        Radio model = new Radio();
        model.setCurrentStation(-1);
        int expected = 0;
        int actual = model.getCurrentStation();
        assertEquals(expected, actual);
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
    void getCurrentStation() {
        Radio model = new Radio();
        model.setCurrentStation(5);

        int expected = 5;
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
    void stationInput() {
        Radio model = new Radio();
        model.stationInput(7);

        int expected = 7;
        int actual = model.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    void stationInputMin() {
        Radio model = new Radio();
        model.stationInput(-1);

        int expected = 0;
        int actual = model.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    void stationInputMax() {
        Radio model = new Radio();
        model.stationInput(10);

        int expected = 0;
        int actual = model.getCurrentStation();

        assertEquals(actual, expected);
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
        model.setCurrentVolume(5);

        int expected = 5;
        int actual = model.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeBorderMax() {
        Radio model = new Radio();
        model.setCurrentVolume(10);
        model.increaseVolume();

        int expected = 10;
        int actual = model.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    void increaseVolume() {
        Radio model = new Radio();
        model.setCurrentVolume(7);
        model.increaseVolume();

        int expected = 8;
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
        model.setCurrentVolume(3);
        model.downVolume();

        int expected = 2;
        int actual = model.getCurrentVolume();

        assertEquals(actual, expected);
    }
}