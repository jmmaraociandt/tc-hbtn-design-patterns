import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        this.itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        this.itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String itensDentroCaixaString = "\tFora da caixa:";
        String itensForaCaixaString = "\tDentro da caixa:";

        for (ItemPedido itemPedido : itensDentroCaixa) {
            itensDentroCaixaString += "\n\t\t- " + itemPedido.getTipo() + " " + itemPedido.getNome();
        }

        for (ItemPedido itemPedido : itensForaCaixa) {
            itensForaCaixaString += "\n\t\t- " + itemPedido.getTipo() + " " + itemPedido.getNome();
        }

        return itensForaCaixaString + "\n" + itensDentroCaixaString + "\n";
    }
}
