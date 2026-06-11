import java.util.Scanner;

public class ChapterFive {

    public static void printLogarithm(double x) {
        if (x <= 0.0) { // logarithm does not exist for non-positive numbers
            System.err.println("Error: x must be positive."); // OutputStream for error messages and warnings
            return; // exits the method immediately, preventing the rest of the code from executing
        }

        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }

    // StackOverflowError occurs when a method calls itself too many times without an exit condition

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2); // method calls itself before performing any operations, so the ouput is reversed which is helpful for converting to binary
            System.out.print(value % 2);
        }
    }
    
    public static void main(String[] args) {
        String fruit1 = "apple";
        String fruit2 = "banana";
        System.out.println(fruit1.equals(fruit2)); // uses equals method rather than operator
        System.out.println(fruit1 == fruit2); // uses operator rather than equals method

        // && means and
        // || means or
        // ! means not

        Scanner in = new Scanner(System.in);
        System.out.print("x: "); int x = in.nextInt();
        System.out.print("y: "); int y = in.nextInt();
        System.out.print("z: "); int z = in.nextInt();

        // logical operators only evaluate the second operand if necessary
        if (x < y && y < z) {
            System.out.println("x is less than y and y is less than z");
        }
        if (x < y || y < z) {
            System.out.println("x is less than y or y is less than z");
        }
        if (!(x < y) && !(y < z)) {
            System.out.println("x is not less than y and y is not less than z");
        }

        // use of if, else if, and else statements
        if (x < y) {
            System.out.println("x is less tha y");
        } else if (y < z) {
            System.out.println("y is less than z");
        } else {
            System.out.println("z is less than x");
        }

        boolean positiveFlag = (x > 0); // combines declaration, assignment, and comparison
        if (positiveFlag) {
            System.out.println("x is positive");
        } else if (!positiveFlag) {
            System.out.println("x is not positive");
        } else {
            System.out.println("x is zero");
        }


    }

}
