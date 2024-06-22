public class MyClassWithConstructor {
    /* attributes */

    // properties
    String firstname;
    String surname;
    Number dni;
    Boolean enable;
    MyOtherClassWithConstructor myOtherClassWithConstructor;

    // methods
    // constructor
    public MyClassWithConstructor(
            String firstname,
            String surname,
            Number dni,
            Boolean enable,
            String country,
            String city,
            String complement) {
        this.firstname = firstname;
        this.surname = surname;
        this.dni = dni;
        this.enable = enable;
        this.myOtherClassWithConstructor = new MyOtherClassWithConstructor(country, city, complement);

        /*
         * public void introduce(){
         * System.out.println("Hello, my name is " + firstname + " " + surname +
         * ".  I live in " + myOtherClass.city);
         * }
         * 
         * public void greet(String name){
         * System.out.println("Hello, " + name + "!");
         * }
         */
    }
}
