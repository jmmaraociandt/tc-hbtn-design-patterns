public class LaserDecorator extends NaveEspacialDecorator {
    public LaserDecorator(NaveEspacial shipToDecorate) {
        super(shipToDecorate);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 40;
    }
}
