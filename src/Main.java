import model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PESSOA
        System.out.println("===== CADASTRO DE PESSOA =====");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String documento = scanner.nextLine();

        // ENDERECO
        System.out.println("\n===== CADASTRO DE ENDEREÇO =====");

        System.out.print("Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("UF: ");
        String uf = scanner.nextLine();

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        Endereco endereco = new Endereco(
                rua,
                cidade,
                uf,
                cep
        );

        // TIPO DA PESSOA
        System.out.println("\n===== TIPO DA PESSOA =====");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        System.out.println("3 - Técnico");

        int tipoPessoa = Integer.parseInt(
                scanner.nextLine()
        );

        Pessoa pessoa;

        switch (tipoPessoa) {
            case 1:
                System.out.print("Matrícula: ");
                String matricula = scanner.nextLine();

                System.out.print("Curso: ");
                String curso = scanner.nextLine();

                pessoa = new Aluno(
                        nome,
                        documento,
                        endereco,
                        matricula,
                        curso
                );
                break;
            case 2:
                System.out.print("SIAPE: ");
                String siape = scanner.nextLine();

                System.out.print("Área: ");
                String area = scanner.nextLine();

                pessoa = new Professor(
                        nome,
                        documento,
                        endereco,
                        siape,
                        area
                );
                break;
            case 3:
                System.out.print("Registro: ");
                String registro = scanner.nextLine();

                System.out.print("Setor: ");
                String setor = scanner.nextLine();

                pessoa = new Tecnico(
                        nome,
                        documento,
                        endereco,
                        registro,
                        setor
                );
                break;
            default:
                System.out.println("Tipo inválido.");
                scanner.close();
                return;
        }

        // RENDIMENTOS
        String continuar = "";

        do {
            System.out.println("\n===== ADICIONAR RENDIMENTO =====");

            System.out.println("1 - Bolsa");
            System.out.println("2 - Salário Professor");
            System.out.println("3 - Salário Técnico");

            int tipoRendimento = Integer.parseInt(
                    scanner.nextLine()
            );

            System.out.print("Descrição: ");
            String descricao = scanner.nextLine();

            System.out.print("Valor base: ");
            double valorBase = Double.parseDouble(
                    scanner.nextLine()
            );

            Rendimento rendimento;

            switch (tipoRendimento) {
                case 1:
                    System.out.println("\n1 - Integral");
                    System.out.println("2 - Parcial");

                    int tipoBolsa = Integer.parseInt(
                            scanner.nextLine()
                    );

                    rendimento = new Bolsa(
                            descricao,
                            valorBase,
                            tipoBolsa
                    );
                    break;
                case 2:
                    System.out.println("\n1 - Graduação");
                    System.out.println("2 - Mestrado");
                    System.out.println("3 - Doutorado");

                    int titulacao = Integer.parseInt(
                            scanner.nextLine()
                    );

                    rendimento = new SalarioProfessor(
                            descricao,
                            valorBase,
                            titulacao
                    );
                    break;
                case 3:
                    System.out.println("\n1 - Júnior");
                    System.out.println("2 - Pleno");
                    System.out.println("3 - Sênior");

                    int nivel = Integer.parseInt(
                            scanner.nextLine()
                    );

                    rendimento = new SalarioTecnico(
                            descricao,
                            valorBase,
                            nivel
                    );
                    break;
                default:
                    System.out.println("Tipo inválido.");
                    continue;
            }
            pessoa.adicionarRendimento(rendimento);

            System.out.print(
                    "\nDeseja adicionar outro rendimento? (s/n): "
            );
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // RESUMO
        System.out.println("\n================================");
        pessoa.imprimirDados();
        pessoa.imprimirDadosEspecificos();
        pessoa.imprimirRendimentos();
        System.out.println("================================");

        scanner.close();
    }
}