package Factory.AbstractFactory;

public class CompanyFactory {
    public static VehicleFactory getCompany(String companyName) {
        if (companyName.equals("Honda")) {
            return new HondaVehicleFactory();
        }
        else if (companyName.equals("Mahindra")) {
            return new MahindraVehicleFactory();
        }
        return null;
    }
}
