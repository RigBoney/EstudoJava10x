package nivelIntermediario.aulaInterfaces;

public class Naruto implements Ninja{

    @Override
    public void usarJutsu() {
        System.out.println("Uzumaki usa rasengan!");
    }

    @Override
    public void usarTaijutsu() {
        System.out.println("Uzumaki da um soco saindo da terra!");
    }
}
