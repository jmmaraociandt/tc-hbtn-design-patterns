public class ArmaduraDecorator extends NaveEspacialDecorator {

    public ArmaduraDecorator(NaveEspacial shipToDecorate) {
        super(shipToDecorate);
    }

    @Override
    public int getSaude() {
        return super.getSaude() + 150;
    }
}
