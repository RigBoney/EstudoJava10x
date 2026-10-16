package nivelIntermediario.aulaHerancaMultipla;

public class MainHerancaMultipla {
    public static void main(String[] args) {

        HatakeHM kakashi = new HatakeHM("kakashi", 26, "A", "Copiar");
        kakashi.apresentacao();
        kakashi.AtivarSharinganHM();
        kakashi.AtivarMangekio();
        System.out.println();

        UchihaHM sasuke = new UchihaHM("sasuke", 16, "A", "Chidori");
        sasuke.apresentacao();
        sasuke.AtivarSharinganHM();
    }

}
