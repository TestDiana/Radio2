package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int soundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public Radio(int currentRadioStation, int maxRadioStation, int minRadioStation, int soundVolume, int maxSoundVolume, int minSoundVolume) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.soundVolume = soundVolume;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void nextRadioStation() {
        int currentRadioStation = this.getCurrentRadioStation();
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void prevRadioStation() {
        int currentStation = this.getCurrentRadioStation();
        if (currentStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void switchRadioStation(int RadioStation) {
        if (RadioStation > maxRadioStation) {
            return;
        }
        if (RadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = RadioStation;
    }


    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > maxSoundVolume)
            return;
        if (soundVolume < minSoundVolume)
            return;
        this.soundVolume = soundVolume;
    }

    public void soundVolumePlus () {
        int currentVolume = this.getSoundVolume();
        if (currentVolume >= maxSoundVolume) {
            return;
        }
        this.soundVolume++;
    }

    public void soundVolumeMinus () {
        int currentVolume = this.getSoundVolume();
        if (currentVolume <= minSoundVolume) {
            return;
        }
        this.soundVolume--;
    }
}

