package org.example;

public class Jogador {

    private String nome;
    private boolean premium;

    public Jogador(String nome, boolean premium) {
        this.nome = nome;
        this.premium = premium;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremiun(boolean premium) {
        this.premium = premium;
    }
}