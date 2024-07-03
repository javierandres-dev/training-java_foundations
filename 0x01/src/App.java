// Comment inline
/*
Comment
multi-line
*/

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class App {

    private static void aboutPrint() {
        System.out.print("Hello, World!");// print on the same line
        System.out.println("Hello, World!");// print on a new line
        // text block
        System.out.println("""
                Hello,
                World!
                """);
    }

    private static void aboutVariables() {
        // VARIABLES
        final String myConstant = "abc";
        System.out.println(myConstant);
        String myVariable = "abc";
        System.out.println(myVariable);
    }

    private static void aboutDataTypes() {
        // DATA TYPES
        // primitives
        byte myByte = 127;
        System.out.println(myByte);
        short myShort = 32767;
        System.out.println(myShort);
        int myInt = 2147483647;
        System.out.println(myInt);
        long myLong = 9223372036854775807l;
        System.out.println(myLong);
        float myFloat = 0.1234567f;
        System.out.println(myFloat);
        double myDouble = 0.123456789012345d;
        System.out.println(myDouble);
        boolean myBoolean = true;
        System.out.println(myBoolean);
        char myChar = 'a';
        System.out.println(myChar);
        // non-promitives
        String myString = "";
        myString = "a";
        myString = "abc";
        System.out.println(myString);
    }

    private static void aboutString() {
        // BUILT-IN METHODS - String
        String myString = "java is funny";
        System.out.println(myString);
        System.out.println(myString.length());
        System.out.println(myString.charAt(0));
        System.out.println(myString.charAt(12));
        System.out.println(myString.codePointAt(1));
        System.out.println(myString.codePointBefore(1));
        System.out.println(myString.codePointCount(0, 13));
        System.out.println(myString.compareTo("java is funny"));
        System.out.println(myString.compareTo("java is fun"));
        System.out.println(myString.compareTo("javascript is funny"));
        // System.out.println(myString);
    }

    private static void aboutOperators() {
        // OPERATORS
        // Concatenation
        System.out.println("Hello" + ", " + "World!");
        // Arithmetic
        System.out.println(100 + 10);
        System.out.println(100 - 10);
        System.out.println(100 * 10);
        System.out.println(100 / 10);
        System.out.println(100 % 10);
        int myNumber = 100;
        System.out.println(myNumber);
        myNumber++;
        System.out.println(myNumber);
        myNumber--;
        System.out.println(myNumber);
        // Assignment
        myNumber = 200;
        System.out.println(myNumber);
        System.out.println(myNumber += 10);
        System.out.println(myNumber -= 10);
        System.out.println(myNumber *= 10);
        System.out.println(myNumber /= 10);
        System.out.println(myNumber %= 3);
        myNumber = 10;
        System.out.println(myNumber &= 2);
        myNumber = 10;
        System.out.println(myNumber |= 2);
        myNumber = 10;
        System.out.println(myNumber ^= 2);
        myNumber = 10;
        System.out.println(myNumber >>= 2);
        myNumber = 10;
        System.out.println(myNumber <<= 2);
        // Comparison
        System.out.println(100 == 10);
        System.out.println(100 != 10);
        System.out.println(100 > 10);
        System.out.println(100 >= 10);
        System.out.println(100 < 10);
        System.out.println(100 <= 10);
        // Logical
        System.out.println(100 > 10 && 5 < 50);
        System.out.println(100 < 10 || 5 > 50);
        System.out.println(!false);
    }

    private static void aboutConditionals() {
        // Conditionals
        if (100 > 10) {
            System.out.println("1..it's true");
        }
        if (10 > 100) {
            System.out.println("2..it's true");
        } else {
            System.out.println("2..it's false");
        }
        System.out.println((100 > 10) ? "3..It's true" : "3..it's false");
        System.out.println((100 < 10) ? "4..It's true" : "4..it's false");
        if (100 == 10) {
            System.out.println("5..it's true");
        } else if (100 > 10) {
            System.out.println("5..it's true");
        } else {
            System.out.println("5..it's false");
        }
        String expression = "I'm an expression";
        switch (expression) {
            case "a":
                System.out.println("a case");
                break;
            case "b":
                System.out.println("b case");
                break;
            default:
                System.out.println("default case");
        }
    }

    private static void aboutLoops() {
        // Loops
        for (int i = 0; i < 5; i++) {
            System.out.println("for - i: " + i);
        }

        int i = 0;
        while (i < 5) {
            System.out.println("while - i: " + i);
            i++;
        }

        i = 10;
        do {
            System.out.println("do..while - i: " + i);
            i++;
        } while (i < 5);

        String[] names = { "Jane", "John", "Pepita" };
        for (String name : names) {
            System.out.println("for-each - name: " + name);
        }
    }

    private static void aboutBreakContinue() {
        // Jump statements
        for (int i = 1; i < 10; i++) {
            if (i == 6) {
                break;
            }
            if (i == 3) {
                continue;
            }
            System.out.println("i: " + i);
        }
    }

    private static void aboutArrays() {
        // Arrays
        String[] myArrayStrings;
        String[] names = { "Jane", "John" };
        int[] numbers = { 10, 20, 30 };
        System.out.println("names: " + names);
        System.out.println("numbers.length: " + numbers.length);
        myArrayStrings = names;
        System.out.println("myArrayStrings: " + myArrayStrings);
        names[1] = "Anne";
        System.out.println(myArrayStrings[1]);
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println("numbers.length: " + numbers.length);
        // Multidimensional Arrays
        int[][] myMatriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(myMatriz[1][1]);
        myMatriz[1][1] = 0;
        System.out.println(myMatriz[1][1]);
    }

    private static void aboutClasses() {
        // Classes
        MyClass myClass = new MyClass();
        myClass.firstname = "Jane";
        myClass.surname = "Doe";

        myClass.myOtherClass = new MyOtherClass();
        myClass.myOtherClass.country = "USA";
        myClass.myOtherClass.city = "New York";
        myClass.myOtherClass.complement = "Main Street 1001";

        myClass.introduce();
        myClass.greet("John");
    }

    private static void aboutConstructors() {
        // Constructors
        MyClassWithConstructor myClassWithConstructor = new MyClassWithConstructor("John", "Doe", 4321, true, "USA",
                "New York", "Main Street 1001");
        System.out.println(myClassWithConstructor);
        System.out.println(myClassWithConstructor.firstname);
    }

    private static void aboutEncapsulation() {
        // Encapsulation
        User user = new User("Jane", "jane", 1234);
        System.out.println(user.getName());
        user.setName("John");
        user.showInfo();
    }

    private static void aboutInheritanceAndPolymorphism() {
        // Inheritance, Polymorphism, Class attribute
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Pluto");

        System.out.println("I'm " + cat.getName() + "..." + cat.makeSound());
        System.out.println("I'm " + dog.getName() + "..." + dog.makeSound());

        Animal.showInstanceCounter();
    }

    private static void aboutAbstractClass() {
        // Abstract class
        Square square = new Square(2);
        square.showInfo();
        System.out.println(square.calculateArea());
    }

    private static void aboutInterfaces() {
        // Interfaces
        UsingInterface usingInterface = new UsingInterface();
        usingInterface.meth();
    }

    private static void aboutExceptions() {
        // Exceptions (unchecked and checked)

        int a = 1;
        int b = 0;
        // sample unchecked exception
        // System.out.println(a / b);

        // handle exception
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("e: " + e);
            e.printStackTrace();
        } finally {
            System.out.println("...finaly...");
        }
    }

    private static void aboutCollections() {
        // Collections
        // Set: HashSet, TreeSet, LinkedHashSet, etc
        aboutSet();
        // List: ArrayList, LinkedList, Vector, etc
        aboutList();
        // Map: HashMap, TreeMap, LinkedHashMap, etc
        aboutMap();
    }

    private static void aboutSet() {
        // Set: HashSet, TreeSet, LinkedHashSet, etc
        // HashSet example
        Set<String> superheroesInHashSet = new HashSet<>();
        superheroesInHashSet.add("cat woman");
        superheroesInHashSet.add("wonder woman");
        superheroesInHashSet.add("spider woman");
        superheroesInHashSet.add("superman");
        superheroesInHashSet.add("batman");
        superheroesInHashSet.add("spiderman");
        superheroesInHashSet.add("ironman");
        superheroesInHashSet.add("elektra");
        superheroesInHashSet.add("storm");
        System.out.println("superheroesInHashSet: " + superheroesInHashSet);
        // TreeSet example
        Set<String> superheroesInTreeSet = new TreeSet<>();
        superheroesInTreeSet.add("cat woman");
        superheroesInTreeSet.add("wonder woman");
        superheroesInTreeSet.add("spider woman");
        superheroesInTreeSet.add("superman");
        superheroesInTreeSet.add("batman");
        superheroesInTreeSet.add("spiderman");
        superheroesInTreeSet.add("ironman");
        superheroesInTreeSet.add("elektra");
        superheroesInTreeSet.add("storm");
        System.out.println("superheroesInTreeSet: " + superheroesInTreeSet);
        // LinkedHashSet example
        Set<String> superheroesInLinkedHashSet = new LinkedHashSet<>();
        superheroesInLinkedHashSet.add("cat woman");
        superheroesInLinkedHashSet.add("wonder woman");
        superheroesInLinkedHashSet.add("spider woman");
        superheroesInLinkedHashSet.add("superman");
        superheroesInLinkedHashSet.add("batman");
        superheroesInLinkedHashSet.add("spiderman");
        superheroesInLinkedHashSet.add("ironman");
        superheroesInLinkedHashSet.add("elektra");
        superheroesInLinkedHashSet.add("storm");
        System.out.println("superheroesInLinkedHashSet: " + superheroesInLinkedHashSet);
    }

    private static void aboutList() {
        // List: ArrayList, LinkedList, Vector, etc
        // ArrayList example
        List<String> superheroesInArrayList = new ArrayList<>();
        superheroesInArrayList.add("cat woman");
        superheroesInArrayList.add("wonder woman");
        superheroesInArrayList.add("spider woman");
        superheroesInArrayList.add("superman");
        superheroesInArrayList.add("batman");
        superheroesInArrayList.add("spiderman");
        superheroesInArrayList.add("ironman");
        superheroesInArrayList.add("elektra");
        superheroesInArrayList.add("storm");
        System.out.println("superheroesInArrayList: " + superheroesInArrayList);
        // LinkedList example
        List<String> superheroesInLinkedList = new LinkedList<>();
        superheroesInLinkedList.add("cat woman");
        superheroesInLinkedList.add("wonder woman");
        superheroesInLinkedList.add("spider woman");
        superheroesInLinkedList.add("superman");
        superheroesInLinkedList.add("batman");
        superheroesInLinkedList.add("spiderman");
        superheroesInLinkedList.add("ironman");
        superheroesInLinkedList.add("elektra");
        superheroesInLinkedList.add("storm");
        System.out.println("superheroesInLinkedList: " + superheroesInLinkedList);
        // Vector example
        List<String> superheroesInVector = new Vector<>();
        superheroesInVector.add("cat woman");
        superheroesInVector.add("wonder woman");
        superheroesInVector.add("spider woman");
        superheroesInVector.add("superman");
        superheroesInVector.add("batman");
        superheroesInVector.add("spiderman");
        superheroesInVector.add("ironman");
        superheroesInVector.add("elektra");
        superheroesInVector.add("storm");
        System.out.println("superheroesInVector: " + superheroesInVector);
    }

    private static void aboutMap() {
        // Map: HashMap, TreeMap, LinkedHashMap, etc
        // HashMap example
        Map<String, Integer> productsInHashMap = new HashMap<>();
        productsInHashMap.put("monitor", 300);
        productsInHashMap.put("keyboard", 200);
        productsInHashMap.put("mouse", 100);
        System.out.println("productsInHashMap: " + productsInHashMap);
        // TreeMap example
        Map<String, Integer> productsInTreeMap = new TreeMap<>();
        productsInTreeMap.put("monitor", 300);
        productsInTreeMap.put("keyboard", 200);
        productsInTreeMap.put("mouse", 100);
        System.out.println("productsInTreeMap: " + productsInTreeMap);
        // LinkedHashMap example
        Map<String, Integer> productsInLinkedHashMap = new LinkedHashMap<>();
        productsInLinkedHashMap.put("monitor", 300);
        productsInLinkedHashMap.put("keyboard", 200);
        productsInLinkedHashMap.put("mouse", 100);
        System.out.println("productsInLinkedHashMap: " + productsInLinkedHashMap);
    }

    public static void main(String[] args) throws Exception {
        // aboutPrint();
        // aboutVariables();
        // aboutDataTypes();
        // aboutString();
        // aboutOperators();
        // aboutConditionals();
        // aboutLoops();
        // aboutBreakContinue();
        // aboutArrays();
        // aboutClasses();
        // aboutConstructors();
        // aboutEncapsulation();
        // aboutInheritanceAndPolymorphism();
        // aboutAbstractClass();
        // aboutInterfaces();
        // aboutExceptions();
        // aboutCollections();
    }
}