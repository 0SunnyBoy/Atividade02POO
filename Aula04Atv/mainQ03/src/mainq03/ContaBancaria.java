package mainq03;
public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito no valor de R$" + valor + " realizado");
        } else {
            System.out.println("valor invalido");
        }
    }
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque no valor de R$" + valor + " realizado");
        } else {
            System.out.println("Saque nao realizado, o valor e insuficiente ou invalido");
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public int getNumeroConta(){
        return numeroConta;
    }
}