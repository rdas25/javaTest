import java.util.Scanner;

public class ChapterSeven {
    
    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }

    public static void printRowWhile(int n, int cols) {
        int i = 1;
        while (i <= cols) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printTable(int rows) {
        int i = 1;
        while (i <= rows) {
            printRowWhile(i, i); // printRow(i, rows) would print a full table
            i = i + 1;
        }
        System.out.println();
    }

    public static void printRowFor(int n, int cols) {
        // int i = 1; // prevents compiler error from printing i after the loop, but would need to make sure not to reinitialize i in the for loop
        for (int i = 1; i <= cols; i = i + 1) { // for loop version, easier to read, can use i ++ or i += 1
            System.out.printf("%4d", n * i);
        }
        // System.out.println(i);  // compiler error
    }

    public static void main(String[] args) {
        countdown(3);

        int i = 1;
        while (i <= 5) {
            System.out.println(i + "   " + Math.pow(i, 2));
            i = i + 1;
        }
        System.out.println(i);

        final double LOG2 = Math.log(2);
        i = 1;
        while (i <= 5) {
            System.out.println(i + "   " + Math.log(i) / Math.log(2)); // log base 2
            i = i + 1;
        }
        i = 1;
        while (i < 100) {
            double x = i;
            System.out.println(x + "   " + Math.log(x) / LOG2);
            i = i * 2; // powers of 2 and their logorithms
        }

        printTable(5);

        Scanner in = new Scanner(System.in);
        boolean okay;
        do {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                okay = true;
            } else {
                okay = false;
                String word = in.next();
                System.err.println(word + " is not a number");
            }
        } while (!okay); // continues until a number is entered
        double x = in.nextDouble();

        while (true) {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                break; // break out of the loop, does not require a boolean variable
            }
            String word = in.next();
            System.err.println(word + " is not a number");
        }
        x = in.nextDouble();

        int sum = 0;
        while (x != 0) {
            x  = in.nextInt();
            if (x <= 0) {
                continue; // skips negative numbers, moving on to the next iteration of the loop
            }
            System.out.println("Adding " + x);
            sum += x;
        }
        System.out.println(sum);

        sum = 0;
        while (x != 1) {
            x  = in.nextInt();
            if (x > 0) { // done without the continue statement
                System.out.println("Adding " + x);
                sum += x;            }
        }
        System.out.println(sum);
    }

}
