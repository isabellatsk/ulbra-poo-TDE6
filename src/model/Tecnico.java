package model;

public class Tecnico extends Pessoa {
    private String registro;
    private String setor;

    public Tecnico(
            String nome,
            String documento,
            Endereco endereco,
            String registro,
            String setor) {
        super(nome, documento, endereco);
        this.registro = registro;
        this.setor = setor;
    }

    @Override
    public void imprimirDadosEspecificos() {
        System.out.println("\n===== DADOS DO TÉCNICO =====");
        System.out.println("Registro: " + registro);
        System.out.println("Setor: " + setor);
    }
}