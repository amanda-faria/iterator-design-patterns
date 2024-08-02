package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Jogo implements Iterable<Jogador>{

    private List<Jogador> jogador = new ArrayList<Jogador>();

    public Jogo(Jogador... jogador) {
        this.jogador = Arrays.asList(jogador);
    }

    @Override
    public Iterator<Jogador> iterator() {
        return jogador.iterator();
    }

}