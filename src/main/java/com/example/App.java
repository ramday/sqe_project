package com.example;

/**
 * Advanced Calculator with additional functionalities.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sum of 2.5 and 3.5: " + add(2.5, 3.5));
        System.out.println( "Difference of 5.7 and 3.2: " + subtract(5.7, 3.2));
        System.out.println( "Product of 4.5 and 2: " + multiply(4.5, 2));
        System.out.println( "Quotient of 10 and 3: " + divide(10, 3));
        System.out.println( "Exponentiation of 2 raised to 3: " + power(2, 3));
        System.out.println( "Square root of 25: " + sqrt(25));
    }

    /**
     * Adds two numbers.
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     * @param a the first number
     * @param b the second number
     * @return the difference of a and b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     * @param a the numerator
     * @param b the denominator
     * @return the quotient of a and b
     * @throws IllegalArgumentException if dividing by zero
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Raises a number to a given power.
     * @param base the base number
     * @param exponent the exponent
     * @return base raised to the power of exponent
     */
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Calculates the square root of a number.
     * @param number the number
     * @return the square root of the number
     * @throws IllegalArgumentException if the number is negative
     */
    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot take the square root of a negative number");
        }
        return Math.sqrt(number);
    }
}
