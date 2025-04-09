package roteiro4.parte1;

public class CartaoCredito implements MetodoPagamento{

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

}
