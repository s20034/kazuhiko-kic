package main;
import devices.Device;
/**
 *
 * @author user
 */
public class Entry {

    public static void main(String[] args) {
////        System.out.println(Device.nrDevices);
//        Device ironer = new Device();
//        Device.addDevice();
////        Device.addDevice()++;
////        ironer.nrDevices++;
//        Device oven = new Device();
////        oven.nrDevices++;
//        Device.addDevice();
//
//        ironer.type = "HA";
//        ironer.manufacturer = "Panasonic";
////        ironer.voltage = "";
////        ironer.state = "Between";
//        System.out.println("For the ironer:");
//        System.out.println(ironer.type);
//        System.out.println(ironer.manufacturer);
//        System.out.println(ironer.voltage);
//        System.out.println(ironer.getState());
////        ironer.turnOn();    //ironaer.state = "on"
//        ironer.setState("on");
//        System.out.println("Number of devices: " + Device.getNrDevices());//ironer.nrDevices);
//
//        System.out.println("For the ironer:");
//        System.out.println(ironer.type);
//        System.out.println(ironer.manufacturer);
//        System.out.println(ironer.voltage);
//        System.out.println(ironer.getState());
//
//        oven.type = "HA";
//        oven.manufacturer = "zojirushi";
////        ironer.voltage = "";
////        ironer.state = "off";
//        System.out.println("For the oven:");
//        System.out.println(oven.type);
//        System.out.println(oven.manufacturer);
//        System.out.println(oven.voltage);
////        System.out.println(oven.state);
//        System.out.println(oven.getState());
//
////        int i = 5;
////        System.out.println(i);
////        i += 2;
////        System.out.println(i);
////        System.out.println(i--); //print 7 then make i=6
////        System.out.println(--i); //make i 5 then print it
////        System.out.println(i == 5 ? "Yes" : "No");

//        int i = 3; //1 -> 0000 0001  0000 0011 0000 0101
//        int j = 4; //0 -> 0000 0000  0000 0100 0000 0100
//                   //     0000 0001  0000 0111 0000 0101
//        int counter = 7;
//        System.out.println(i | j); // bit or is not add!!
//        System.out.println((i < 2) || (j > 1));
//        System.out.println(counter++);
//        System.out.println(++counter);

//        int counter =0;
//        while (counter < 10) {
//            System.out.println(counter++);
//        }

//        for(int counter = 0; counter < 10; ++counter) {
////        for(int counter = 10; counter > 0; --counter) {
////        for(int counter = 0; counter < 10; counter = counter + 2) {
//            System.out.println(counter);
//        }


        public static void printMsg(int myScore) {
            int myScore = 67;
            if(myScore >= 70){
                System.out.println("Excellent");
            } else if (myScore >= 60) {
                System.out.println("Pass");
            } else {
                System.out.println("fail");
            }
        }

    }

int range[0,7,12,15,4,12,23,9,0,60];
firstDivisor5(range);
for (int x = 0; x < 10; x++) {
    for (int y = 0; y < 5; y++) {
        System.out.priority
    }
}
//This code will display the first number in a range that accepts 5 as a divisor. 
        public int firstDivisor5(int[] integers){
            for(int index = 0; index < integers.length; index++){
                if((integers[index] % 5) == 0){
                    System.out.println(integers[index]);
                    break;
                }
            }
        }

}
