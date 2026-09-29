package model;

public class Endereco {
    private String rua;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(String rua, String cidade, String uf, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public void imprimir() {
        System.out.println("Rua: " + rua);
        System.out.println("Cidade: " + cidade);
        System.out.println("UF: " + uf);
        System.out.println("CEP: " + cep);
    }
}
