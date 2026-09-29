package model;

public abstract class Rendimento implements Calculavel {
    protected String descricao;
    protected double valorBase;

    public Rendimento(String descricao, double valorBase) {
        this.descricao = descricao;
        this.valorBase = valorBase;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorBase() {
        return valorBase;
    }
}
