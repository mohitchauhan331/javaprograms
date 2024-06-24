package basicprograms;

public class hello {
    public static void main(String[] args) 
    {
        
        Thread p1 = new Thread(() -> {
            System.out.println("thread p1 is running ");
            try {
                Thread.sleep(15000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Process p1 has completed.");
        });

        Thread p2 = new Thread(() -> {
            System.out.println("Process p2 is running ");
            try {
                Thread.sleep(20000); 
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println("Process p2 has completed.");
        });

        
        p1.start();
        p2.start();

        try {
            
            p2.join();
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        p1.interrupt();
        System.out.println("Process p1 is terminated.");
    }
}
