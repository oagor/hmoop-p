package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    void shouldSetStationInRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationAboveRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextFromMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldNextFromNineToZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPrevFromMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldPrevFromZeroToNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSetVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeAboveRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        Assertions.assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}