package devices;

import interfaces.HDMI;

public class TV implements HDMI {
    @Override
    public void setImage(String image) {
        System.out.println("[TV - HDMI] This is your video: " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("[TV - HDMI] This is your sound: " + sound);
    }
}
