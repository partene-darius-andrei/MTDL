package devoir1;

import java.awt.*;

/**
 * Created by Darius on 2/28/2017.
 */
public class Geom {
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public static double triangleSemiPerimeter(Point a, Point b, Point c) {
        double distanceA = distance(c, b);
        double distanceB = distance(a, c);
        double distanceC = distance(a, b);
        return (distanceA + distanceB + distanceC) / 2;
    }

    public static double triangleArea(Point a, Point b, Point c) {

        double s = triangleSemiPerimeter(a, b, c);
        double distanceA = distance(c, b);
        double distanceB = distance(a, c);
        double distanceC = distance(a, b);
        return Math.sqrt(s * (s - distanceA) * (s - distanceB) * (s - distanceC));
    }

    public static double rectanglePerimeter(Point a, Point b) {
        double side1 = distance(a, new Point(b.x, a.y));
        double side2 = distance(a, new Point(a.x, b.y));
        return side1 * 2 + side2 * 2;
    }

    public static double rectangleArea(Point a, Point b) {
        double side1 = distance(a, new Point(b.x, a.y));
        double side2 = distance(a, new Point(a.x, b.y));
        return side1 * side2;
    }

}
