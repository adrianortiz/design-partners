package com.codizer.structural.composite.others;

public class Recursive {

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(recursiveFactorial(3));
    }

    public static int factorial(int number) {
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total = total * i;
        }
        return total;
    }

    public static int recursiveFactorial(int number) {
        if (number > 1) {
            return number * factorial(number-1);
        } else {
            return 1;
        }
    }
}
