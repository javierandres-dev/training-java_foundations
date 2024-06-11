import java.text.DecimalFormat;
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
        sc.close();
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
        sc.close();
        final String subtotal = "\tSUBTOTAL" +
                "\n\t\tProducto1: " + np1 + ", $" + pp1 +
                "\n\t\tProducto2: " + np2 + ", $" + pp2 +
                "\n\t\tSubtotal (antes de impuestos): " + (pp1 + pp2);
        System.out.println(subtotal);
        final double impuestos = ((pp1 + pp2) * 0.19);
        final DecimalFormat decimalFormat = new DecimalFormat("0.00");
        final String total = "\tTOTAL" +
                "\n\t\tImpuestos (19%): $" + impuestos +
                "\n\t\tTotal (con impuestos): " + decimalFormat.format(((pp1 + pp2) + impuestos));
        System.out.println(total);
        System.out.println("**** " + nc + ", Gracias por tu compra! ****");
    }

    private static void exercise9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        final int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        final int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        final int n3 = sc.nextInt();
        sc.close();
        if (n1 == n2 && n1 == n3) {
            System.out.println("\tLos tres números son iguales");
        } else if (n1 > n2 && n1 > n3) {
            System.out.println("\tEl mayor número es el primer número ingresado: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("\tEl mayor número es el segundo ingresado: " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("\tEl mayor número es el tercer ingresado: " + n3);
        } else {
            System.out.println("\t¿qué pasó?");
        }
    }

    private static void exercise10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el alto: ");
        final int height = sc.nextInt();
        System.out.print("Ingrese el ancho: ");
        final int width = sc.nextInt();
        sc.close();
        System.out.println("\tÁrea: " + (height * width));
        System.out.println("\tPerímetro: " + ((height + width) * 2));
    }

    private static void exercise11() {
        final String validUsername = "Pepita";
        final String validPassword = "ASD123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre de usuario: ");
        final String username = sc.nextLine();
        System.out.print("Ingrese contraseña: ");
        final String password = sc.nextLine();
        sc.close();
        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("\tHola, " + username + "!\n\tSu acceso está aprobado");
        } else {
            System.out.println("\tAcceso denegado");
        }
    }

    private static void exercise12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del sueldo: ");
        final Double sueldoInicial = sc.nextDouble();
        if (sueldoInicial >= 500) {
            sc.close();
            System.out.println("\tSueldo sin cambios: " + sueldoInicial);
        } else {
            System.out.print("Ingrese años de antigüedad: ");
            final int anios = sc.nextInt();
            sc.close();
            Double porcentajeAumento = 0.0;
            if (sueldoInicial < 500 && anios >= 10) {
                porcentajeAumento = 0.20;
            }
            if (sueldoInicial < 500 && anios < 10) {
                porcentajeAumento = 0.05;
            }
            final Double valorAumento = sueldoInicial * porcentajeAumento;
            final Double sueldoFinal = sueldoInicial + valorAumento;
            System.out.println("\tSueldo inicial: " + sueldoInicial +
                    "\n\tValor aumento: " + valorAumento + ", correspondiente al " + (porcentajeAumento * 100) + "% " +
                    "por antigüedad de " + anios + " años" +
                    "\n\tSueldo final: " + sueldoFinal);
        }
    }

    private static void exercise13() {
        final byte option = Byte.parseByte(JOptionPane.showInputDialog("**** CALCULATOR ****\n\tSelect an option:\n\t1 - Add\n\t2 - Substract\n\t3 - Multiply\n\t4 - Divide"));
        final int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        final int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
        String operation = "";
        int result = 0;
        switch (option) {
            case 1:
                operation = " + ";
                result = n1 + n2;
                break;
            case 2:
                operation = " - ";
                result = n1 - n2;
                break;
            case 3:
                operation = " x ";
                result = n1 * n2;
                break;
            case 4:
                operation = " / ";
                result = n1 / n2;
                break;
            default:
                break;
        }
        if (!operation.isEmpty() && result != 0) {
            JOptionPane.showMessageDialog(null, n1 + operation + n2 + " = " + result);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid");
        }
    }

    private static void exercise14() {
        final Scanner sc = new Scanner(System.in);
        byte mayores = 0;
        byte menores = 0;
        byte iguales = 0;
        for (byte i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota #" + i + ": ");
            final byte nota = sc.nextByte();
            sc.nextLine();
            if (nota > 7) {
                mayores++;
                System.out.println("\tLa nota #" + i + " es mayor a 7");
            } else if (nota < 7) {
                menores++;
                System.out.println("\tLa nota #" + i + " es menor a 7");
            } else {
                iguales++;
                System.out.println("\tLa nota #" + i + " es igual a 7");
            }
        }
        sc.close();
        System.out.println("\n\t**** Total de notas ****\n\tMayores a 7: " + mayores +
                "\n\tMenores a 7: " + menores + "\n\tIguales a 7: " + iguales);
    }

    private static void exercise15() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t**** Circunferencia de un círculo ****\n\tIngrese el radio: ");
        final double radio = sc.nextDouble();
        sc.close();
        System.out.println("\tLa circunferencia de un círculo cuyo radio es de " + radio + " es: " + (radio * 2) * 3.141592);
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
        //exercise7();
        //exercise8();
        //exercise9();
        //exercise10();
        //exercise11();
        //exercise12();
        //exercise13();
        //exercise14();
        //exercise15();
    }
}
