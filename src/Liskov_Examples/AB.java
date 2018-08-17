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
public class AB {

    public static void main(String[] args) {

        //  Define two ElementA-variables.
        //  Initialize in the first one a ElementA-object.
        ElementA myElementA_A = new ElementA(2);
        System.out.println(myElementA_A);

        //  In the second, initialize a ElementB-object.
        ElementA myElementA_B = new ElementB(4);
        System.out.println(myElementA_B);

        //  Trying to initialize a ElementA-object in a
        //  ElementB-variables throws a error message.
        //  ElementB myElementB_A = new ElementA(1);
    }

}

class ElementA {

    int myElement;

    ElementA(int newInteger) {

        if (0 <= newInteger && newInteger <= 5) {
            this.myElement = newInteger;
        } else {
            throw new RuntimeException("Value '" + newInteger + "' not allowed.");
        }

    }

    @Override
    public String toString() {
        return "Element A = " + this.myElement;
    }

}

class ElementB extends ElementA {

    ElementB(int newInteger) {

        super(0);

        if (2 <= newInteger && newInteger <= 4) {
            super.myElement = newInteger;
        } else {
            throw new RuntimeException("Value '" + newInteger + "' not allowed.");
        }

    }

    @Override
    public String toString() {
        return "Element B = " + super.myElement;
    }

}
