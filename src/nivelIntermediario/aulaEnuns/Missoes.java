package nivelIntermediario.aulaEnuns;

public class Missoes {

    private String nomeMissao;
    private RankDeMissoes rank;

    //metodo para exibir os detalhes do objeto missao
    public void detalhesDaMissao(){
        System.out.println("Nome do missao: " + this.nomeMissao + " Rank: " + this.rank);
    }

    //construtor do objeto missao com o enum
    public Missoes(String nomeMissao, RankDeMissoes rank){
        this.nomeMissao = nomeMissao;
        this.rank = rank;
    }
}
