package Factory.AbstractFactory;

import Factory.AbstractFactory.Components.FourWheeler;
import Factory.AbstractFactory.Components.HondaCity;
import Factory.AbstractFactory.Components.HondaHornet;
import Factory.AbstractFactory.Components.TwoWheeler;

public class HondaVehicleFactory implements VehicleFactory{

    @Override
    public TwoWheeler buildTwoWheeler() {
        return new HondaHornet();
    }

    @Override
    public FourWheeler buildFourWheeler() {
        return new HondaCity();
    }
}
