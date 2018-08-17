/**
 * In this package you will learn about the SOLID design-principles.
 *
 * Enjoy the course and feel free to contribute.
 */
package Liskov_Substitution;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class MainAlpha {

    public static void main(String[] args) {

        //  Create a new LampAlpha-object.
        LampAlpha myLamp = new LampAlpha();
        System.out.println(myLamp.getState());

        //  Appy a TriggerAlpha-object to the LampAlpha-object.
        TriggerAlpha myTrigger = new TriggerAlpha(myLamp);

        //  Play with the trigger.
        myTrigger.turnOn();
        System.out.println(myLamp.getState());
        myTrigger.turnOff();
        System.out.println(myLamp.getState());

    }

}
