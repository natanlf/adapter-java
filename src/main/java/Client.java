import adapters.HDMIToVGAAdapter;
import devices.Computer;
import devices.OldMonitor;
import devices.TV;

public class Client {
    public static void main(String[] args) {

        System.out.println("Computer one");
        System.out.println("TV has HDMI");
        Computer pc = new Computer();
        TV tv = new TV(); //TV has HDMI
        pc.connectPort(tv);
        pc.sendImageAndSound("Image action movie", "Sound action movie");

        System.out.println("----------------------------------------------------------");

        System.out.println("Computer two");
        System.out.println("Monitor has not HDMI, only VGA is available");
        Computer pc2 = new Computer();
        OldMonitor monitor = new OldMonitor(); //Monitor has not HDMI, only VGA is available
        pc2.connectPort(new HDMIToVGAAdapter(monitor)); //Connecting vga on adapter and then on port
        pc2.sendImageAndSound("Image action movie", "Sound action movie");
    }
}
