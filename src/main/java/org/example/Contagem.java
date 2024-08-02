package org.example;
import java.util.Iterator;
public class Contagem {

    public static Integer contarJogadoresPremium(Jogo jogo) {
        int quantidade = 0;
        for (Jogador jogador : jogo) {
            if (jogador.isPremium()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalJogadores(Jogo jogo) {
        int quantidade = 0;
        for (Iterator a = jogo.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}