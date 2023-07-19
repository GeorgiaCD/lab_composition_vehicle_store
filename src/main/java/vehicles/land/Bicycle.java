package vehicles.land;

import products.IProduct;
import vehicles.Vehicle;

public class Bicycle extends Vehicle implements ILandVehicle {
    private int wheelCount;

    public Bicycle(float weight, int maxSpeed, IProduct baseProduct) {
        super(weight, maxSpeed, baseProduct);
        this.wheelCount = 2;
    }

    @Override
    public int getWheelCount() {
        return this.wheelCount;
    }

    @Override
    public void setWheelCount(int count) throws Exception {
        throw new Exception("Cannot change wheelCount for Bicycle");
    }
}
