public class chapterTwo {

    public static void main(String[] args) {
        String firstMessage;
        int hour, minute;

        firstMessage = "Hello, World!";
        hour = 10; minute = 10;

        String language = "Java";

        System.out.println(firstMessage); // lowercase then uppercase
        System.out.print(hour + ":" + minute);

        System.out.println(" Total minutes: " + (hour * 60 + minute));

        System.out.println(10 / 3 + " " + -10 / 3); // rounds toward zero

        double floatingPoint = 10.0; // decimal point is correct style but not needed
        System.out.println(floatingPoint / 3 + " " + 10 / 3.0 + " " + floatingPoint / 3.0); // only one value needs to be a floating-point
        
        double zero = 1 / 3;
        System.out.println(zero); // equals zero because the values are both integers

        System.out.println(.1 * 10);
        System.out.println(.1 + .1 + .1 + .1 + .1 + .1 + .1 + .1 + .1 + .1); // equals .9999..., to avoid rounding error use integers
    
        System.out.println(1 + 2 + " Hello " + 1 + 2); // left to right, the first 1 + 2 is evaluated to 3, but not the second 1 + 2
    
        // int x = y + 1 correct
        // int x - 1 = y incorrect

        // compile-time error - syntax error, before the program is run
        // run-time error - interpreter is executing byte code and something goes wrong, after the program is run
        // logic error - program will compile and run, but it doesn't do what you intended
    }

}