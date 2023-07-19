package parts;

import products.IProduct;

public final class Part implements IPart {
    private String manufacturer;
    private long partNumber;
    private IProduct baseProduct;

    public Part (String manufacturer, long partNumber, IProduct baseProduct) {
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.baseProduct = baseProduct;
    }


    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public long getPartNumber() {
        return this.partNumber;
    }

    @Override
    public void setManufacturer(String man) {
        this.manufacturer = man;
    }

    @Override
    public void setPartNumber(long num) {
        this.partNumber = num;
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
}
