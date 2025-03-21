package br.edu.insper.desagil.aps5.isail;

public class ItemEspecial extends Item {
    public static final int LANCEMAX = 1000000;

    public ItemEspecial(String nome, double minimo) {
        super(nome, minimo);
    }

    @Override
    public void fazLance(Comprador comprador, double oferta) {
        if (oferta >= LANCEMAX) {
            super.fazLance(comprador, oferta); // Chama o método da classe pai
        }
    }
}
