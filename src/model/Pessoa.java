package model;
import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    protected String nome;
    protected String documento;
    protected Endereco endereco;
    protected List<Rendimento> rendimentos;

    public Pessoa(
            String nome,
            String documento,
            Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.rendimentos = new ArrayList<>();
    }

    public void adicionarRendimento(Rendimento rendimento) {
        rendimentos.add(rendimento);
    }

    public double calcularTotal() {
        double total = 0;
        for (Rendimento rendimento : rendimentos) {
            total += rendimento.calcularValor();
        }
        return total;
    }

    public void imprimirDados() {
        System.out.println("\n===== DADOS DA PESSOA =====");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + documento);
        System.out.println("\n===== ENDEREÇO =====");
        endereco.imprimir();
    }

    public void imprimirRendimentos() {
        System.out.println("\n===== RENDIMENTOS =====");

        for (Rendimento rendimento : rendimentos) {
            System.out.println(
                    "Descrição: " + rendimento.getDescricao()
            );
            System.out.printf(
                    "Valor base: R$ %.2f%n",
                    rendimento.getValorBase()
            );
            System.out.printf(
                    "Valor calculado: R$ %.2f%n",
                    rendimento.calcularValor()
            );
        }
        System.out.printf(
                "TOTAL GERAL: R$ %.2f%n",
                calcularTotal()
        );
    }

    public abstract void imprimirDadosEspecificos();
}