public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Truck truck = new Truck();
        Airplane airplane = new Airplane();
        Motorcycle motorcycle = new Motorcycle();

        car.accelerate(50);
        car.brake(20);

        bicycle.accelerate(20);
        bicycle.brake(10);

        truck.accelerate(30);
        truck.brake(20);

        motorcycle.accelerate(40);
        motorcycle.brake(20);

        System.out.println("Number of wheels of the car: " + car.countOfWheels());
        System.out.println("Number of wheels of the bicycle: " + bicycle.countOfWheels());
        System.out.println("Number of wheels of the truck: " + truck.countOfWheels());
        System.out.println("Number of wheels of the airplane: " + airplane.countOfWheels());
        System.out.println("Number of wheels of the motorcycle: " + motorcycle.countOfWheels());


        System.out.println("Car speed: " + car.getCurrentSpeed());
        System.out.println("Bicycle speed: " + bicycle.getCurrentSpeed());
        System.out.println("Truck speed: " + truck.getCurrentSpeed());
        System.out.println("Motorcycle speed: " + motorcycle.getCurrentSpeed());

        System.out.println("Airplane speed: " + airplane.getCurrentSpeed());
        airplane.accelerate(500);
        airplane.takeOff();
        System.out.println("Airplane speed after takeoff: " + airplane.getCurrentSpeed());
        airplane.landing();
        airplane.brake(470);
        System.out.println("Airplane speed after braking: " + airplane.getCurrentSpeed());
    }
}