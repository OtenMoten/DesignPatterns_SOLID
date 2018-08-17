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
public class Main {

    public static void main(String[] args) {

        String myString = "115";
        long myLong = 12L;

        System.out.println();
        System.out.println(Formulas.calcFibonacci(myString));
        System.out.println(Formulas.calcFibonacci(myLong));

    }
}
