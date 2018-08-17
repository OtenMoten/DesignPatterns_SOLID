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
public class Main {

    public static void main(String[] args) {

        Driver fahrer = new Driver();
        String myClass;
        Car myCar;

        myCar = new Car();
        myClass = myCar.getClass().getSimpleName();
        System.out.println(myClass + ": "
                + fahrer.accelerate(myCar));

        myCar = new Porsche();
        myClass = myCar.getClass().getSimpleName();
        System.out.println(myClass + ": "
                + fahrer.accelerate(myCar));

        myCar = new Trabant();
        myClass = myCar.getClass().getSimpleName();
        System.out.println(myClass + ": "
                + fahrer.accelerate(myCar));

    }

}
