/**
 * In this package you will learn about the SOLID design-principles.
 *
 * Enjoy the course and feel free to contribute.
 */
package Liskov_Interheritance_Substitutability;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class XY {

    public static void main(String[] args) {
        //Client
        X[] x = new X[2];
        x[0] = new X();
        x[1] = new Y();
        for (X o : x) {
            o.machWas();
        }

    }

}

class X {

    void machWas() {
        System.out.println("mach was");
    }
}

class Y extends X {

    void machWas() {
        System.out.println("ich mach ja was");
    }
}
