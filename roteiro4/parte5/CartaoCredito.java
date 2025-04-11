package roteiro4.parte5;

public class CartaoCredito extends Pagamento implements PagamentoReembolsavel {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " com cartão de crédito.");
    }

    @Override
    public void gerarFatura() {
        System.out.println("Gerando fatura do cartão de crédito.");
    }

    @Override
    public void validarSaldo() {
        System.out.println("Validando saldo do cartão de crédito.");
    }

    @Override
    public void processarReembolso(double valor) {
        System.out.println("Estorno de R$ " + valor + " realizado no cartão de crédito.");
    }

}
