package model;

public class Professor extends Pessoa {
    private String siape;
    private String area;

    public Professor(
            String nome,
            String documento,
            Endereco endereco,
            String siape,
            String area) {
        super(nome, documento, endereco);
        this.siape = siape;
        this.area = area;
    }

    @Override
    public void imprimirDadosEspecificos() {
        System.out.println("\n===== DADOS DO PROFESSOR =====");
        System.out.println("SIAPE: " + siape);
        System.out.println("Área: " + area);
    }
}