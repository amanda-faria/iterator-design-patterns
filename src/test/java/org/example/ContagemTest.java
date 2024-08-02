package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContagemTest {

    @Test
    void deveContarJogadoresPremium() {
        Jogo jogo = new Jogo(
                new Jogador("Duduzinho01", true),
                new Jogador("Mari@Toninha", true),
                new Jogador("11Melancia", false),
                new Jogador("Comandy", true)
        );
        assertEquals(3, Contagem.contarJogadoresPremium(jogo));
    }

    @Test
    void deveContarTotalJogadores() {
        Jogo jogo = new Jogo(
                new Jogador("Comandy", true),
                new Jogador("Jogador02", true),
                new Jogador("JosePaulim", false),
                new Jogador("MariaLinda", true)
        );
        assertEquals(4, Contagem.contarTotalJogadores(jogo));
    }

}