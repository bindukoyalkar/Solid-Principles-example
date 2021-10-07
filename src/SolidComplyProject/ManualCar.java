package SolidComplyProject;

public class ManualCar extends Automobile implements ManualVehicle{
    @Override
    public void physicallyChangeGears() {
        System.out.println("Driver has to change gears in Car");
    }
    public void typeOfAutomobile(){
        System.out.println("This is a Manual Car");
    }
}
