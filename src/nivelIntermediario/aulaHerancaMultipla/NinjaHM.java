package nivelIntermediario.aulaHerancaMultipla;

public class NinjaHM {

    protected String nome;
    protected int idade;
    protected String rank;
    protected String habilidade;
    protected int batalhas;

    public NinjaHM(String nome, int idade, String rank, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
        this.habilidade = habilidade;
    }

    public NinjaHM(String nome, int idade, String rank, String habilidade, int batalhas) {
        this(nome, idade, rank, habilidade);
        this.batalhas = batalhas;
    }

    public void apresentacao() {
        System.out.println("Olá, me chamo " + nome + " e sou um " + getClass().getSimpleName());
        System.out.println("Ja participei de " + batalhas + " batalhas!");

    }
}
