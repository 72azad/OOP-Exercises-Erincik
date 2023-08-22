class Motorcycle extends Speed {
    private static final int wheels = 2;

    public Motorcycle() {
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