package loki;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal obj= new Dog();
        obj.makeSound();    // Outputs: Dog barks
    }
}

