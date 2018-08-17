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
public class PersonStudent {

    public static void main(String[] args) {

        Person myPerson = new Person(1975);
        Person myStudent = new Student(1910);

    }

}

class Person {

    private int myYear;

    Person(int newYear) {

        if (newYear < 1970) {
            throw new IllegalArgumentException("To young, nibba!");
        } else {
            this.myYear = newYear;
            System.out.println("The year '" + this.myYear + "'."
                    + " So, you can pass my nibba!");
        }

    }

}

class Student extends Person {

    Student(int newYear) {
        super(newYear);
    }

}
