/**
 * In this package you will learn about the SOLID design-principles.
 *
 * Enjoy the course and feel free to contribute.
 */
package Liskov_CarDriver;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Car {

    public static int maxPS = 250;

    public int accelerate(int desiredPS) {
        if (desiredPS > maxPS) {
            throw new IllegalArgumentException("To much!");
        }
        return maxPS;
    }

}
