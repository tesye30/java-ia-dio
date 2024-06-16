import java.util.Scanner;

public class ContaBancaria {
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(nomeTitular);

        System.out.print("Digite o valor do depósito inicial: ");
        double valorInicial = scanner.nextDouble();
        conta.depositar(valorInicial);

        System.out.print("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("Saldo final: R$" + conta.consultarSaldo());

        scanner.close();
    }
}
