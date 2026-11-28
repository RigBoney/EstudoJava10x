package nivelIntermediario.aulaGettersAndSetters;

public class mainGetAndSet {
    public static void main(String[] args) {

        FilhaDoGetAndSet f = new FilhaDoGetAndSet("yuri", 27, "m", 55);
        System.out.println(f.getIdade());
        f.setIdade(44);
        System.out.println(f.getIdade());

    }
}
