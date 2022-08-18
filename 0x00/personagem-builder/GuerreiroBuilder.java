public class GuerreiroBuilder implements Builder {
    private String nome;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;

    public Guerreiro build() throws Exception {
        return new Guerreiro(nome, inteligencia, forca, vigor, resistencia, destreza);
    }

    @Override
    public void setName(String nome) {
        this.nome = nome;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
}
