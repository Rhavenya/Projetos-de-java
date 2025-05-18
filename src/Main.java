import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome = "Marcelo Filho";
        String tipoConta = "Corrente";
        double saldoCliente = 3400;
        int opcao = 0; // dados do cliente, o int opcao é para o loop no while parar quando for digitado 4.

        System.out.println("Dados do cliente: \n" +
                "Nome do cliente: " + nome + "\n" +
                "Tipo de conta: " + tipoConta + "\n" +
                "Saldo atual: " + saldoCliente);

        while (opcao != 4) {

            String menu = """
                    **Digite sua opção:**
                    1 - Consultar saldo
                    2 - Transferir valor
                    3 - Receber valor
                    4 - Sair
                    
                    """;

            Scanner leitura = new Scanner(System.in);
            while (opcao != 4) {
                System.out.println(menu);
                opcao = leitura.nextInt();

                if (opcao == 1) {
                    System.out.println("O saldo atualizado é: " + saldoCliente);
                } else if (opcao == 2) {
                    System.out.println("Qual o valor que deseja transferir? ");
                    double valorTransf = leitura.nextDouble();
                    if (valorTransf > saldoCliente) {
                        System.out.println("Não há saldo para realizar a transferência!");
                    } else {
                        saldoCliente -= valorTransf;
                        System.out.println("Novo saldo: " + saldoCliente);
                    }

                } else if (opcao == 3) {
                    System.out.println("Valor recebido: ");
                    double valorTransf = leitura.nextDouble();
                    saldoCliente += valorTransf;
                    System.out.println(" Novo Saldo: " + saldoCliente);
                } else if (opcao != 4) {
                    System.out.println("Opção inválida!");
                }
            }
        }
    }
}
