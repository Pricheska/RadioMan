package Netology.homeworks;

public class Radio {
    protected int volume;
    protected int channel;

    protected int getCurrentChannel() {
        return channel;
    }

    protected void setCurrentChannel(int newChannel) {
        if (newChannel > 9) {
            return;
        }
        if (newChannel < 0) {
            return;
        } else {
            channel = newChannel;
        }
    }

    protected int maxVolume = 10;
    protected int minVolume = 0;
    protected int maxChannel = 9;
    protected int minChannel = 0;

    public void increaseVolume() {
        boolean Volume;
        if (volume < maxVolume) {
            volume += 1;
        } else {
            volume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume -= 1;
        }
    }

    public void increaseChannel() {
        if (channel < maxChannel) {
            channel += 1;
        } else {
            channel = minChannel;
        }
    }

    public void decreaseChannel() {
        if (channel > minChannel) {
            channel -= 1;
        } else {
            channel = maxChannel;
        }
    }
}



