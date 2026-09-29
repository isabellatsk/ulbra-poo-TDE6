package model;

public class SalarioTecnico extends Rendimento {
    private int nivel;

    public SalarioTecnico(
            String descricao,
            double valorBase,
            int nivel) {

        super(descricao, valorBase);
        this.nivel = nivel;
    }

    @Override
    public double calcularValor() {

        switch (nivel) {
            case 1:
                return valorBase;
            case 2:
                return valorBase * 1.15;
            case 3:
                return valorBase * 1.30;
            default:
                return valorBase;
        }
    }
}
