package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro);

    }

    static class Livro {
        private String nome;
        private Integer numPaginas;

        public Livro(String nome, Integer numPaginas){
            this.nome = nome;
            this.numPaginas = numPaginas;

        }

        public String getNome(){
            return nome;
        }

        public String setNome(String nome){
            return nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }
}


