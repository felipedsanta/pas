package roteiro4.parte1;

public class TestePagamento {
    
    public static void main(String[] args) {
        
        System.out.println("\nPAGAMENTO CARTAO DE CREDITO");
        MetodoPagamento cartao = new CartaoCredito();
        cartao.gerarFatura();
        cartao.processarPagamento(100.00);

        System.out.println("\nPAGAMENTO BOLETO BANCARIO");
        MetodoPagamento boleto = new BoletoBancario();
        boleto.gerarFatura();
        boleto.processarPagamento(200.00);

        System.out.println("\nPAGAMENTO CRIPTOMOEDA");
        MetodoPagamento criptomoeda = new Criptomoeda();
        criptomoeda.gerarFatura();
        criptomoeda.processarPagamento(300.00);
    }
}
