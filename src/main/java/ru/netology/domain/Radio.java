package ru.netology.domain;

    public class Radio {
        private int currentStation;
        private int minStation = 0;
        private int maxStation =9;

        private int currentVolume;
        private int minVolume = 0;
        private int maxVolume = 100;

        public Radio() { //конструктор без параметров, по умолчанию 0-9 станций
        }

        public Radio(int totalStation) {
            this.maxStation = totalStation - 1;
        }


        public int getCurrentStation() {
            return currentStation;
        }

        public void setCurrentStation(int currentStation) {
            if (currentStation < minStation) {
                return;
            }
            if (currentStation > maxStation) {
                return;
            }
            this.currentStation = currentStation;
        }

        public void next() {
            this.currentStation = currentStation + 1;
            if (currentStation > maxStation) {
                this.currentStation = minStation;
            }
        }

        public void prev() {
            this.currentStation = currentStation - 1;
            if (currentStation < minStation) {
                this.currentStation = maxStation;
            }
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentVolume(int currentVolume) {
            this.currentVolume = currentVolume;
        }

        public void increaseVolume() {
            this.currentVolume = currentVolume + 1;
            if (currentVolume > maxVolume) {
                this.currentVolume = maxVolume;
            }
        }

        public void downVolume() {
            this.currentVolume = currentVolume - 1;
            if (currentVolume < minVolume) {
                this.currentVolume = minVolume;
            }
        }
    }


