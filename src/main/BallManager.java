package main;
import tools.Ball;
/**
 *
 * @author user
 */
public class BallManager {

    public static void main(String[] args) {
        Ball ball1 = new Ball("Yellow", 1.0f, "Rubber", "Standstill");
        Ball ball2 = new Ball("Yellow", 1.0f, "Rubber", "Standstill");
        Ball ball3 = new Ball("Yellow", 1.0f, "Rubber", "Standstill");
        System.out.println(ball1.color);
        System.out.println(ball1.radius);
        System.out.println(ball1.material);
        System.out.println(ball1.status);
        System.out.println(ball1.nrBalls);
//        System.out.println(ball1.getNrBalls());

    }
}
