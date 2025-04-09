package roteiro3.parte4;

public class Bicicleta extends VeiculoTransporte {

    public Bicicleta(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularTarifa() {
        return 0;//Agora bicicleta pode ser tratada como um veiculo, sem lançar exceções
    }
    
}
