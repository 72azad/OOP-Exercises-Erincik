class Truck extends Speed {
    private static final int wheels = 6;

    public Truck() {
        currentSpeed = 0;
    }

    @Override
    public void accelerate(int amount) {
        currentSpeed += amount;
    }

    @Override
    public void brake(int amount) {
        currentSpeed = Math.max(0, currentSpeed - amount);
    }

    @Override
    public int countOfWheels() {
        return wheels;
    }
}