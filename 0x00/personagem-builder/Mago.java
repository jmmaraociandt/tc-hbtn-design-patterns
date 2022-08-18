import com.ciandt.week10.project50.personagem.TipoPersonagem;

public class Mago extends Personagem {
    public Mago(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) throws Exception {
        super(nome, TipoPersonagem.MAGO, inteligencia, forca, vigor, resistencia, destreza);
        if (!validateMagePower(inteligencia, forca, destreza))
            throw new Exception("Atributos invalidos para MAGO");
    }

    private boolean validateMagePower(int inteligencia, int forca, int destreza) {
        return inteligencia > forca && inteligencia > destreza;
    }

    @Override
    public double getDanoAtaque() {
        return this.getInteligencia() * 0.8 + this.getForca() * 0.05
                + this.getDestreza() * 0.05 + this.getVigor() * 0.1;
    }
}
