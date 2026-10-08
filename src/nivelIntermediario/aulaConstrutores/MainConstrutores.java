package nivelIntermediario.aulaConstrutores;

public class MainConstrutores {
    public static void main(String[] args) {

        Hockages Hashirama = new Hockages("hashirama", 40, false, 1.72, 89, "Masculino", "Konoha");
        Hockages Sarutobe = new Hockages("Hashirama", 38, false, 1.72, 89, "Masculino", "Konoha");
        Hockages Tsunade =  new Hockages("Tsunade", 42, true, 1.67, 71, "Feminino", "Konoha");

        Tsunade.mostrarInformacoes();
        Hashirama.mostrarInformacoes();
        Sarutobe.mostrarInformacoes();


    }
}
