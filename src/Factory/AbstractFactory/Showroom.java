package Factory.AbstractFactory;

import Factory.NormalFactory.Vehicle;

public class Showroom {

    public VehicleFactory getVehicleFactory(String companyName) {
        return CompanyFactory.getCompany(companyName);
    }
}
