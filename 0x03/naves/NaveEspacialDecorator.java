public class NaveEspacialDecorator extends NaveEspacial {
    private NaveEspacial shipToDecorate;

    public NaveEspacialDecorator(NaveEspacial shipToDecorate) {
        super(shipToDecorate.getSaude(), shipToDecorate.getAtaque());
        this.shipToDecorate = shipToDecorate;
    }

    @Override
    public int getSaude() {
        return super.getSaude();
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }
}
