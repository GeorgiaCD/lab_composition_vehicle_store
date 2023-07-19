package vehicles;

public interface IMotorised {
    public void startEngine();
    public void stopEngine();
    public int getHp();
    public void setHp(int hp);
    public int getFuel();
    public void setFuel(int fuel);
}
