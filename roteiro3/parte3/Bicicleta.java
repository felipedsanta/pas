package roteiro3.parte3;

public class Bicicleta extends VeiculoTransporte {

    public Bicicleta (double distancia){
        super(distancia);
    }

    @Override
    public double calcularTarifa() {
        return 0;//Agora bicicleta pode ser tratada como um veiculo, sem lançar exceções
    }

    @Override
    public double calcularTotalCombustivel(double consumoPorKm) {
        return 0; // Bicicleta não consome combustível
    }
    
}
