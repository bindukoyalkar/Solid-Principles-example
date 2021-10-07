package SolidComplyProject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Automobile automobile = new Automobile();
        automobile.turnOn();
        automobile.turnOff();
        List<Automobile> groupOfAutomobiles = new ArrayList<>();
        groupOfAutomobiles.add(new Automobile());
        groupOfAutomobiles.add(new Bike());
        groupOfAutomobiles.add(new ManualCar());
        for (Automobile automobiles : groupOfAutomobiles) {
            automobiles.typeOfAutomobile();
        }
    }
}
