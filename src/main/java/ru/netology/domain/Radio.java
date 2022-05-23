package ru.netology.domain;

    public class Radio {
        private int currentStation;
        private int currentVolume;

        public int getCurrentStation() {
            return currentStation;
        }

        public void setCurrentStation(int currentStation) {
            if (currentStation < 0) {
                return;
            }
            if (currentStation > 9) {
                return;
            }
            this.currentStation = currentStation;
        }

        public void next() {
            this.currentStation = currentStation + 1;
            if (currentStation == 10) {
                this.currentStation = 0;
            }
        }

        public void prev() {
            this.currentStation = currentStation - 1;
            if (currentStation == -1) {
                this.currentStation = 9;
            }
        }

        public void stationInput(int stationInput) {
            if (stationInput < 0) {
                return;
            }
            if (stationInput > 9) {
                return;
            }
            this.currentStation = stationInput;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentVolume(int currentVolume) {
            this.currentVolume = currentVolume;
        }

        public void increaseVolume() {

            if (currentVolume < 10) {
                currentVolume = currentVolume + 1;
            }
        }

        public void downVolume() {

            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
        }
    }


