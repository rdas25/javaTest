public class ChapterNine {

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i --) {
            r = r + s.charAt(i);
        }
        return r;
    }

    public static String timeString(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12;  // midnight
            }
        } else {
            ampm = "PM";
            hour = hour - 12;
        }
        return String.format("%02d:%02d %s", hour, minute, ampm); // rather than printing like printf(), forma() just returns a string with the specified format
    }
    
    public static void main(String[] args) {
        String fruit = "banana"; // String is an object
        char letter = fruit.charAt(0); // charAt() is a method that returns the character at the specified index, which is a primitive type
        System.out.println(letter);

        if (letter == 'b') { // single quotes are used for character types
            System.out.println("The first letter is 'b'");
        } else {
            System.out.println("The first letter is not 'b'");
        }

        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c <= 'Z'; c ++) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i ++) { // Unicode + Greek version of Roman alphabet
            System.out.print((char) i); // type casting to convert the integer to a character
        }
        System.out.println();

        String name = "Alan Turing";
        System.out.println(name.toUpperCase()); // strings are immutable, so toUpperCase() returns a new string with all characters in uppercase
        
        for (int i = 0; i < fruit.length() - 1; i++) {
            System.out.print(fruit.charAt(i) + " + ");
        }
        System.out.println(fruit.charAt(fruit.length() - 1));

        for (char c : fruit.toCharArray()) { // enhanced for loop does not work on a string, so we convert the string to a character array using toCharArray() method
            System.out.println(c);
        }

        System.out.println(reverse("racecar"));

        System.out.println(fruit.substring(0));
        System.out.println(fruit.substring(0, 3));
        System.out.println(fruit.substring(6, 6));

        int index = fruit.indexOf('a'); // returns the index of the first occurrence of the specified character, which is 1
        System.out.println(index);
        index = fruit.indexOf('a', 2); // returns the index of the first occurrence of the specified character starting from the specified index, which is 3
        System.out.println(index);
        index = fruit.indexOf('a', 5); // if the starting index is the same as the first occurrence of the character, the starting index will be returned, which is 5
        System.out.println(index);

        // if the character is not found, indexOf() returns -1
        // substrings can also be found, "nan" would return 2

        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace";
        if (name1.equals(name2)) { // equals() method is used to compare the contents of two strings, while == operator compares the references of the strings
            System.out.println("The names are the same.");
        }

        int diff = name1.compareTo(name2); // returns the difference between the first characters that are different in the two strings 
        if (diff == 0) {
            System.out.println("The names are the same.");
        } else if (diff < 0) {
            System.out.println("name1 comes before name2.");
        } else if (diff > 0) {
            System.out.println("name2 comes before name1.");
        }

        // both equals() and compareTo() are case-sensitive

        // for each primitive type, there is a corresponding class in the Java library, called a wrapper class
        String str = "12345";
        int num = Integer.parseInt(str); // converts from string to integer
        num = 12345;
        str = Integer.toString(num); // converts from integer to string

        int max = Integer.MIN_VALUE;
        for (String arg : args) { // args is an array of strings that contains the command-line arguments passed to the program, so we can use an enhanced for loop to iterate through the array
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The max is " + max);
    }

}