package basicprograms;
import java.util.Scanner;
public class Dealershipapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Porsche cars in the dealership: ");
        int n = sc.nextInt();

        Dealershipapp dealership = new Dealershipapp(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter model of car " + (i + 1) + ": ");
            String model = sc.next();
            System.out.print("Enter year for car " + (i + 1) + ": ");
            int year = sc.nextInt();
            System.out.print("Enter price for car " + (i + 1) + ": ");
            double price = sc.nextDouble();

            Porsche car = new Porsche(model, year, price);
            dealership.addCar(car);
        }
 class Porsche {
    String model;
    int year;
    double price;

    Porsche(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("Model: " + model + "\tYear: " + year + "\tPrice: $" + price);
    }
}

class Dealership {
    Porsche[] cars;
    int count;

    Dealership(int size) {
        cars = new Porsche[size];
        count = 0;
    }

    void addCar(Porsche car) {
        if (count < cars.length) {
            cars[count] = car;
            count++;
        } else {
            System.out.println("Dealership is full");
        }
    }

    void displayCars() {
        for (int i = 0; i < count; i++) {
            cars[i].display();
        }
    }
}
        System.out.println("Porsche cars in the dealership:");
        Dealershipapp.displayCars();

        sc.close();
    }
}
