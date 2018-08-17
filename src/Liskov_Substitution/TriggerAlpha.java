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
class TriggerAlpha {

    private final LampAlpha myLamp;

    public TriggerAlpha(LampAlpha newLamp) {
        this.myLamp = newLamp;
    }

    public void turnOn() {
        this.myLamp.setState(true);
    }

    public void turnOff() {
        this.myLamp.setState(false);
    }

}
