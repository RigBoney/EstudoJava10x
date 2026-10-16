package nivelIntermediario.aulaClassesAbstratas;

public abstract class NinjaAbstratas implements EstrategiaDeBatalha {

    String nome;
    int idade;
    String sexo;
    String aldeia;

    public NinjaAbstratas() {
    }

    public NinjaAbstratas(String nome, int idade, String sexo, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.aldeia = aldeia;
    }

    //metodo que todas as subclasses terao
    public abstract void mostrarInformacoes();

    public void EstrategiaDeBatalha() {
        System.out.println("Isso provavelmente é uma estrategia de batalha ninja...");
    }
}
