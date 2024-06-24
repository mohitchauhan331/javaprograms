package basicprograms;
import java.util.Scanner;
public class Result {
    Double kilometers;
    Double meters;

    public Result(){
       kilometers= 0.0;
        meters= 0.0;
    }
     public Result(Double Kilometers, Double meters){
        this.kilometers= Kilometers;
        this.meters= meters;
    }
        public static Result adddistance(Result K1 , Result K2){
            Result result = new Result();
            result.meters = K1.meters + K2.meters;
            result.kilometers = K1.kilometers + K2.kilometers+(result.meters/1000);
            result.meters = result.meters%1000;
            return result;
        }        
        public void display()
        {
            System.out.println(this.kilometers + " kilometers and " + this.meters + " meters");
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);

            System.out.println("Enter distance K1:");
            System.out.println("Kilometer:");
            Double km1 =scanner.nextDouble();
            System.out.println("Enter distance meters:");
            Double m1 =scanner.nextDouble();
            Result K1 = new Result (km1 , m1);

            System.out.println("Enter distance K2:");
            System.out.println("Kilometer:");
            Double km2 =scanner.nextDouble();
            System.out.println("Enter distance meters:");
            Double m2 =scanner.nextDouble();
            Result K2= new Result (km2 ,m2);

            Result result = adddistance(K1, K2);

            System.out.print("The total distance is: ");
            result.display();
        }
}

