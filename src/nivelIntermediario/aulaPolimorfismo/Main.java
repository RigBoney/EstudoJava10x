package nivelIntermediario.aulaPolimorfismo;

public class Main {
    public static void main(String[] args) {

    Uzumaki naruto = new Uzumaki();
    naruto.nome = "Naruto Uzumaki";
    naruto.idade = 18;
    naruto.aldeia = "Konoha";
    naruto.habilidadeEspecial();
        System.out.println();

    Uchiha sasuke = new Uchiha();
    sasuke.nome = "Sasuke Uchiha";
    sasuke.idade = 18;
    sasuke.aldeia = "Konoha";
    sasuke.habilidadeEspecial();

    }
}
