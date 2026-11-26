package desafios.Desafio5;

public abstract class ContaBancaria implements Conta {


    private double saldo;
    private TipoConta tipoConta;
    public ContaBancaria(double saldo, TipoConta  tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    protected void somarSaldo(double valor) {
        saldo += valor;
    }
    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual conta: " + consultarSaldo() + " R$.");
    }

    protected void subtrairSaldo(double valor) {
        saldo -= valor;
    }

    protected void taxaBancaria(double valor) {

    }
}
