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
    }
}