package Factory.AbstractFactory.Components;

public class ToyotaFourWheeler implements FourWheeler{

    @Override
    public void printVehicleInfo() {
        System.out.println("Toyota Four Wheeler");
    }
}
