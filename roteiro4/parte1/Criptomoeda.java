package roteiro4.parte1;

public class Criptomoeda implements MetodoPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + "realizado com criptomoeda.");
    }   

    @Override
    public void gerarFatura() {
        throw new UnsupportedOperationException("Operação não suportada para criptomoeda.");
    }

    @Override
    public void validarSaldo() {
        System.out.println("Validando saldo disponível na carteira de criptomoeda.");
    }

}
