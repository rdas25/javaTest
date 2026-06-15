public class ChapterSix {

    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result; // can be shortened to: return Math.PI * radius * radius; 
    }

    public static double absoluteValue(double x) {
        if (x < 0) { // multiple return statements are possible, but only one will be executed
            return -x;
        } else {
            return x;
        }
    }

    // Javadoc
    /**
    * Tests whether x is a single digit integer.
    *
    * @param x the integer to test
    * @return true if x has one digit, false otherwise
    */
    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) { // can be shortened to: return (x > -10 && x < 10);
            return true;
        } else {
            return false;
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        int recurse = factorial(n - 1);
        return n * recurse;
    }

    // every possible path must reach a return statement, else the compiler will complain
    // methods can have the same name as long as they have different parameter lists (overloading)

    public static void main(String[] args) {
        if (isSingleDigit(5)) {
            System.out.printf("%d is small\n", 5);
        } else {
            System.out.printf("%d is big\n", 5);
        }

        System.out.println(factorial(3));
    }

}
