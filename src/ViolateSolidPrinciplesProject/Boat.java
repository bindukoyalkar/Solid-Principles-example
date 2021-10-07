package ViolateSolidPrinciplesProject;

public class Boat extends Automobile{
    @Override
    public void noOfWheels() throws BoatHasNoWheelsException{
        throw new BoatHasNoWheelsException();
    }
}
// Liskov Substitution Principle is violated because even though Boat is a Child of Automobile it throws exception
// in noOfWheels() method as Boat has no wheels
