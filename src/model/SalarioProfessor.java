package model;

public class SalarioProfessor extends Rendimento {
    private int titulacao;

    public SalarioProfessor(
            String descricao,
            double valorBase,
            int titulacao) {
        super(descricao, valorBase);
        this.titulacao = titulacao;
    }

    @Override
    public double calcularValor() {
        switch (titulacao) {
            case 1:
                return valorBase;
            case 2:
                return valorBase * 1.20;
            case 3:
                return valorBase * 1.40;
            default:
                return valorBase;
        }
    }
}
