import java.awt.Point;
import java.awt.Rectangle;

public class ChapterTen {

    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static double distance(Point p1, Point p2) { // takes two Points as parameters instead of four doubles
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static Point findCenter(Rectangle box) { // finds the center of the box
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    public static void moveRect(Rectangle box, int dx, int dy) { // generalizing the code to move the rectangle by any amount
        box.x = box.x + dx;
        box.y = box.y + dy;
    }
    
    public static void main(String[] args) {
        Point blank;
        blank = new Point(3, 4); // parameters can only be integers, not doubles
        System.out.println(blank.x + ", " + blank.y);

        double distance = Math.sqrt(blank.x * blank.x + blank.y * blank.y); // sqaure root has to be a double
        System.out.println((int) distance);

        printPoint(blank);
        printPoint(new Point(3, 4));
        System.out.println(blank); // prints java.awt.Point[x = 3,y = 4]

        System.out.println(distance(blank, blank)); // distance from a point to itself is 0

        Rectangle box = new Rectangle(0, 0, 100, 200);
        System.out.println(box); // prints java.awt.Rectangle[x = 0, y = 0, width = 100, height = 200]

        // moving the rectangle
        box = new Rectangle(0, 0, 100, 200);
        box.x = box.x + 50;
        box.y = box.y + 100;

        moveRect(box, 50, 100);
        System.out.println(box);

        box.translate(50, 100);

        Rectangle box1 = new Rectangle(0, 0, 100, 200);
        Rectangle box2 = box1;
        System.out.println(box2.width);
        box1.grow(50, 50);
        System.out.println(box2.width); // change made to box1 also changes box2 because they refer to the same object in memory
        
        blank = null; // garbage collection, as program runs, the system automatically looks for stranded objects and reclaims them, then the space can be reused for new objects
        int x = blank.x; // NullPointerException because blank does not refer to any object in memory

        // it is legal to pass a null reference as an argument or receive one as a return value

        
    }

}
