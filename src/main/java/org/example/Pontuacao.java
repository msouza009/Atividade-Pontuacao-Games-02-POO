package org.example;

public class Pontuacao {
    private int pontuacao;

    public Pontuacao() {
        this.pontuacao = 0;
    }

    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
        }
    }

    public void removerPontos(int pontos) {
        if (pontos > 0 && this.pontuacao >= pontos) {
            this.pontuacao -= pontos;
        }
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public static void main(String[] args) {
        Pontuacao pontuacao = new Pontuacao();

        pontuacao.adicionarPontos(10);
        System.out.println("Pontuação após adicionar 10 pontos: " + pontuacao.getPontuacao());

        pontuacao.removerPontos(5);
        System.out.println("Pontuação após remover 5 pontos: " + pontuacao.getPontuacao());

        pontuacao.removerPontos(15);
        System.out.println("Tentativa de remover 15 pontos: " + pontuacao.getPontuacao());
    }
}
