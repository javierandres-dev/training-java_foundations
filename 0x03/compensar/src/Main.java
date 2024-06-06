import java.util.Scanner;
import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void exercise1() {
        final int primerNumero = 650, segundoNumero = 120, tercerNumero = 330;
        String conversionPrimerNumero = "Primer número: " + primerNumero +
                "\n\t en binario: " + Integer.toBinaryString(primerNumero) +
                "\n\t en octal: " + Integer.toOctalString(primerNumero) +
                "\n\t en hexadecimal: " + Integer.toHexString(primerNumero);
        System.out.println(conversionPrimerNumero);
        String conversionSegundoNumero = "Segundo número: " + segundoNumero +
                "\n\t en binario: " + Integer.toBinaryString(segundoNumero) +
                "\n\t en octal: " + Integer.toOctalString(segundoNumero) +
                "\n\t en hexadecimal: " + Integer.toHexString(segundoNumero);
        System.out.println(conversionSegundoNumero);
        String conversionTercerNumero = "Tercer número: " + tercerNumero +
                "\n\t en binario: " + Integer.toBinaryString(tercerNumero) +
                "\n\t en octal: " + Integer.toOctalString(tercerNumero) +
                "\n\t en hexadecimal: " + Integer.toHexString(tercerNumero);
        System.out.println(conversionTercerNumero);
    }

    private static void exercise2() {
        final int primerNumero = 650, segundoNumero = 120, tercerNumero = 330;
        final String primerNumeroBinario = Integer.toBinaryString(primerNumero),
                segundoNumeroBinario = Integer.toBinaryString(segundoNumero),
                tercerNumeroBinario = Integer.toBinaryString(tercerNumero);
        String conversionPrimerNumeroBinario = "Primer número en binario: " + primerNumeroBinario +
                "\n\t en decimal: " + Integer.parseInt(primerNumeroBinario, 2);
        System.out.println(conversionPrimerNumeroBinario);
        String conversionSegundoNumeroBinario = "Segundo número binario: " + segundoNumeroBinario +
                "\n\t en decimal: " + Integer.parseInt(segundoNumeroBinario, 2);
        System.out.println(conversionSegundoNumeroBinario);
        String conversionTercerNumeroBinario = "Tercer número en binario: " + tercerNumeroBinario +
                "\n\t en decimal: " + Integer.parseInt(tercerNumeroBinario, 2);
        System.out.println(conversionTercerNumeroBinario);
    }

    private static void exercise3() {
        System.out.print("\nCurso \tnivel básicoo\b de java, \ninicia el 22 de abrr\bil del 2024 \ny finalizaa\b el 26 de abril del \t2024\n");
    }

    private static void exercise4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        final String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    private static void exercise5() {
        final String name = JOptionPane.showInputDialog("Enter a name");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }

    private static void exercise6() {
        final String shortcut = "soutv";
        System.out.println("shortcut = " + shortcut);// shortcut: soutv
    }

    private static void exercise7() {
        final String fileName = "Imagen_de_un_perro.jpg";
        final int dotIndex = fileName.indexOf(".");
        final String extension = fileName.substring(dotIndex + 1);
        System.out.println("Extensión del archivo = " + extension.toUpperCase());
    }

    private static void exercise8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** FACTURA ****");
        System.out.print("Nombre del primer producto: ");
        final String np1 = sc.nextLine();
        System.out.print("Precio del primer producto: ");
        final Double pp1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nombre del segundo producto: ");
        final String np2 = sc.nextLine();
        System.out.print("Precio del segundo producto: ");
        final Double pp2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nombre del comprador: ");
        final String nc = sc.nextLine();
        final String subtotal = "\tSUBTOTAL" +
                "\n\t\tProducto1: " + np1 + ", $" + pp1 +
                "\n\t\tProducto2: " + np2 + ", $" + pp2 +
                "\n\t\tSubtotal (antes de impuestos): " + (pp1 + pp2);
        System.out.println(subtotal);
        final double impuestos = ((pp1 + pp2) * 0.19);
        final String total = "\tTOTAL" +
                "\n\t\tImpuestos (19%): $" + impuestos +
                "\n\t\tTotal (con impuestos): " + ((pp1 + pp2) + impuestos);
        System.out.println(total);
        System.out.println(nc + ", Gracias por tu compra!");
    }

    public static void main(String[] args) {
        /*
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/

        //System.out.println("works!");

        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        exercise7();
        //exercise8();
    }
}
