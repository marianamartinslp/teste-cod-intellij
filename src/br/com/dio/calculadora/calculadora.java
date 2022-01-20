package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scanner.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("O resultado da soma é: " + somar);
        System.out.println("O resultado da subtração é: " + subtrair);
        System.out.println("O resultado da multiplicação é: " + multiplicar);
        System.out.println("O resultado da divisão é: " + dividir);

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;

    }

}
