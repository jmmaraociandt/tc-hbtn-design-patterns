public class WesterosPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem type, String name) throws Exception {
        if (type.equals(TipoPersonagem.MAGO))
            return new Mago("Mago", 8, 3, 3, 3, 4);
        else if (type.equals(TipoPersonagem.GUERREIRO))
            return new Guerreiro("Guerreiro",0, 9, 7, 10, 7);
        else if (type.equals(TipoPersonagem.LADRAO))
            return new Ladrao("Ladrao", 1, 8, 7, 7, 10);
        return null;
    }
}
