// Inheritance
public class Dog extends Animal {
    // constructor
    public Dog(String name) {
        // super constructor
        super(name);
    }

    // Polymorphism
    @Override
    public String makeSound() {
        return "woof";
    }
}
