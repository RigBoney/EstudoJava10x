package nivelIntermediario.aulaClassesAbstratas;

public class UzumakiAbstratas extends NinjaAbstratas{

    //construtor do objeto retirado da superclasse
    public UzumakiAbstratas(String nome, int idade, String sexo, String aldeia) {
        super(nome, idade, sexo, aldeia);
    }

    //esse metodo nao precisa do override pois ele veio da classe abstrata
    public void mostrarInformacoes() {
        System.out.println("Informações do Ninja: " + nome + " - " +  idade + " - " + sexo + " - " + aldeia + ".");
        System.out.println("Este é um Uzumaki.");
    }

    //esse precisa, pois ele veio do polimorfismo de uma classe que implementou uma interface, que sempre precisa do override
    @Override
    public void EstrategiaDeBatalha() {
        super.EstrategiaDeBatalha();
        System.out.println("isso é algo a mais na batalha.");
    }
}
