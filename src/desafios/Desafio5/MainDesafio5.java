package desafios.Desafio5;

public class MainDesafio5 {

    public static void main(String[] args) {

        ContaBancaria contaYuri =  new ContaCorrente(2000);
        ContaBancaria contaDavid = new ContaPoupanca(4000);
        BancoKonoha bancoKonoha = new BancoKonoha();

        contaYuri.mostrarSaldo();
        contaDavid.mostrarSaldo();
        bancoKonoha.transferir(750, contaYuri, contaDavid, 3);

        contaYuri.mostrarSaldo();
        contaDavid.mostrarSaldo();
    }
}
