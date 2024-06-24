package basicprograms;
import java.util.Scanner;
public class Time {
    int hours;
    int minutes;

    public Time (){
        this.hours=hours;
        this.minutes=minutes;
    }
    public Time (int hours,int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }
    public static Time addtime(Time T1,Time T2){
        int totalminutes=(T1.hours*60+T1.minutes)+(T2.hours*60+T2.minutes);
        int hours=totalminutes/60;
        int minutes=totalminutes%60;
        return new  Time (hours,minutes);
    }
    public void display(){
        System.out.println(this.hours+"hours and"+this.minutes+"minutes" );
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
         System.out.println("Enter the first time:");
        System.out.print("Hours: ");
        int hours1 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes1 = scanner.nextInt();
        Time T1 = new Time(hours1, minutes1);

        System.out.println("Enter the second time:");
        System.out.print("Hours: ");
        int hours2 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes2 = scanner.nextInt();
        Time T2 = new Time(hours2, minutes2);

        Time result= addtime(T1,T2);

        System.out.println("total time:");
        result.display();
    }
}
