
import java.util.Scanner;

public class Simulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo a sua conta Java, vamos iniciar sua sessão?");

        String asteristicos = """
                ****************************************
                """;

        System.out.println("Digite seu primeiro nome para acessar a conta.");
        String cliente = leitor.next();
        String mensagem1 = """
                Acessar conta corrente ou poupança? 
                digite 1 para corrente     digite 2 para poupança
                """;
        System.out.println(mensagem1);
        int tipoDeConta = leitor.nextInt();
        int saldo = 3700;

        System.out.println(asteristicos);
        System.out.println("Dados do Cliente");
        System.out.println("Cliente:" + cliente);
        if (tipoDeConta == 1) {
            System.out.println("Conta: Corrente");
            System.out.println("Saldo:" + "R$" + saldo);
        } else {
            System.out.println("Conta: Poupança");
            System.out.println("Você não possui conta poupança");
        }
        ;
        System.out.println(asteristicos);

        String operacao = """
                Qual operação deseja realizar?
                1- Tranferência bancaria
                2- Saque
                3- Deposito
                4- Sair
                """;

        int opcaoDeOperacoes = 0;

        while (opcaoDeOperacoes != 4) {
            System.out.println(operacao);
            opcaoDeOperacoes = leitor.nextInt();

            if (opcaoDeOperacoes == 1) {
                System.out.println("Quanto deseja tranferir?");

                int valorDeTransferencia = leitor.nextInt();

                if (valorDeTransferencia <= saldo) {
                    System.out.println("Transferencia concluida");
                    System.out.println("Seu saldo agora é:" + "R$" + (saldo - valorDeTransferencia));
                    saldo -= valorDeTransferencia;
                } else {
                    System.out.println("Saldo insuficiente para concluir a transferência.");
                    System.out.println("Seu saldo é de:" + "R$" + saldo);
                }
            }

            if (opcaoDeOperacoes == 2) {
                System.out.println("Quanto deseja sacar?");

                int valorDeSaque = leitor.nextInt();

                if (valorDeSaque <= saldo) {
                    System.out.println("Saque realizado");
                    System.out.println("Seu saldo agora é de:" + "R$" + (saldo - valorDeSaque));
                    saldo -= valorDeSaque;
                } else {
                    System.out.println("valor insuficiente para saque");
                    System.out.println("Seu saldo é de:" + "R$" + saldo);
                }

            }


            if (opcaoDeOperacoes == 3) {
                System.out.println("Quanto deseja depositar?");

                int valorDeDeposito = leitor.nextInt();
                int valorInvalido = 0;

                if (valorDeDeposito > valorInvalido) {
                    System.out.println("Deposito realizado");
                    System.out.println("Seu saldo agora é de:" + "R$" + (saldo + valorDeDeposito));
                    saldo += valorDeDeposito;
                } else {
                    System.out.println("Nada foi depositado");
                }
            }
            if (opcaoDeOperacoes == 4) {
                System.out.println("Operação Finalizada. Obrigado por consultar sua conta bancária!");
            }
        }
    }
}