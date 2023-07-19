package vehicles;

import products.IProduct;

public abstract class Vehicle implements IVehicle {

    private float weight;
    private int maxSpeed;
    private IProduct baseProduct;

    public Vehicle(float weight, int maxSpeed, IProduct baseProduct) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.baseProduct = baseProduct;
    }

    @Override
    public float getPrice() {
        return this.baseProduct.getPrice();
    }

    @Override
    public long getInventory() {
        return this.baseProduct.getInventory();
    }

    @Override
    public void setPrice(float price) {
        this.baseProduct.setPrice(price);
    }

    @Override
    public void setInventory(long amount) {
        this.baseProduct.setInventory(amount);
    }

    @Override
    public void setTitle(String title) {
        this.baseProduct.setTitle(title);
    }

    @Override
    public String getTitle() {
        return this.baseProduct.getTitle();
    }

    @Override
    public void addInventory(long amount) {
        this.baseProduct.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) throws Exception {
        this.baseProduct.removeInventory(amount);
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }
}
