package com.elena;

public class FirstApp {

    public static void main(String[] args) {
        char symbol = 'a';
        byte aByte = 5; // -128...127

        short aShort = 10; // -32768...32767
        int aInt = 150;  // -2147483648...2147483647
        int bInt = 1580;
        long aLong = 12345L; // –9223372036854775808...9223372036854775807

        float aFloat = 1.111F;
        double aDouble = 7.123D;
        String name = "Human";

      // Plus and Minus
        System.out.println("byte + int = " + (aByte + aInt));
        System.out.println("int - double = " + (bInt - aDouble));
        System.out.println("short + float = " + (aShort + aFloat));
        System.out.println("double - float = " + (aDouble + aFloat));

        System.out.println();
        System.out.println();

        // Divide and multiply

        System.out.println("byte * float = " + aByte * aFloat);
        System.out.println("short * long = " + aShort * aLong);
        System.out.println("int * float = " + bInt * aFloat);

        System.out.println();

        System.out.println("byte / float = " + aByte / aFloat);
        System.out.println("short / long = " + aShort / aLong);
        System.out.println("int / float = " + bInt / aFloat);

        System.out.println();

        System.out.println("byte % int = " + (aByte % aInt));
        System.out.println("int % double = " + (bInt % aDouble));
        System.out.println("short % float = " + (aShort % aFloat));
        System.out.println("double % float = " + (aDouble % aFloat));
        System.out.println();


        // Max and Min
        int maxValueInt = Integer.MAX_VALUE + 1;
        int minValueInt = Integer.MIN_VALUE - 1;
        System.out.println(maxValueInt);
        System.out.println(minValueInt);
        System.out.println();

        int maxValueB = Byte.MAX_VALUE;
        int minValueB = Byte.MIN_VALUE;
        System.out.println(maxValueB + 1);
        System.out.println(minValueB - 1);
        System.out.println();

    }
}
