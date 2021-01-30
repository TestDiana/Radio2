package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio samsung = new Radio();

    @Test
    public void shouldNextRadioStation() {
        int currentRadioStation = 9;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.nextRadioStation();
        assertEquals(0, samsung.getCurrentRadioStation());
    }



    @Test
    public void shouldNextRadioStation1() {
        int currentRadioStation = 5;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.nextRadioStation();
        assertEquals(6, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation2() {
        int currentRadioStation = 10;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.nextRadioStation();
        assertEquals(1, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouldPrewRadioStation() {
        int currentRadioStation = 0;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.prevRadioStation();
        assertEquals(9, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouldPrewRadioStation1() {
        int currentRadioStation = 9;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.prevRadioStation();
        assertEquals(8, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouldPrewRadioStation2() {
        int currentRadioStation = -1;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.prevRadioStation();
        assertEquals(9, samsung.getCurrentRadioStation());
    }

    @Test
    public void shouidSwitchRadioStation() {
        int currentRadioStation = 2;
        int radioStation =7;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.switchRadioStation(radioStation);
        assertEquals(7, samsung.getCurrentRadioStation());

    }

    @Test
    public void shouidSwitchRadioStation1() {
        int currentRadioStation = 2;
        int radioStation =10;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.switchRadioStation(radioStation);
        assertEquals(2, samsung.getCurrentRadioStation());

    }

    @Test
    public void shouidSwitchRadioStation2() {
        int currentRadioStation = 2;
        int radioStation =-1;
        samsung.setCurrentRadioStation(currentRadioStation);
        samsung.switchRadioStation(radioStation);
        assertEquals(2, samsung.getCurrentRadioStation());

    }

    @Test
    public void shouldSoundVolumePlus() {
        int soundVolume = 10;
        samsung.setSoundVolume(soundVolume);
        samsung.soundVolumePlus();
        assertEquals(10, samsung.getSoundVolume());
    }

    @Test
    public void shouldSoundVolumePlus1() {
        int soundVolume = 9;
        samsung.setSoundVolume(soundVolume);
        samsung.soundVolumePlus();
        assertEquals(10, samsung.getSoundVolume());
    }

    @Test
    public void shouldSoundVolumePlus2() {
        int soundVolume = 11;
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
