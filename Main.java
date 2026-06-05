// Practice

public class Main {
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

        double floatingPoint = 10.0;
        System.out.println(floatingPoint / 3 + " " + 10 / 3.0 + " " + floatingPoint / 3.0); // only one value needs to be a floating-point
        
        double zero = 1 / 3;
        System.out.println(zero); // equals zero because the values are both integers
    }
}