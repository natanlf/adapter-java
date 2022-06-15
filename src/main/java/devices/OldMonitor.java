package devices;

import interfaces.VGA;

public class OldMonitor implements VGA {
    @Override
    public void setImage(String image) {
        System.out.println("[OLD MONITOR - VGA] This is your video: " + image);
    }
}
