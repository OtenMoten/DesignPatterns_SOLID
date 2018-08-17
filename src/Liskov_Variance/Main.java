/**
 * In this package you will learn about the SOLID design-principles.
 *
 * Enjoy the course and feel free to contribute.
 */
package Liskov_Variance;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main {

    public static void main(String[] args) {

        Person myPerson = new Person();
        Person myStudent = new Student();

        Book myBook;
        Document myDocument;

        //  This is "in-variance".
        //  This means that a parent-variable is applied to the return-value of
        //  another parent-object. In this case the parent-object is
        //  "myPerson". Therefore, the child-objects are
        //  "myBook" and "myStudent". Examine the structure of this package to
        //  get a full understanding what this means.
        myBook = myPerson.write(new Book("Person-Fishing"));
        myBook = myStudent.write(new Book("Student-Fishing"));

        //  This is "co-variance".
        //  This means a type-casting will appear when applying the
        //  new Book-object to the myDocument-object.
        //  Additionally, the hierarchie is conform because of
        //  Document    <--     Book
        //  Person      <--     Student
        myDocument = myPerson.write(new Book("Person-Fishing"));
        myBook = myStudent.write(new Book("Student-Fishing"));

        //  This is "contra-variance".
        //  A child-object is getting a retrn-value from a parent-object.
        //  In this case, myBook-object get's it value from myPerson-object and
        //  the myDocument-object get's it value from myStudent-object.
        myBook = myPerson.write(new Book("Person-Fishing"));
        myDocument = myStudent.write(new Book("Student-Fishing"));

        myPerson.read(myDocument);
        myPerson.read(myBook);
        myStudent.read(myDocument);
        myStudent.read(myBook);

    }

}
