package Factory.AbstractFactory;

import Factory.AbstractFactory.Components.FourWheeler;
import Factory.AbstractFactory.Components.TwoWheeler;

public interface VehicleFactory {
    TwoWheeler buildTwoWheeler();

    FourWheeler buildFourWheeler();


}
