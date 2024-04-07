package abstraction;
public class Abstractionextend extends Abstractionclass1{
    
    public void name (){
     System.out.println("hello there");
    }
    public void newFunction(){
        super.newFunction();
        System.out.println("hi");
    }
    int a;

    public static void main (String []argu){
        Abstractionextend obj = new Abstractionextend();
        obj.name();
        obj.newFunction();
        System.out.println("value of a ="+obj.a);
    }
    
}
