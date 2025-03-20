package br.edu.insper.desagil.aps5.insee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgendaTest {
    private Agenda agenda;

    @BeforeEach
    void constroi(){agenda = new Agenda(); }

    @Test
    void adicionaValido() {
        DataTempo inicio = new DataTempo(new Data(2024, 5, 10), new Tempo(10, 0));
        DataTempo fim = new DataTempo(new Data(2024, 8, 10), new Tempo(12, 0));
        Evento evento = new Evento(inicio, fim);
        agenda.adiciona(evento);
        assertEquals(1, agenda.getEventos().size());
    }

    @Test
    void adicionaInvalido() {
        DataTempo inicio = new DataTempo(new Data(2024, 5, 10), new Tempo(10, 0));
        DataTempo fim = new DataTempo(new Data(2024, 3, 10), new Tempo(16, 0));
        Evento evento = new Evento(inicio, fim);
        agenda.adiciona(evento);

    }



}
