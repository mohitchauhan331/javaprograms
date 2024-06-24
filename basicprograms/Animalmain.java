package basicprograms;

public class Animalmain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();       
        cat.sound();       

        dog.showType();    
        cat.showType();    

        Animal.displayAnimalCount(); 
    }
}

class Animal {
    static int animalCount = 0;

    final String type;

    Animal(String type) {
        this.type = type;
        animalCount++;
    }

    static void displayAnimalCount() {
        System.out.println("Total number of animals: " + animalCount);
    }

    final void showType() {
        System.out.println("Animal type: " + type);
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    Cat() {
        super("Cat");
    }

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
