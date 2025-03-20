package br.edu.insper.desagil.aps5.insee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    @Test
    void constroi() {
        Data data = new Data();
        assertEquals(1,data.getDia());
        assertEquals(1,data.getMes());
        assertEquals(1970,data.getAno());
    }

    @Test
    void naoAtualizaMenor() {
        Data data = new Data();
        data.atualiza(1969,0,0);
        assertEquals(1,data.getDia());
        assertEquals(1,data.getMes());
        assertEquals(1970,data.getAno());
    }

    @Test
    void atualizaMaior() {
        Data data = new Data();
        data.atualiza(2024,13,32);
        assertEquals(31,data.getDia());
        assertEquals(12,data.getMes());
        assertEquals(2024,data.getAno());
    }

    @Test
    void atualiza() {
        Data data = new Data();
        data.atualiza(2024,9,26);
        assertEquals(26,data.getDia());
        assertEquals(9,data.getMes());
        assertEquals(2024,data.getAno());
    }

    @Test
    void comoZero() {
        Data data = new Data();
        assertEquals(0,data.comoInteiro());
    }

    @Test
    void comoAgora() {
        Data data = new Data();
        data.atualiza(2024,9,26);
        assertEquals(19978,data.comoInteiro());
    }
}