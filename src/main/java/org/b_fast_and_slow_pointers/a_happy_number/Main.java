package org.b_fast_and_slow_pointers.a_happy_number;

public class Main {
    public static void main(String[] arg) {
        int[] a = {1, 5, 19, 25, 7};
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + 1 + "." + "\tInput Number:" + a[i]);
            System.out.println("\tSum of squared digits: " + sumOfSquaredDigits(a[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

    public static String printStringWithMarkers(String strn, int pValue) {
        String out = "";
        for (int i = 0; i < pValue; i++) {
            out += String.valueOf(strn.charAt(i));
        }
        out += "«";
        out += String.valueOf(strn.charAt(pValue)) + "»";
        for (int i = pValue + 1; i < strn.length(); i++) {
            out += String.valueOf(strn.charAt(i));
        }
        return out;
    }
    public static int sumOfSquaredDigits(int number) {
        int totalSum = 0;
        System.out.println("\tCalculating the sum of squared digits");
        System.out.println("\tTotal sum: " + totalSum);
        int i = 1;
        while (number > 0) {
            System.out.println("\tLoop iteration: " + i);
            int a = String.valueOf(number).length();
            System.out.println("\t\tNumber:  " + number);
            int digit = number % 10;
            System.out.println("\t\tWe will start with the last digit of the number " + digit);
            System.out.println("\t\t" + printStringWithMarkers(String.valueOf(number), a - 1) + " ⟶ Last Digit: " + digit);
            System.out.println("\t\tUpdating number ⟶ number/10 = " + number + "/10");
            number = number / 10;
            System.out.println("\t\t\t\tThe number is now: " + number);
            System.out.println("\t\t\tTotal sum + square of the digit = " + totalSum + " + " + digit + " * " + digit + " = " + digit);
            totalSum += (Math.pow(digit, 2));
            i = i + 1;
        }
        return totalSum;
    }
}