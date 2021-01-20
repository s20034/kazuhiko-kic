package tools;


/**
 *
 * @author user
 */
public class Ball {

    public static int nrBalls = 0;

    public Ball() {
        Ball.nrBalls++;
    }
//    public Ball(String color, float radius, String material, String status) {
//        Ball.nrBalls++;
//        this.color = color; //color = color;
//        this.radius = radius;
//        this.material = material;
//        this.status = status;
//    }

    public Ball(String defcolor, float defradius, String defmaterial, String defstatus) {
        this();
        this(defColor);
        color = defcolor; //color = color;
        radius = defradius;
        material = defmaterial;
        status = defstatus;
    }

    public Ball(String defColor) {
        this();
        color = defColor;
    }

    //Fields
    public String color = "";       //The color of the ball
    public float radius = 0.0f;     //How big is the ball
    public String material = "";    //What is the ball made from
    public String status = "";      //What is the ball doing.

    //Class Ball has 4 methods
//    public void bounce(byte times){
//        for(byte counter = 0; counter < times; counter++) {
    public void bounce(int times){
        for(int x = 0; x < times; x++) {
            System.out.println("bouncing...");
        }
    }

    public static int getNrBalls(){
        return nrBalls;
    }

    public void roll(){
        System.out.println("rolling...");
        status = "rolling";
    }

//    public void stop() {
//        System.out.println("stopping...");
//        status = "Not moving";
//    }
    public void stop() {
        System.out.println("Stopped");
        status = "Stopped";
    }

    public void inflate(float amount) {
        System.out.println("inflating...");
        radius += amount;
    }

}

/*
public class Shape {
}
*/
class Shape {

}
