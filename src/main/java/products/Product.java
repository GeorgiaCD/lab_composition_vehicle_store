package products;

public final class Product implements IProduct {
    private float price;
    private long inventory;
    private String title;

    public Product(String title, float price, long inventory) {
        this.title = title;
        this.price = price;
        this.inventory = inventory;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public long getInventory() {
        return this.inventory;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setInventory(long amount) {
        this.inventory = amount;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void addInventory(long amount) {
        this.inventory += amount;
    }

    @Override
    public void removeInventory(long amount) throws Exception {
        if(this.inventory - amount < 0) {
            throw new Exception("cannot remove more inventory than is available");
        }
        else {
            this.inventory -= amount;
        }
    }


}
