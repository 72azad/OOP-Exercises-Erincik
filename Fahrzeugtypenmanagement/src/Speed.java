abstract class Speed {
    protected int currentSpeed;

    public abstract void accelerate(int amount);
    public abstract void brake(int amount);
    public abstract int countOfWheels();

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}