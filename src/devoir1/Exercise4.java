package devoir1;

import java.awt.*;

/**
 * Created by Darius on 2/28/2017.
 */
public class Exercise4 {

    public static void main(String[] args) {
        System.out.println(distance(0,0,2,0));
        System.out.print(distance(new Point(0,0), new Point(2, 0)));
    }

    private static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    private static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}
