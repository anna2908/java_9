public class Radio {
    private int currentStation;
    private int countStation;  //количество радиостанций
    private int currentVolume;


    public Radio() {
        countStation = 10;
    }

    public Radio(int size) {
        countStation = size;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCountStation() {
        return countStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > countStation - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        currentStation = (currentStation + 1) % countStation;
    }

    public void prevStation() {
        currentStation = currentStation - 1;
        if (currentStation == -1) {
            currentStation = countStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
