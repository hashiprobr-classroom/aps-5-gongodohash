package br.edu.insper.desagil.aps5.insee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgendaTest {
    @Test
    void constroi() {
        Agenda agenda = new Agenda();
        int size =  agenda.getEventos().size();
        assertEquals(0,size);
    }


    @Test
    void adicionaValido() {
        Agenda agenda = new Agenda();
        Data inicio = new Data();
        Tempo tempoInicio = new Tempo();
        Data fim = new Data();
        Tempo tempoFim = new Tempo();
        inicio.atualiza(2023,6,14);
        fim.atualiza(2023,6,15);
        tempoInicio.atualiza(4,45);
        tempoFim.atualiza(19,0);
        DataTempo dTInicio = new DataTempo(inicio, tempoInicio);
        DataTempo dTFim = new DataTempo(fim, tempoFim);
        Evento evento = new Evento(dTInicio, dTFim);
        agenda.adiciona(evento);

    }

    @Test
    void adicionaInvalido() {

    }
}
