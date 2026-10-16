package nivelIntermediario.aulaHerancaMultipla;

public class HatakeHM extends NinjaHM implements AtivarSharinganHM, AtivarMangekio, NinjaDeElite {

    //construtor usando super pois veio da superclasse
    public HatakeHM(String nome, int idade, String rank, String habilidade) {
        super(nome, idade, rank, habilidade);
    }

    //metodo para falar quem é o personagem
    @Override
    public void apresentacao() {
        super.apresentacao();
    }

    @Override
    public void AtivarSharinganHM(){
        System.out.println("Acabei de ativar meu Sharingan!");
    }
    @Override
    public void AtivarMangekio(){
        System.out.println("Acabei de ativar meu Mangekio!");
    }

    //metodo da interface
    @Override
    public void ninjaDeElite(){
        System.out.println("Eu sou um ninja de elite da AMBU!");
    }
}
