public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int paginasTotais,
                                            int paginasColoridas, boolean ehFrenteVerso) {
        if (tamanhoImpressao.equals(TamanhoImpressao.A2))
            return new Impressao(paginasTotais, paginasColoridas, ehFrenteVerso, 0.28, 0.18, 0.32, 0.22);
        else if (tamanhoImpressao.equals(TamanhoImpressao.A3))
            return new Impressao(paginasTotais, paginasColoridas, ehFrenteVerso, 0.25, 0.15, 0.30, 0.20);
        else
            return new Impressao(paginasTotais, paginasColoridas, ehFrenteVerso, 0.20, 0.10, 0.25, 0.15);
    }
}
