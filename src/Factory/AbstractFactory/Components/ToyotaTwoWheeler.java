package Factory.AbstractFactory.Components;

public class ToyotaTwoWheeler implements TwoWheeler{

    @Override
    public void printVehicleInfo() {
        System.out.println("This is a Toyota's Two Wheeler");
    }
}
