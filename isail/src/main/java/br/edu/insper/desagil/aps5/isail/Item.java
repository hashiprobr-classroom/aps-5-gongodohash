package br.edu.insper.desagil.aps5.isail;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nome;
    private double minimo;
    private List<Lance> lances;

    public Item(String nome, double minimo) {
        this.nome = nome;
        this.minimo = minimo;
        this.lances = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void fazLance(Comprador comprador, double oferta) {
        if (oferta < minimo) {
            return;
        }

        if (!lances.isEmpty()) {
            Lance maiorLance = lances.get(0);
            for (Lance lance : lances) {
                if (lance.getOferta() > maiorLance.getOferta()) {
                    maiorLance = lance;
                }
            }
            if (oferta <= maiorLance.getOferta()) {
                return;
            }
        }

        Lance novoLance = new Lance(comprador, oferta);
        lances.add(novoLance);

        comprador.incrementa();
    }

    public void imprimeMelhorLance() {
        if (lances.isEmpty()) {
            System.out.println("Nenhum lance foi feito ainda!");
        } else {
            // Encontrar o maior lance
            Lance maiorLance = lances.get(0);
            for (Lance lance : lances) {
                if (lance.getOferta() > maiorLance.getOferta()) {
                    maiorLance = lance;
                }
            }
            System.out.println(maiorLance.getComprador().getNome() + " ofereceu " + maiorLance.getOferta() + " (" + maiorLance.getMomento() + ")");
        }
    }
}
