package roteiro6.parte2;

public class ServicoQuarto {
    private OracleConnection connection;

    public ServicoQuarto(){
        this.connection = new OracleConnection();
    }

    public void verificarQuarto(){
        this.connection.connect();
        System.out.println("Lógica de negócio para o SErviço de Quarto");
    }
}