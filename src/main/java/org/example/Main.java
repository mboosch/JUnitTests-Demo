package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(11%3 == 0);
    }

    public static boolean isLongerThan20(String str) {
        return str.length() > 20;
    }

    public static void checkString(String str) {
        if (isLongerThan20(str)) {
            System.out.println("The String is longer than 20.");
        } else {
            System.out.println("The String is not long enough.");
        }
    }
}