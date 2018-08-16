/**
 * In this package you will learn about the SOLID design-principles.
 *
 * Enjoy the course and feel free to contribute.
 */
package Liskov;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Converter {

    public static void main(String[] args) {

        FormattingConverter printer = new FormattingConverter();
        System.out.println(printer.convert(200.70));

    }

}

abstract class ConverterMilesToKilometer {

    double myFactor = 0.6214d;

    double convert(double miles) {
        return miles * this.myFactor;
    }

}

class FormattingConverter extends ConverterMilesToKilometer {

    @Override
    double convert(double newMiles) {

        if (newMiles < 0) {
            throw new RuntimeException("The count of the miles are less than 0.");
        }

        return super.convert(newMiles);

    }

}
