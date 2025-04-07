package roteiro1parte2;
import java.util.ArrayList;
import java.util.List;

public class TestePedido {
    public static void main(String[] args) {

        MysqlConnection connection = new MysqlConnection();

        List<String> lista = new ArrayList<>();
        lista.add("Pizza");
        lista.add("Bebida");

        PedidoService pedidoService = new PedidoService(connection, lista);
        pedidoService.processarPedido();
    }
}
