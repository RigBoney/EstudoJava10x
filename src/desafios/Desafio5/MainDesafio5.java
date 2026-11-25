package desafios.Desafio5;

public class MainDesafio5 {

    public static void main(String[] args) {

        ContaBancaria contaYuri =  new ContaCorrente(1000);
        contaYuri.depositar(500);
        contaYuri.mostrarSaldo();
        ContaBancaria contaDavid = new ContaPoupanca(5000);
        contaDavid.depositar(500);
        contaDavid.mostrarSaldo();
    }
}
