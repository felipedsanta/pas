package roteiro6.parte3;

public class ServicoReserva {
    private Connection connection;

    public ServicoReserva(Connection connection){
        this.connection = connection;
    }

    public void criarReserva(){
        this.connection.connect();
        System.out.println("Lógica de negócio para o Serviço de Reserva");
    }

}
