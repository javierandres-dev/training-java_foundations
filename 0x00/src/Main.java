// Comment Single-line
/* Comments
Multi-line */
public class Main {
    public static void main(String[] args){
        // first test
        System.out.println("Hello, World!");
        // VARIABLES
        // DATA TYPES
        System.out.println("************************************** DATA TYPES **************************************");
        // Primitives
        byte myByte = 127;
        System.out.println("myByte: " + myByte);
        short myShort = 32767;
        System.out.println("myShort: " + myShort);
        int myInteger = 2147483647;
        System.out.println("myInteger: " + myInteger);
        long myLong = 9223372036854775807L;
        System.out.println("myLong: " + myLong);
        float myFloat = 0.9999999f;
        System.out.println("myFloat: " + myFloat);
        double myDouble = 0.999999999999999d;
        System.out.println("myDouble: " + myDouble);
        boolean myBoolean = true;
        System.out.println("myBoolean: " + myBoolean);
        char myCharacter = 'a';
        System.out.println("myCharacter: " + myCharacter);
        // Non-primitives
        String myString = "";
        myString = "a";
        myString = "a...";
        // block text multi-line strings
        myString = """
                Example text blocks feature
                to declare multi-line strings
                most efficiently
                """;
        System.out.println("myString: " + myString);
        // OPERATORS
        System.out.println("*************************************** OPERATORS ***************************************");
        // Arithmetic
        System.out.println(100 + 10);
        System.out.println(100 - 10);
        System.out.println(100 * 10);
        System.out.println(100 / 10);
        System.out.println(100 % 10);
        int myNumber = 100;
        myNumber++;
        myNumber--;
        System.out.println(myNumber);
        // Assignment
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
        System.out.println("********************************** CONTROL STRUCTURES **********************************");
        System.out.println("**************************************** METHODS ****************************************");
    }
}
