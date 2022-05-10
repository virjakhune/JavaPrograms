package May2022;

/**Program of constructor overloading
 * 06-05-2022
 * Author: virja khune
 */

public class VehicleExample {
    public static void main(String[] args) {

        Vehicle bmw = new Vehicle("BMW X8","Red-Blue","4 Wheeler");
        bmw.displayVehicleDetails();

        Vehicle jupiter = new Vehicle("TVS Jupiter","2 Wheeler");
        jupiter.displayVehicleDetails();

    }
}

/**
 * OUTPUT
 * Vehicle Name: BMW X8
 * Vehicle Color: Red-Blue
 * Vehicle Type: 4 Wheeler
 * =========================
 * Vehicle Name: TVS Jupiter
 * Vehicle Color: White
 * Vehicle Type: 2 Wheeler
 * =========================
 *
 * In this program, we created vehicle class contains vName, vColour and vType and two constructors and one method.
 * Then, we created two objects bmw and jupiter using different constructor.
 */
