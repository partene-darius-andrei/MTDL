package devoir1;
import java.awt.*;

/**
 * Created by Darius on 2/28/2017.
 */
public class Exercise7 {

    public static void main(String[] args) {
        System.out.println("Rectangle perimeter: " + Geom.rectanglePerimeter(new Point(0,0), new Point(2, 2)));

        System.out.println("Rectangle area: " + Geom.rectangleArea(new Point(0,0), new Point(2, 2)));

        System.out.println("Triangle area: " + Geom.triangleArea(new Point(0, 0), new Point(5, 0), new Point(3, 3)));

    }
}
