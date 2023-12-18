package Factory.AbstractFactory;

import Factory.AbstractFactory.Components.FourWheeler;
import Factory.AbstractFactory.Components.MahindraJawa;
import Factory.AbstractFactory.Components.MahindraSUV;
import Factory.AbstractFactory.Components.TwoWheeler;

public class MahindraVehicleFactory implements VehicleFactory{

    @Override
    public FourWheeler buildFourWheeler() {
        return new MahindraSUV();
    }

    @Override
    public TwoWheeler buildTwoWheeler() {
        return new MahindraJawa();
    }
}
