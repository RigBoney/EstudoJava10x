package nivelIntermediario.aulaClassesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class MainClassesAbstratas {
    public static void main(String[] args) {
        List<NinjaAbstratas> lista = new ArrayList<>();

        //criando objetos
        UchihaAbstratas numero1 = new UchihaAbstratas("sasuke", 16, "masculino", "konoha");
        lista.add(numero1);

        UzumakiAbstratas numero2 = new UzumakiAbstratas("naruto", 16, "masculino", "konoha");
        lista.add(numero2);

        UchihaAbstratas numero3 = new UchihaAbstratas("itachi", 27, "masculino", "konoha");
        lista.add(numero3);

        UzumakiAbstratas numero4 = new UzumakiAbstratas("boruto", 13, "masculino", "konoha");
        lista.add(numero4);

        //mostrando cada obj no arraylist e separando por classe
        for (NinjaAbstratas mostrar : lista) {
            if(mostrar instanceof UchihaAbstratas){
                mostrar.mostrarInformacoes();
                mostrar.EstrategiaDeBatalha();
            }else if(mostrar instanceof UzumakiAbstratas) {
                mostrar.mostrarInformacoes();
                mostrar.EstrategiaDeBatalha();
            }else
            System.out.println("não é nenhum dos doiskkkk");

        }
    }
}
