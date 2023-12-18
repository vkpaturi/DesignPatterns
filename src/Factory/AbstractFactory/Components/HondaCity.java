package Factory.AbstractFactory.Components;

public class HondaCity implements FourWheeler{

    @Override
    public void printVehicleInfo() {
        System.out.println("This is Honda City Car");
    }
}
