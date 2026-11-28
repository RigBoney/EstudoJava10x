package nivelIntermediario.aulaGettersAndSetters;

public class TesteDeGetAndSet {

    private String nome;
    private int idade;
    private String sexo;
    private int numeroDeMissoes;

    public TesteDeGetAndSet() {
    }

    public TesteDeGetAndSet(String nome, int idade, String sexo, int numeroDeMissoes) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.numeroDeMissoes = numeroDeMissoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumeroDeMissoes() {
        return numeroDeMissoes;
    }

    public void setNumeroDeMissoes(int numeroDeMissoes) {
        this.numeroDeMissoes = numeroDeMissoes;
    }
}
