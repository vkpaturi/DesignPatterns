package Factory.NormalFactory;

public class VehicleFactory {
    public Vehicle getVehicle(int tyres) {
        if (tyres == 2) {
           return new TwoWheeler();
       }
       else if (tyres == 4){
           return new FourWheeler();
       }
       else if (tyres == 3) {
           return new ThreeWheeler();
        }
       return new SingleWheeler();
    }
}
