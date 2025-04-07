package roteiro1parte5;

import java.util.List;

public class PedidoService {
    private MysqlConnection connection;
    private CalculadoraPreco calculadora;
    private List<String> itens;

    public PedidoService(MysqlConnection connection, List<String> itens) {
        this.connection = new MysqlConnection();
        this.calculadora = new CalculadoraPreco();
        this.itens = itens;
    }

    public void processarPedido(){
        this.connection.connect();
        double total = this.calculadora.calcularTotal(this.itens);
        System.out.println("Pedido processado. Valor total: R$ " + total);
    }
}
