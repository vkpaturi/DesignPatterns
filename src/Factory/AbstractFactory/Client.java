package Factory.AbstractFactory;

import Factory.AbstractFactory.Components.FourWheeler;
import Factory.AbstractFactory.Components.TwoWheeler;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Showroom showroom = new Showroom();

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Company (Only 'Honda' and 'Mahindra')");
            String input = sc.nextLine();

            VehicleFactory vehicleFactory = showroom.getVehicleFactory(input);

            TwoWheeler twoWheeler = vehicleFactory.buildTwoWheeler();
            twoWheeler.printVehicleInfo();

            FourWheeler fourWheeler = vehicleFactory.buildFourWheeler();
            fourWheeler.printVehicleInfo();
        }

    }
}
