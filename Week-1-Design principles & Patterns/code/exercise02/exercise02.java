// Exercise 2: Implementing the Factory Method Pattern

public class exercise02 {
    public static void main(String[] args) {
        // create a factory
        VehicleFactory factory = new VehicleFactory();

        // create a car
        Vehicle car = factory.createVehicle("Car");
        car.drive();

        // create a bike
        Vehicle bike = factory.createVehicle("Bike");
        bike.drive();
    }

    // Vehicle interface
    interface Vehicle {
        void drive();
    }

    // Car class
    static class Car implements Vehicle {
        public void drive() {
            System.out.println("Driving a car");
        }
    }

    // Bike class
    static class Bike implements Vehicle {
        public void drive() {
            System.out.println("Driving a bike");
        }
    }

    // VehicleFactory class
    static class VehicleFactory {
        public Vehicle createVehicle(String type) {
            if (type.equals("Car")) {
                return new Car();
            } else if (type.equals("Bike")) {
                return new Bike();
            } else {
                return null;
            }
        }
    }

    
}