public class NanoBotsDecorator extends NaveEspacialDecorator {
    public NanoBotsDecorator(NaveEspacial shipToDecorate) {
        super(shipToDecorate);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 25;
    }
}
