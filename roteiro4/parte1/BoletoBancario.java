package roteiro4.parte1;

public class BoletoBancario implements MetodoPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto gerado para pagamento de R$ " + valor );
    }   

    @Override
    public void gerarFatura() {
        System.out.println("Fatura gerada para pagamento do boleto.");
    }

    @Override
    public void validarSaldo() {
        throw new UnsupportedOperationException("Operação não suportada para boleto bancário.");
    }

}
