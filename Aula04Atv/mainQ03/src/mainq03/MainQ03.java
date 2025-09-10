package mainq03;

public class MainQ03 {
    public static void main(String[] args) {
        ContaBancaria cont = new ContaBancaria(1001, 500.00);

        System.out.println("Conta criada: " + cont.getNumeroConta());
        System.out.println("Saldo inicial: R$" + cont.getSaldo());

        cont.depositar(200.00);
        System.out.println("Saldo apos deposito: R$" + cont.getSaldo());

        cont.sacar(100.00);
        System.out.println("Saldo apos saque: R$" + cont.getSaldo());

        cont.sacar(700.00);
        System.out.println("Saldo final: R$" + cont.getSaldo());
    }
}