// Comment inline
/*
Comment
multi-line
*/
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

    private static void aboutVariables(){
        // VARIABLES
        final String myConstant = "abc";
        System.out.println(myConstant);
        String myVariable = "abc";
        System.out.println(myVariable);
    }

    private static void aboutDataTypes(){
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

    private static void aboutString(){
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
        //System.out.println(myString);
    }

    private static void aboutOperators(){
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

    private static void aboutConditionals(){
        // Conditionals
        if (100 > 10) {
            System.out.println("1..it's true");
        }
        if (10 > 100) {
            System.out.println("2..it's true");
        } else {
            System.out.println("2..it's false");
        }
        System.out.println((100>10) ? "3..It's true": "3..it's false");
        System.out.println((100<10) ? "4..It's true": "4..it's false");
        if (100 == 10) {
            System.out.println("5..it's true");
        } else if (100 > 10) {
            System.out.println("5..it's true");
        } else {
            System.out.println("5..it's false");
        }
        String expression = "I'm an expression";
        switch (expression){
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

    private static void aboutLoops(){
        // Loops
        for(int i = 0; i < 5; i++ ){
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

        String[] names = {"Jane", "John", "Pepita"};
        for (String name : names) {
            System.out.println("for-each - name: " + name);
        }
    }

    private static void aboutBreakContinue(){
        // Jump statements
        for(int i = 1; i < 10; i++){
            if (i == 6) {
                break;
            }
            if (i == 3) {
                continue;
            }
            System.out.println("i: " + i);
        }
    }

    private static void aboutArrays(){
        // Arrays
        String[] myArrayStrings;
        String[] names = {"Jane", "John"};
        int[] numbers = {10, 20, 30};
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
        int[][] myMatriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(myMatriz[1][1]);
        myMatriz[1][1] = 0;
        System.out.println(myMatriz[1][1]);
    }

    private static void aboutArryList(){
        // Array List
    }

    public static void main(String[] args) throws Exception {
        //aboutPrint();
        //aboutVariables();
        //aboutDataTypes();
        //aboutString();
        //aboutOperators();
        //aboutConditionals();
        //aboutLoops();
        //aboutBreakContinue();
        //aboutArrays();
        aboutArryList();
    }
}