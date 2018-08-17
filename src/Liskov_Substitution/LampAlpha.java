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
class LampAlpha {

    private boolean myState;
    
    public LampAlpha() {
        this.myState = false;
    }

    public boolean getState() {
        return this.myState;
    }

    public void setState(boolean newState) {
        this.myState = newState;
    }

}
