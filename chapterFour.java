import java.util.Scanner;

public class ChapterFour {

    public static void newLine() {
        System.out.println("Hello, world!");
    }

    public static void print_name(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void time(int hour, int minute) {
        System.out.printf("%d : %d\n", hour, minute);
    }

    public static void main(String[] args) {
        /*
        double root = Math.sqrt(4);
        System.out.println(root);

        double radians = Math.toRadians(180.0);
        double degrees = Math.toDegrees(Math.PI);
        System.out.printf("%.2f radians = %.2f degrees\n", radians, degrees);

        System.out.println(Math.exp(Math.log(Math.E)));
        System.out.println((int) Math.pow(2, 3));
        */

        newLine();

        Scanner in = new Scanner(System.in);
        System.out.print("Name pls: ");
        String name = in.nextLine();
        print_name(name);

        time(12, 12);
    }

}