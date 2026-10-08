package nivelIntermediario.aulaInterfaces;

public class TestarNinjas {
    public static void main(String[] args) {

        Ninja naruto = new Naruto();
        Ninja sasuke = new Sasuke();

        naruto.usarJutsu();
        naruto.usarTaijutsu();
        sasuke.usarJutsu();
        sasuke.usarTaijutsu();
    }
}
