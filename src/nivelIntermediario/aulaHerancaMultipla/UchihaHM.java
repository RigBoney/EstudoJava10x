package nivelIntermediario.aulaHerancaMultipla;

public class UchihaHM extends NinjaHM implements AtivarSharinganHM{

    //construtor usando super pois veio da superclasse

    public UchihaHM(String nome, int idade, String rank, String habilidade) {
        super(nome, idade, rank, habilidade);
    }

    //metodo para falar quem é o personagem
    @Override
    public void apresentacao() {
        super.apresentacao();
    }

    //metodo da interface

    @Override
    public void AtivarSharinganHM(){
        System.out.println("Acabei de ativar meu Sharingan!");
    }
}
