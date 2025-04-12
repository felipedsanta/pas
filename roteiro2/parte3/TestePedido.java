package roteiro2.parte3;

import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) { // Teste com desconto padrão
        RegraDesconto descontoPadrao = new DescontoPadrao();
        PedidoService pedidoPadrao = new PedidoService(Arrays.asList("Camiseta", "Jaqueta"), descontoPadrao);
        pedidoPadrao.processarPedido();

        // Teste com desconto VIP
        RegraDesconto descontoVip = new DescontoVip();
        PedidoService pedidoVip = new PedidoService(Arrays.asList("Camiseta",
                "Calça", "Jaqueta"), descontoVip);
        pedidoVip.processarPedido();

        // Teste com desconto livre
        PedidoService pedido = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta"), new DescontoLivre(0.3));
        pedido.processarPedido();
    }
}