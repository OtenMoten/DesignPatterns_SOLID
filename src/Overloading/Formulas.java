/**
 * In this package you will learn about the SOLID design-principles.
 *
 * Enjoy the course and feel free to contribute.
 */
package Overloading;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.math.BigInteger;

public class Formulas {

    public static long calcFibonacci(long newLong) {

        System.out.println("I'm a native-long calculator.");

        long firstNumber = 1;
        long lastNumber = 1;
        int iterator = 1;

        while (iterator++ < newLong) {

            long myLong = lastNumber + firstNumber;

            firstNumber = lastNumber;
            lastNumber = myLong;

        }

        return lastNumber;

    }

    public static String calcFibonacci(String newString) {

        System.out.println("I'm a String calculator.");

        int iterator = 1;
        int myInt = Integer.parseInt(newString);

        BigInteger firstNumber = new BigInteger(String.valueOf(1));
        BigInteger lastNumber = firstNumber;

        while (iterator < myInt) {

            BigInteger tmp = lastNumber.add(firstNumber);
            firstNumber = lastNumber;
            lastNumber = tmp;
            iterator++;

        }

        return lastNumber.toString();

    }

}
