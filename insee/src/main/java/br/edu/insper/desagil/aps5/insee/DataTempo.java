package br.edu.insper.desagil.aps5.insee;

public abstract class DataTempo extends Referencia {
    private Data data;
    private Tempo tempo;

    public DataTempo(Data data, Tempo tempo) {
        this.data = data;
        this.tempo = tempo;
    }

    public Data getData() {
        return data;
    }

    public Tempo getTempo() {
        return tempo;
    }

    @Override
    public int comoInteiro() {
        int tempototal = 0;
        int diascorridos = data.comoInteiro();
        int minutospassados = tempo.comoInteiro();

        tempototal+= ((diascorridos*24*60) + minutospassados);

        return tempototal;

        }
    }


