public class Ladrao extends Personagem {
    public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) throws Exception {
        super(nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);

        if (!validateRoguePower(inteligencia, forca, destreza))
            throw new Exception("Atributos invalidos para LADRAO");
    }

    private boolean validateRoguePower(int inteligencia, int forca, int destreza) {
        return destreza > inteligencia && destreza > forca;
    }

    @Override
    public double getDanoAtaque() {
        return this.getInteligencia() * 0.05 + this.getForca() * 0.5
                + this.getDestreza() * 0.35 + this.getVigor() * 0.1;
    }
}
