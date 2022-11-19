package EjerciciosTema3;

import java.util.Scanner;

public class PruebaFuncion {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        FuncionSuma suma = new FuncionSuma();
        Integer num1, num2, num3, result;

        System.out.println("***** SUMA DE TRES NÚMEROS ENTRE SI *****");

        System.out.print("Ingrese el valor del número 1: ");
        num1 = lector.nextInt();
        System.out.print("Ingrese el valor del número 2: ");
        num2 = lector.nextInt();
        System.out.print("Ingrese el valor del número 3: ");
        num3 = lector.nextInt();
        System.out.println("");
        result = suma.sumarNumeros(num1, num2, num3);
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);
    }
}
