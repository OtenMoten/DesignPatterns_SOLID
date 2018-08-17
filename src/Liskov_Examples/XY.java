/**
 * In this package you will learn about the SOLID design-principles.
 *
 * Enjoy the course and feel free to contribute.
 */
package Liskov_Examples;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class XY {

    public static void main(String[] args) {

        //  Create a array that is type of elementX that
        //  has two memory-spaces.
        ElementX[] myElementX = new ElementX[2];

        //  In the first memory-space we will put a ElementX-object.
        myElementX[0] = new ElementX();
        //  In the second memory-space we will put a ElementY-object.
        myElementX[1] = new ElementY();

        //  Loop through the ElementX-array.s
        for (ElementX element : myElementX) {
            element.doSomething();
        }

    }

}

class ElementX {

    void doSomething() {
        System.out.println("I do something ...");
    }
}

class ElementY extends ElementX {

    @Override
    void doSomething() {
        System.out.println("I do something else ...");
    }
}
