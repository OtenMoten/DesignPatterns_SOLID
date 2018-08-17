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
public class TriggerBeta {

    ITrigger myTrigger;

    public TriggerBeta(ITrigger newTrigger) {
        this.myTrigger = newTrigger;
    }

    public void on() {
        this.myTrigger.turnOn();
    }

    public void off() {
        this.myTrigger.turnOff();
    }

}
