// Inheritance
public class Cat extends Animal {
    // constructor
    public Cat(String name) {
        // super constructor
        super(name);
    }

    // Polymorphism
    @Override
    public String makeSound() {
        return "meow";
    }
}
