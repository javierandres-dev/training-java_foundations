// Comment inline
/*
Comment
multi-line
*/
public class App {
    public static void main(String[] args) throws Exception {
        aboutPrint();

        // VARIABLES
        final String myConstant = "abc";
        System.out.println(myConstant);
        String myVariable = "abc";
        System.out.println(myVariable);

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

        // BUILT-IN METHODS
        // String
        myString = "java is funny";
        System.out.println(myString);
        System.out.println(myString.length());
        System.out.println(myString.charAt(0));
        System.out.println(myString.charAt(12));
    }

    private static void aboutPrint() {
        System.out.print("Hello, World!");// print on the same line
        System.out.println("Hello, World!");// print on a new line
        // text block
        System.out.println("""
            Hello,
            World!
            """);
    }
}