import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChapterEight {

    public static void printArray(int[] a) {
        System.out.print("{");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length - 1] + "}");
    }

    public static int search(int[] a, int target) {
        for (int i = 0; i < a.length; i ++) {
            if (a[i] == target) {
                return i;
            }
        }
        return 404;
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] ++;
        numbers[2] = numbers[0] + numbers[1];

        int i = 0;
        while (i < 3) {
            System.out.println(numbers[i]);
            i ++;
        }

        for (i = 0; i < 3; i ++) {
            System.out.println(numbers[i]);
        }

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a); // the bracket represents array, the "I" represents integer, and the rest represents memory address

        printArray(a);
        System.out.println(Arrays.toString(a));

        int[] b = a;
        b[0] = 10; // this will change both b[0] and a[0] to 10 because a and b are referencing the same array in memory

        printArray(a);
        printArray(b);

        int[] c = new int[3];
        for (i = 0; i < 3; i ++) {
            c[i] = a[i];
        }
        c = Arrays.copyOf(a, 3); // the second parameter is the number of elements to copy
        
        printArray(c);

        int[] d = new int[a.length];
        for (i = 0; i < a.length; i++) { // generalized to work for any length array
            d[i] = a[i];
        }
        d = Arrays.copyOf(a, a.length);

        System.out.println(search(a, 6));

        int total = 0;
        for (i = 0; i < a.length; i ++) {
            total += a[i];
            System.out.printf("Sum %d: %d\n", i + 1, total);
        }

        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        
        for (i = 0; i < a.length; i ++) {
            a[i] = random.nextInt(input);
        }
        printArray(a);

        int[] counts = new int[10];
        int[] scores = randomArray(10);
        for (i = 0; i < counts.length; i ++) {
            counts[scores[i]] ++;
        }
        System.out.println(Arrays.toString(counts));

        for (int value : counts) {
            System.out.println(value);
        }

        counts = new int[100];
        for (int score : scores) { // enhanced for loop alows for more readable code
            counts[score] ++;
        }
    }
    
}
