package br.edu.insper.desagil.aps5.insee;

public abstract class Tempo extends Referencia {
    private int hora;
    private int minuto;

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
    }
    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }

    public void atualiza(int hora,int minuto) {
        if (hora < 0) {
            this.hora = 0;
        }
        else if (hora > 23) {
            this.hora = 23;
        }
        else if (minuto < 0) {
            this.minuto = 0;
        }
        else if (minuto > 59) {
            this.minuto = 59;
        }
    }

    @Override
    public int comoInteiro() {
        int mins = 0;
        mins+= minuto + (hora*60);

        return mins;
    }
}
