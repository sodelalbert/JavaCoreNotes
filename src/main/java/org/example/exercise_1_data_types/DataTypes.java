package org.example.exercise_1_data_types;

import java.util.Scanner;

public class DataTypes {

    public static void PrimitiveDataTypes() {
        byte byteValue = 127;  // 1 byte, range: -128 to 127
        short shortValue = 32000;  // 2 bytes, range: -32,768 to 32,767
        int intValue = 100000;  // 4 bytes, range: -2^31 to 2^31-1
        long longValue = 10000000000L;  // 8 bytes, range: -2^63 to 2^63-1

        float floatValue = 10.5f;  // 4 bytes, single precision
        double doubleValue = 99.99;  // 8 bytes, double precision

        char charValue = 'A';  // 2 bytes, Unicode character
        boolean booleanValue = true;  // 1 bit, true or false

    }

    public static void ReferenceDataTypes() {
        String stringValue = "Hello, Java!";  // String object
        int[] arrayValue = {1, 2, 3, 4, 5};  // Array of integers
        char[] charArray = {'a', 'b', 'c'};  // Array of characters
    }

    public static void StringOperations() {
        String s = "Hello!";

        System.out.printf("Length: %d%n", s.length()); // 6
        System.out.printf("Index of 'l': %d%n", s.indexOf("l")); // 2

        System.out.printf("First character: %c%n", s.charAt(0)); // H
        System.out.printf("Replace 'H' with 'h': %s%n", s.replace("H", "h")); // hello!
        System.out.printf("Substring (0, 3): %s%n", s.substring(0, 3)); // Hel

        System.out.printf("Uppercase: %s%n", s.toUpperCase()); // HELLO!
        System.out.printf("Lowercase: %s%n", s.toLowerCase()); // hello!

    }

    public static void Casting() {

        // Expanding - Implicit Type Casting
        int a = 10;
        int b = a; // done automatically
        System.out.println(b);

        //Narrowing - Explicit Type Casting
        double c = 1;
        short d = (short) c;
        System.out.println(d);

    }

    public static void WrapperClassesForPrimitives() {
        /*
        Autoboxing: Automatic conversion of primitive data type to its corresponding wrapper class.
            int -> Integer
        Unboxing: Automatic conversion of wrapper class to its corresponding primitive data type.
            Integer -> int
         */

        int num = 10;
        Integer integer = num; // Autoboxing , Automatically converts int to Integer

        int int2 = integer; // Unboxing , Automatically converts Integer to int
        System.out.println("After unboxing: " + int2);

    }

    public static void ReadInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
//        int input = scanner.nextInt();
//        String input = scanner.nextLine();
        String input = scanner.next();

        System.out.println("You entered: " + input);

    }

}
