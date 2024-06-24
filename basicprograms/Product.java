package basicprograms;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

class Soap extends Product {
    public Soap(String productName, double price) {
        super(productName, price);
    }

    
    public void displayProductDetails() {
        System.out.println("Soap Details:");
        super.displayProductDetails();
    }
}

class gigaSoapTest {
    public static void main(String[] args) {
        Soap gigaSoap = new Soap("Giga Soap", 450);
        gigaSoap.displayProductDetails();
    }
}
