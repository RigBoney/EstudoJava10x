package nivelIntermediario.aulaHerancaMultipla;

public class NinjaHM {

    String nome;
    int idade;
    String rank;
    String habilidade;

    public NinjaHM(String nome, int idade, String rank, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
        this.habilidade = habilidade;
    }

    public void apresentacao() {
        System.out.println("Olá, me chamo " + nome + " e sou um " + getClass().getSimpleName() );

    }
}
