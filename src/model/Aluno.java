package model;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(
            String nome,
            String documento,
            Endereco endereco,
            String matricula,
            String curso) {
        super(nome, documento, endereco);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public void imprimirDadosEspecificos() {
        System.out.println("\n===== DADOS DO ALUNO =====");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}