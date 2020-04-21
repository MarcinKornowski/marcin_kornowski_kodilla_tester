package com.kodilla.basic_assertion;

public class Aplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if(correctSum ) {
            System.out.println("Sum method works correctly for numbers " + a + " " + b + ".");
        } else {
            System.out.println("Sum method does not work correctly for numbers " + a + " " + b + ".");
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        if(correctSubtract) {
            System.out.println("Subtract method works correctly for numbers " + a + " " + b + ".");
        } else {
            System.out.println("Subtract method does not work correctly for numbers " + a + " " + b + ".");
        }

        int powerResult = calculator.power(a);
        boolean correctPower = ResultChecker.assertEquals(25, powerResult);
        if(correctPower) {
            System.out.println("Power method works correctly for numbers " + a + ".");
        } else {
            System.out.println("Power method does not work correctly for numbers " + a + ".");
        }


    }

}
