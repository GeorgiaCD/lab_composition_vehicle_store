package vehicles.land;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Car extends Vehicle implements ILandVehicle, IMotorised {
    private int wheelCount;
    private IMotorised engine;

    public Car(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine) {
        super(weight, maxSpeed, baseProduct);
        this.wheelCount = 4;
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }

    @Override
    public int getWheelCount() {
        return this.wheelCount;
    }

    @Override
    public void setWheelCount(int count) throws Exception {
        throw new Exception("Cannot change wheelCount for Car");
    }
}
