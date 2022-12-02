package main;

import java.util.Date;

import models.Car;
import models.TurboChargedCar;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
            Car myCar = new Car("A12345"); //instantiate a new Car (object) from a class (Car.java)
            Car myOtherCar = new Car("B67891");//constructor = Car(), this is to create the object
            //Date date = new Date();

        myCar.setColour("red");
        myCar.setMake("Honda");
        myCar.setRegistration("S12345A");
        myCar.setRegistrationDate(new Date());

        myCar.horn();
        System.out.printf("color: %s, make: %s, registration: %s\n", 
        myCar.getColour(), myCar.getMake(), myCar.getRegistration());

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();

        System.out.printf("acceleration: %d\n", myCar.getAcceleration());
    

    if (myOtherCar instanceof TurboChargedCar) {
        //cast into a TurboChargedCar car type to use its method
        TurboChargedCar turbo =(TurboChargedCar)myOtherCar;
        turbo.setTurbo((true));

    }
}
}