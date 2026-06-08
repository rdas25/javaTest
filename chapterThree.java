import java.util.Scanner;

public class ChapterThree {

    public static void main(String[] args) {
        System.out.println(System.out);
        
        Scanner in = new Scanner(System.in);

        /*
        String line;
        line = in.nextLine();
        System.out.println(line);
        line = in.nextLine();
        System.out.println(line);
        

        int inch;
        double cm;
        System.out.print("Inches: ");
        inch = in.nextInt();
        cm = inch * 2.54;
        System.out.println("Centimeters: " + cm);

        final double CM_PER_INCH = 2.54; // constant variable, cannot be changed

        System.out.println(4.0 / 3.0);
        System.out.printf("%.3f\n", 4.0 / 3.0); // format to 3 decimal places, \n is the new line character

        double pi = 3.14159;
        int x = (int) pi; // type cast from double to int
        */

        int inches = 12;
        int feet = inches / 12;
        System.out.printf("%d inches = %d feet\n", inches, feet); // formatting syntax

        System.out.print("What is your age? ");
        int age = in.nextInt();
        in.nextLine(); // consume the newline character left by nextInt()
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }

}