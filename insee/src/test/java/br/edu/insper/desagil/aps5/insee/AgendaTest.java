package br.edu.insper.desagil.aps5.insee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaTest {
    private Agenda agenda;
    private Data dInicio;
    private Data dFim;
    private Tempo tInicio;
    private Tempo tFim;

    @BeforeEach
    void seTup() {
        agenda = new Agenda();
        dInicio = new Data();
        dFim = new Data();
        tInicio = new Tempo();
        tFim = new Tempo();
    }

    @Test
    void constroi() {
        int size =  agenda.getEventos().size();
        assertEquals(0,size);
    }

    @Test
    void adicionaValido() {
        dInicio.atualiza(2023,6,14);
        dFim.atualiza(2023,6,15);
        tInicio.atualiza(4,45);
        tFim.atualiza(19,0);
        DataTempo dTInicio = new DataTempo(dInicio, tInicio);
        DataTempo dTFim = new DataTempo(dFim, tFim);
        Evento evento = new Evento(dTInicio, dTFim);
        agenda.adiciona(evento);
        assertEquals(evento, agenda.getEventos().get(0));
    }

    @Test
    void adicionaInvalido() {
        dInicio.atualiza(2023,6,14);
        dFim.atualiza(2022,6,15);
        tInicio.atualiza(4,45);
        tFim.atualiza(19,0);
        DataTempo dTInicio = new DataTempo(dInicio, tInicio);
        DataTempo dTFim = new DataTempo(dFim, tFim);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Evento evento = new Evento(dTInicio, dTFim);
            agenda.adiciona(evento);
        });
        // assertTrue(exception.getMessage().contains("IllegalArgumentException"));
        assertEquals("Evento inválido!", exception.getMessage());
    }
}
