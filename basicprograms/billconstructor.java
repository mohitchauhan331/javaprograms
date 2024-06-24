package basicprograms;

import java.util.Scanner;

public class billconstructor {
    private int units;
    private double billAmount;

    public billconstructor(int units) {
        this.units = units;
        this.billAmount = calculateBill();
    }

    public double calculateBill() {
        double amount;

        if (units <= 600) {
            amount = 0;
        } else {
            amount = units * 8;
        }

        return amount;
    }

    public void setUnits(int units) {
        this.units = units;
        this.billAmount = calculateBill();
    }

    public double getBillAmount() {
        return billAmount;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total units consumed: ");
        int units = scanner.nextInt();

        billconstructor bill = new billconstructor(units);
        System.out.println("The bill is: " + bill.getBillAmount() + " rupees");
    }
}
