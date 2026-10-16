package nivelIntermediario.aulaClassesAbstratas;

public class UchihaAbstratas extends NinjaAbstratas {

    //construtor do objeto retirado da superclasse
    public UchihaAbstratas(String nome, int idade, String sexo, String aldeia) {
        super(nome, idade, sexo, aldeia);
    }

    //esse metodo nao precisa do override pois ele veio da classe abstrata
    public void mostrarInformacoes() {
        System.out.println("Informações do Ninja: " + nome + " - " +  idade + " - " + sexo + " - " + aldeia + ".");
        System.out.println("Este é um Uchiha.");
    }

    //esse precisa, pois ele veio do polimorfismo de uma classe que implementou uma interface, que sempre precisa do override
    @Override
    public void EstrategiaDeBatalha() {
        super.EstrategiaDeBatalha();
    }
}
