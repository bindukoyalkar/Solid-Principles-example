package ViolateSolidPrinciplesProject;

public class Insurance {
    public void getInsurance(){
        Car car=new Car();
        car.submitInsurance();
    }
}
// Here in Insurance class the method getInsurance() creates an object of Car in the method itself and with help of
// object of Car calls submitInsurance() method present in Car class. Thus, this code is tightly coupled and
// violates Dependency Inversion Principle. In the Main class we can see that when getInsurance() is called on the
// Insurance object then only the Car insurance message is printed.