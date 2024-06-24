package basicprograms;
public class mutltipleinheritanceexample {
    public static void main(String[] args) {
        Dog sc= new Dog();
        sc.eat();
        sc.play();
        sc.bark();
    }
}

class Animal{
    void eat(){
    System.out.println("Animal is eating ");
    }
}
interface pet{
    void play();
}
class Dog extends Animal implements pet{
    public void play(){
        System.out.println("dog is playing.");
    }
    void bark(){
        System.out.println("Dog is barking");    
    }
}
