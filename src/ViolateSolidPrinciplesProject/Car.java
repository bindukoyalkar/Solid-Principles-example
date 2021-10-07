package ViolateSolidPrinciplesProject;

public class Car extends Automobile implements AutomobileType{
    public void typeOfAutomobile(){
        System.out.println("This is a Car");
    }
    public void noOfWheels(){
        System.out.println("Car has four wheels");
    }
    //Both methods of AutomobileType interface are contradicting each other meaning both the methods manualGearChange()
    // and automaticGearChange() should have been in two separate interfaces so that manual car can implement manualGearChange()
    // method and automatic car can implement automaticGearChange() method. thus Interface Segregation Principle is violated.
    @Override
    public void manualGearChange() {
        System.out.println("This is a manual car");
    }

    @Override
    public void automaticGearChange() {
        System.out.println("This is a automatic car");
    }
    public void submitInsurance(){
        System.out.println("Submitted Car Insurance");
    }
}
