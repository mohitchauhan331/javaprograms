package basicprograms;

public class multipleinterfaces {
    public static void main(String[] args) {
        Duck sc = new Duck();
        sc.fly();
        sc.swim();
        sc.quack();
    }
}
interface canfly{
    void fly();
}
interface canswim{
    void swim();
}
class Duck implements canfly,canswim{
    public void fly(){
        System.out.println("duck is flying.");
    }
    public void swim(){
        System.out.println("duck is swimming.");
    }
    public void quack(){
        System.out.println("duck is quacking.");
    }
}

