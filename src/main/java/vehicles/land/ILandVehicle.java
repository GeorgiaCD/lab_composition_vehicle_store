package vehicles.land;

import vehicles.IVehicle;

public interface ILandVehicle extends IVehicle {
    public int getWheelCount();
    public void setWheelCount(int count) throws Exception;
}
