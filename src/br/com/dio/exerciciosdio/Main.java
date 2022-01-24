package br.com.dio.exerciciosdio;

public class Main {
    public static void main(String[] args){

        System.out.println("\nExercício Calculadora");
        Calculadora2.soma(3, 6);
        Calculadora2.subtracao(9,1.8);
        Calculadora2.multiplicacao(7,8);
        Calculadora2.divisao(5.2,5);

        //Mensagem
        System.out.println("\nExercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("\nExercício Empréstimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,5);









    }
}



