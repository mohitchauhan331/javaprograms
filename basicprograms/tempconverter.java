package basicprograms;

import java.util.Scanner;
public class tempconverter {
    public static void main(String argu []){
     Scanner scanner = new Scanner (System.in);

     System.out.print("Enter temperature in farenheit:");
     double fahrenheit = scanner.nextDouble();

     double celcius = (fahrenheit - 32)*5/9;

     System.out.println("temperature in celcius :"+celcius );
    }

}
