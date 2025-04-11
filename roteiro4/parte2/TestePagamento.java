package roteiro4.parte2;

public class TestePagamento {
    public static void main(String[] args) {
        System.out.println("\nPAGAMENTO CARTAO DE CREDITO");
        MetodoPagamento cartao = new CartaoCredito();
        cartao.processarPagamento(100.00);
        if (cartao instanceof CartaoCredito) {
            ((MetodoPagamentoComFatura) cartao).gerarFatura();
        }

        System.out.println("\nPAGAMENTO BOLETO BANCARIO");
        MetodoPagamento boleto = new BoletoBancario();
        boleto.processarPagamento(200.00);

        System.out.println("\nPAGAMENTO CRIPTO");
        MetodoPagamento cripto = new Criptomoeda();
        cripto.processarPagamento(300.00);

    }
}
