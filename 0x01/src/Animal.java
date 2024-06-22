// Inheritance, Polymorphism, Class attribute (static)
public class Animal {
    // static
    private static int instanceCounter = 0;

    private String name;

    public Animal(String name) {
        instanceCounter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound() {
        return "Generic sound";
    }

    // static
    public static void showInstanceCounter() {
        System.out.println("Counter: " + instanceCounter);
    }
}
