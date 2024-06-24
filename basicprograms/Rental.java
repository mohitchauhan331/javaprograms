//package basicprograms;

class Vehicle {
    private String registrationNumber;
    private double rentalRate;

    public Vehicle(String registrationNumber, double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.rentalRate = rentalRate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public double calculateRentalCharge(int days) {
        return rentalRate * days;
    }
}

class Car extends Vehicle {
    private static final double EXTRA_CHARGE = 500.00;

    public Car(String registrationNumber, double rentalRate) {
        super(registrationNumber, rentalRate);
    }

    public double calculateRentalCharge(int days) {
        return super.calculateRentalCharge(days) + EXTRA_CHARGE;
    }
}

class Bike extends Vehicle {
    private static final double EXTRA_CHARGE = 250.00;
    public Bike(String registrationNumber, double rentalRate) {
        super(registrationNumber, rentalRate);
    }
}

class Truck extends Vehicle {
    private static final double EXTRA_CHARGE = 500.00;

    public Truck(String registrationNumber, double rentalRate) {
        super(registrationNumber, rentalRate);
    }

    public double calculateRentalCharge(int days) {
        return super.calculateRentalCharge(days) + EXTRA_CHARGE;
    }
}

public class Rental {
    public static void main(String[] arg ) {
        Car car = new Car("pb1234", 1700.00);
        Bike bike = new Bike("pb2345", 1500.00);
        Truck truck = new Truck("pb3456", 2500.00);

        int rentalDays = 5;
        double carRentalCharge = car.calculateRentalCharge(rentalDays);
        double bikeRentalCharge = bike.calculateRentalCharge(rentalDays);
        double truckRentalCharge = truck.calculateRentalCharge(rentalDays);

        System.out.println("Car rental for " + rentalDays + " days: " + carRentalCharge);
        System.out.println("Bike rental for " + rentalDays + " days: " + bikeRentalCharge);
        System.out.println("Truck rental for " + rentalDays + " days: " + truckRentalCharge);
    }
}
