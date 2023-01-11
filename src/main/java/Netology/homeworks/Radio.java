package Netology.homeworks;

public class Radio {
    public int Volume;
    public int Channel;

    protected int maxVolume = 10;
    protected int minVolume = 0;
    protected int maxChannel = 9;
    protected int minChannel = 0;

    public void increaseVolume() {
        if (Volume < maxVolume) {
            Volume += 1;
        }
    }

    public void decreaseVolume() {
        if (Volume > minVolume) {
            Volume -= 1;
        }
    }

    public void increaseChannel() {
        if (Channel < maxChannel) {
            Channel += 1;
        } else {
            Channel = minChannel;
        }
    }

    public void decreaseChannel() {
        if (Channel > minChannel) {
            Channel -= 1;
        } else {
            Channel = maxChannel;
        }
    }
}



