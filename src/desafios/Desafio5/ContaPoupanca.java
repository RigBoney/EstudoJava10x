package desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double valor){
        super(valor, TipoConta.POUPANCA);
    }
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            double valorPoupanca = valor * 0.99;
            somarSaldo(valorPoupanca);
            System.out.println("Depositado com sucesso");
        }else {
            System.out.println("Não é possivel depositar essa quantia.");
        }
    }
}
