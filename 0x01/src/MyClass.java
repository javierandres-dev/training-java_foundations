public class MyClass {
    /* attributes */

    // properties
    String firstname;
    String surname;
    Number dni;
    Boolean enable;
    String[] skils;
    MyOtherClass myOtherClass;

    // methods
    public void introduce() {
        System.out.println("Hello, my name is " + firstname + " " + surname + ".  I live in " + myOtherClass.city);
    }

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
