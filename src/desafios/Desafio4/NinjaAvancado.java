package desafios.Desafio4;

public class NinjaAvancado extends NinjaBasico {
    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, TipoHabilidade.NINJUTSU);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
        System.out.println("Com sua especialidade em " + especialidade + ".");
    }
}
