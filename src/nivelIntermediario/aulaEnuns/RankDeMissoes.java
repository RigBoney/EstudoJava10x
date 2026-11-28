package nivelIntermediario.aulaEnuns;

public enum RankDeMissoes {

    D("Baixo", 2),
    C("Confortavel", 4),
    B("Moderado", 6),
    A("Dificil", 8),
    S("Altissimo", 12);

    //variaveis para dentro do enum, para usarmos no futuro construtor, todas com get e set
    private String descricao;
    private int nivelDificuldade;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    //
    RankDeMissoes(String descricao, int nivelDificuldade) {
        this.descricao = descricao;
        this.nivelDificuldade = nivelDificuldade;
    }
}

