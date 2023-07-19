package parts;

import products.IProduct;

public interface IPart extends IProduct {
    public String getManufacturer();
    public long getPartNumber();
    public void setManufacturer(String man);
    public void setPartNumber(long num);
}
