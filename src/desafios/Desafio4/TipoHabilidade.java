package desafios.Desafio4;

public enum TipoHabilidade {
    TAIJUTSU("Luta com chutes e socos pontentes para nocautear o inimigo."),
    NINJUTSU("Molda o chakra para usar tecnicas poderosas."),
    GENJUTSU("Cria ilusoes potentes ou substituiçoes."),
    KATON("usa o chakra criar tecnicas de fogo poderosas."),
    RINNEGAN("Ativa os poderes divinos de Sansara, com poderes antes inalcansaveis.");

    final String descricao;

    TipoHabilidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}

