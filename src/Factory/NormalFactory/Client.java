package Factory.NormalFactory;

import java.util.Scanner;

public class Client {

    // This Factory method in line 9 and 16 are the best practices for two reasons:
    // 1. If there are any other kinds of vehicles are introduced, we can just create a class and implement Vehicle interface.
    // and then add that object creation logic in the factory method.
    // 2. By doing this, there is no need of changing client code, we need to make changes to directly the internal files.
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of Tyres");

            int input = sc.nextInt();

            Vehicle vehicle = factory.getVehicle(input);
            vehicle.printVehicleInfo();
        }


    }
}

// https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
// https://www.geeksforgeeks.org/factory-method-for-designing-pattern/
