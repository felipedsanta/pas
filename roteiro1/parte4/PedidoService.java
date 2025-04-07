package roteiro1.parte4;

import java.util.List;

public class PedidoService {
    private MysqlConnection connection;
    private List<String> itens;

    public PedidoService(List<String> itens) {
        this.connection = new MysqlConnection();
        this.itens = itens;
    }

    public void processarPedido(){
        this.connection.connect();
        double total = calcularTotal();
        System.out.println("Pedido processado. Valor total: R$ " + total);
    }

    private double calcularTotal(){
        double total = 0;
        for (String item : itens) {
            if (item.equals("Pizza")) total += 30.0;
            else if(item.equals("Bebida")) total += 10.0;
        }

        return total - (total * calcularDesconto());
    }

    private double calcularDesconto(){
        double desconto = 0;
        boolean temPizza = false;
        boolean temBebida = false;

        for (String item : itens) {
            if (item.equals("Pizza")) temPizza = true;
            else if(item.equals("Bebida")) temBebida = true;
        }

        if(temPizza && temBebida){
            desconto = 0.15; // 15% de desconto
        }else if(temPizza){
            desconto = 0.1; // 10% de desconto
        }

        return desconto;
    }
}
