package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int maxRadioStation;
    private int minRadioStation;
    private int soundVolume;
    private int maxSoundVolume;
    private int minSoundVolume;

    public Radio() {

        this.maxRadioStation = 10;
        this.minRadioStation = 0;
        this.maxSoundVolume = 100;
        this.minSoundVolume = 0;
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

