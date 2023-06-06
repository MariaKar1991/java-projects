package chapter11;


/**
 *  {@link Point} driver class.
 */
public class PointApp {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1, 2);
        Point p3 = new Point();

        p3.setX(7);
        p3.setY(12);

        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Point 3: (" + p3.getX() + ", " + p3.getY() + ")");
    }
}
