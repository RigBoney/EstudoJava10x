package desafios.Desafio5;

public class BancoKonoha {

    public boolean transferir(double transferencia, ContaBancaria origem, ContaBancaria destino) {
        if (origem != destino && transferencia > 0 && origem != null && transferencia <= origem.consultarSaldo() && destino != null) {
            origem.subtrairSaldo(transferencia);
            destino.depositar(transferencia);
            System.out.println("Transferencia realizada com sucesso.");
            return true;
        } else {
            System.out.println("ERRO: Impossivel transferir, verifique os dados e valores e tente novamente.");
            return false;
        }
    }

    public void transferir(double transferencia, ContaBancaria origem, ContaBancaria destino, double taxa) {
        double valorTaxa = (taxa / 100) * transferencia;
        if (origem != null && transferencia + valorTaxa > origem.consultarSaldo()) {
            System.out.println("Saldo insuficiente, tente novamente mais tarde.");
        } else {
            if (transferir(transferencia, origem, destino)) {
                origem.subtrairSaldo(valorTaxa);
            }
        }
    }
}
