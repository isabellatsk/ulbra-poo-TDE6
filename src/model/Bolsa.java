package model;

public class Bolsa extends Rendimento {
    private int tipo;

    public Bolsa(String descricao, double valorBase, int tipo) {
        super(descricao, valorBase);
        this.tipo = tipo;
    }

    @Override
    public double calcularValor() {
        if (tipo == 1) {
            return valorBase;
        }
        return valorBase * 0.50;
    }
}
