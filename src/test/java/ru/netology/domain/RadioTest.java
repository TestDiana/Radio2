package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio samsung = new Radio();

    @Test
    public void shouldNextRadioStation() {
        int currentRadioStation = 10;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.nextRadioStation();
        assertEquals(0, samsung.getCurrentRadioStation());
    }



    @Test
    public void shouldNextRadioStation1() {
        int currentRadioStation = 11;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.nextRadioStation();
        assertEquals(1, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation2() {
        int currentRadioStation = 5;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.nextRadioStation();
        assertEquals(6, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        int currentRadioStation = 0;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.prevRadioStation();
        assertEquals(10, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation1() {
        int currentRadioStation = 9;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.prevRadioStation();
        assertEquals(8, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation2() {
        int currentRadioStation = -1;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.prevRadioStation();
        assertEquals(10, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchRadioStation() {
        int currentRadioStation = 2;
        int radioStation =7;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.switchRadioStation(radioStation);
        assertEquals(7, samsung.getCurrentRadioStation());

    }

    @Test
    public void shouldSwitchRadioStation1() {
        int currentRadioStation = 2;
        int radioStation =10;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.switchRadioStation(radioStation);
        assertEquals(10, samsung.getCurrentRadioStation());

    }

    @Test
    public void shouldSwitchRadioStation2() {
        int currentRadioStation = 2;
        int radioStation =-1;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.switchRadioStation(radioStation);
        assertEquals(2, samsung.getCurrentRadioStation());

    }

    @Test
    public void shouldSwitchRadioStation3() {
        Radio samsung = new Radio();
        int currentRadioStation = 2;
        int radioStation =13;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.switchRadioStation(radioStation);
        assertEquals(2, samsung.getCurrentRadioStation());

    }

    @Test
    public void shouldSoundVolumePlus() {
        int soundVolume = 100;
        samsung.setSoundVolume(soundVolume);
        samsung.soundVolumePlus();
        assertEquals(100, samsung.getSoundVolume());
    }

    @Test
    public void shouldSoundVolumePlus1() {
        int soundVolume = 99;
        samsung.setSoundVolume(soundVolume);
        samsung.soundVolumePlus();
        assertEquals(100, samsung.getSoundVolume());
    }

    @Test
    public void shouldSoundVolumePlus2() {
        int soundVolume = 11;
        samsung.setSoundVolume(soundVolume);
        samsung.soundVolumePlus();
        assertEquals(12, samsung.getSoundVolume());
    }

    @Test
    public void shouldSoundVolumePlus3() {
        int soundVolume = 101;
        samsung.setSoundVolume(soundVolume);
        samsung.soundVolumePlus();
        assertEquals(1, samsung.getSoundVolume());
    }


    @Test
    public void shouldSoundVolumeMinus() {
        int soundVolume = 10;
        samsung.setSoundVolume(soundVolume);
        samsung.soundVolumeMinus();
        assertEquals(9, samsung.getSoundVolume());
    }

    @Test
    public void shouldSoundVolumeMinus1() {
        int soundVolume = 0;
        samsung.setSoundVolume(soundVolume);
        samsung.soundVolumeMinus();
        assertEquals(0, samsung.getSoundVolume());
    }

    @Test
    public void shouldSoundVolumeMinus2() {
        int soundVolume = -1;
        samsung.setSoundVolume(soundVolume);
        samsung.soundVolumeMinus();
        assertEquals(0, samsung.getSoundVolume());
    }



}
