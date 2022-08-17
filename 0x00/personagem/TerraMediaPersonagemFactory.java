public class TerraMediaPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem type, String name) throws Exception {
        if (type.equals(TipoPersonagem.MAGO))
            return new Mago(name, 10, 2, 5, 3, 4);
        else if (type.equals(TipoPersonagem.GUERREIRO))
            return new Guerreiro(name, 1, 8, 5, 10, 6);
        else if (type.equals(TipoPersonagem.LADRAO))
            return new Ladrao(name, 2, 6, 8, 5, 10);
        return null;
    }
}
