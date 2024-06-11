package basicprograms;

public class functionoverloading {
    public int add (int a,int b){
        return a+b;
    }
    public int add (int a ,int b,int c){
        return a+b+c;
    }
    public float add (float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
     
        functionoverloading scanner =new functionoverloading();    

    System.out.println("sum of two interger:"+scanner.add(5,10));
    System.out.println ("Sum of three interger :"+scanner.add(34,23,45));
    System.out.println("sum of three float:"+scanner.add(3.14f,7.35f));
     }
    }
