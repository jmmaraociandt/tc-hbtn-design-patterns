public class CanhaoExtraDecorator extends NaveEspacialDecorator {

    public CanhaoExtraDecorator(NaveEspacial shipToDecorate) {
        super(shipToDecorate);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 75;
    }
}
