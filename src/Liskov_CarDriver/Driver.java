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
public class Driver {

    public int accelerate(Car mycar) {
        return mycar.accelerate(Car.maxPS);
    }

}
