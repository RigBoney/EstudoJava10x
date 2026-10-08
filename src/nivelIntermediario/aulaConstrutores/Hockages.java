package nivelIntermediario.aulaConstrutores;

public class Hockages implements informacoes {

    //variaveis que vao receber os argumentos do construtor
    String nome;
    int idade;
    boolean vivoOuNao;
    double altura;
    double peso;
    String sexo;
    String aldeia;

    public Hockages(String nome, int idade, boolean vivoOuNao, double altura, double peso, String sexo, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.aldeia = aldeia;
    }

    public Hockages() {
    }

    //chamando o metodo para mostrar as informacoes colocadas no construtor
    @Override
    public void mostrarInformacoes() {
        if (this.vivoOuNao){
            System.out.println("Nome do Hockage: " + nome + " - Idade (atual ou de morte): " + idade + " - Status: " + " Vivo");
        }else {
            System.out.println("Nome do Hockage: " + nome + " - Idade (atual ou de morte): " + idade + " - Status: " + "Morto");

        }
    }

}
