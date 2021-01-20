package devices;
/**
 *
 * @author user
 */
public class Device {

    private static int nrDevices = 0;

    public String type = "";
    public String manufacturer = "";
    public int voltage = 110;
//    public String state = "off";
    private String state = "off";

    public Device(String type, String manufacturer, int voltage, String state) { //source - format
        this();
        this.type = type;
        this.manufacturer = manufacturer;
        this.voltage = voltage;
        this.state = state;
    }

    public Device() {
        nrDevices++;
    }

    public void setState(String newState) {
        if(newState.equals("on") || newState.equals("off")) {
            state = newState;
        }
    }

//    public void turnOn() {
//        state = "on";
//    }
//
//    public void turnOff() {
//        state = "off";
//    }

    public String getState(){
        return state;
    }

//    public static void increaseInstances(){
//        nrDevices++;
//    }

    public static int addDevice(){
       return nrDevices++;
    }

    public static int getNrDevices(){
        return nrDevices;
    }
}
