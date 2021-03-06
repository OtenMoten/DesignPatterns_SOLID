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
public class LampBeta implements ITrigger {

    private boolean myState = false;

    @Override
    public void turnOn() {
        this.myState = true;
    }

    @Override
    public void turnOff() {
        this.myState = false;
    }

    public boolean getState() {
        return this.myState;
    }

}
