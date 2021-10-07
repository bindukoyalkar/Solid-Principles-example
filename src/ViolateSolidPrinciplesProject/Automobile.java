package ViolateSolidPrinciplesProject;
public abstract class Automobile {
    public void turnOn(){
        System.out.println("Automobile has turned on");
    }
    public void turnOff(){
        System.out.println("Automobile has turned off");
    }
    public void drive(){
        System.out.println("Driving the Automobile");
    }
    public void repair(){
        System.out.println("Repairing the Automobile");
    }
    public void wash(){
        System.out.println("Washing the Automobile");
    }
    public void typeOfAutomobile(){
        System.out.println("This is a Automobile");
    }
    public abstract void noOfWheels() throws BoatHasNoWheelsException;
    public void noOfSeats(Automobile vehicle) { //List<Automobile> list
        if (vehicle instanceof Bike) {
            System.out.println("Bike has two seats");
            return;
        }
        if (vehicle instanceof Car) {
            System.out.println("Car has five seats");
            return;
        } else {
            System.out.println("Automobile can't determine number of seats");
        }
    }
}
