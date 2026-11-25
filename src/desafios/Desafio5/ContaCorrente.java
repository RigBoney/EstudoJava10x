package desafios.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double valor){
        super(valor, TipoConta.CORRENTE);
    }
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            somarSaldo(valor);
            System.out.println("Deposito efetuado com sucesso!");
        }else {
            System.out.println("Não é possivel depositar essa quantia.");
        }
    }
}
