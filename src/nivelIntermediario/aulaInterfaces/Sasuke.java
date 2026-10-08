package nivelIntermediario.aulaInterfaces;

public class Sasuke implements Ninja{

    public void usarJutsu(){
        System.out.println("Uchiha usa chidori!");
    }

    @Override
    public void usarTaijutsu() {
        System.out.println("Uchiha imita a lotus oculta!");
    }
}
