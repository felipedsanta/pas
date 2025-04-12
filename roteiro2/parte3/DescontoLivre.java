package roteiro2.parte3;

public class DescontoLivre implements RegraDesconto {
    private double percentualDesconto;

    public DescontoLivre(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcular(double total) {
        if (percentualDesconto > 0 && percentualDesconto <= 0.3) { // Máx. 30%
            return total - (total * percentualDesconto);
        }
        return total;
    }

}
