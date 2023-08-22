interface Flying {
    void takeOff();
    void landing();
}

class Airplane extends Speed implements Flying {
    private static final int wheels = 18;

    public Airplane() {
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

    @Override
    public void takeOff() {
        System.out.println("Airplane taking off...");
    }

    @Override
    public void landing() {
        System.out.println("Airplane landing...");
    }
}