package br.com.dio.metodosJava;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nExercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5.2, 5);

        //Mensagem
        System.out.println("\nExercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("\nExercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, 5);

        //Return
        System.out.println("\nExercício return");

        double areaQuadrado = Quadrilatero.area(1);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}

