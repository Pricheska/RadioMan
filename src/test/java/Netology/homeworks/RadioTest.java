package Netology.homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void ShouldIncreaseVolume() {
        Radio increase = new Radio();
        increase.Volume = 7;
        increase.increaseVolume();

        int expected = 8;
        int actual = increase.Volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseChannel() {
        Radio increaseChannel = new Radio();
        increaseChannel.Channel = 0;
        increaseChannel.increaseChannel();

        int expected = 1;
        int actual = increaseChannel.Channel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseVolume() {
        Radio decreaseVolume = new Radio();
        decreaseVolume.Volume = 1;
        decreaseVolume.decreaseVolume();

        int expected = 0;
        int actual = decreaseVolume.Volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseChannel() {
        Radio decreaseChannel = new Radio();
        decreaseChannel.Channel = 1;
        decreaseChannel.decreaseChannel();

        int expected = 0;
        int actual = decreaseChannel.Channel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseChannelIfZero() {
        Radio decreaseChannelifZero = new Radio();
        decreaseChannelifZero.Channel = 0;
        decreaseChannelifZero.decreaseChannel();

        int expected = 9;
        int actual = decreaseChannelifZero.Channel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCycleChannelIfMax() {
        Radio radio = new Radio();
        radio.Channel = 9;
        radio.increaseChannel();

        int expected = 0;
        int actual = radio.Channel;

        Assertions.assertEquals(expected, actual);

    }
}