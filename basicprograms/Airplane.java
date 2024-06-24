package basicprograms;

public class Airplane {
    private String flightNumber;
    private String destination;
    private String scheduledDeparture;
    private int delayTime;

    public Airplane(String flightNumber, String destination, String scheduledDeparture) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
        this.delayTime = 0;
    }

    public void setDelay(int delayTime) {
        this.delayTime = delayTime;
    }

    public String checkStatus() {
        if (delayTime == 0) {
            return "Flight " + flightNumber + " is on time.";
        } else {
            return "Flight " + flightNumber + " is delayed by " + delayTime + " minutes.";
        }
    }

    public static void main(String[] args) {
        Airplane flight1 = new Airplane("CDE23", "NEW DELHI", "11:00 AM");
        Airplane flight2 = new Airplane("kUI78", "MUMBAI", "1:00 PM");
        Airplane flight3 = new Airplane("ACD47", "BANGALORE", "12:45 PM");

        System.out.println("Flight Status:");
        System.out.println(flight1.checkStatus());
        System.out.println(flight2.checkStatus());
        System.out.println(flight3.checkStatus());

        flight2.setDelay(220);
        flight3.setDelay(911);

        System.out.println("\nCurrent Flight Status:");
        System.out.println(flight1.checkStatus());
        System.out.println(flight2.checkStatus());
        System.out.println(flight3.checkStatus());
    }
}
