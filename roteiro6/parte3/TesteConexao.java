package roteiro6.parte3;

public class TesteConexao {
    public static void main(String[] args) { 
        ServicoQuarto quarto = new ServicoQuarto(new SqlserverConnection());
        quarto.verificarQuarto();

        ServicoReserva reserva = new ServicoReserva(new SqlserverConnection());
        reserva.criarReserva();

        RelatorioReserva relatorio = new RelatorioReserva(new SqlserverConnection());
        relatorio.gerarRelatorio(); 
    } 
}
