package ViolateSolidPrinciplesProject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Bike motorBike= new Bike();
        motorBike.turnOn();
        motorBike.turnOff();
        motorBike.drive();
        motorBike.repair();
        motorBike.wash();
        motorBike.typeOfAutomobile();
        motorBike.noOfSeats(motorBike);
        Car audi=new Car();
        audi.noOfSeats(new Car());
        Boat ferry=new Boat();
        try {
            ferry.noOfWheels();
        }
        catch (Exception e) {
           // e.printStackTrace();
        }
        ferry.noOfSeats(ferry);
        Insurance insurance=new Insurance();
        insurance.getInsurance();
    }
}
//List<Automobile> setOfAutomobiles = new ArrayList<>();
 /* setOfAutomobiles.add(new Automobile());
        setOfAutomobiles.add(new Bike());
        setOfAutomobiles.add(new Car());
        vehicle.noOfSeats(setOfAutomobiles);*/