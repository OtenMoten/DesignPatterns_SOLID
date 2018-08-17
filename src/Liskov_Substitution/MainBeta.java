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
public class MainBeta {

    public static void main(String[] args) {

        TV myTV = new TV();
        LampBeta myLamp = new LampBeta();
        //  Apply the myLamp-object to the myTrigger-object.
        TriggerBeta myTrigger = new TriggerBeta(myLamp);

        //  Get the state of myLamp-object.
        //  Initially, it's off (false).
        System.out.println(myLamp.getState());
        //  Turn it on.
        myTrigger.on();
        System.out.println(myLamp.getState());
        System.out.println();

        //  Get the state of the myTV-object. 
        //  Initially, it's off (false).
        System.out.println(myTV.getState());
        //  Apply the myTV-object to tge same myTrigger-object as above.
        myTrigger = new TriggerBeta(myTV);
        //  Turn it on.
        myTrigger.on();
        System.out.println(myLamp.getState());

    }
}
