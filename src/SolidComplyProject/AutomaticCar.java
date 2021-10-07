package SolidComplyProject;

public class AutomaticCar extends Automobile implements AutomaticVehicle{
    @Override
    public void automaticGearChange(){
        System.out.println("Driver has to change gears in Car");
    }
    public void typeOfAutomobile(){
        System.out.println("This is a Automatic Car");
    }
}
