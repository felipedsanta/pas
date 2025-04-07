package roteiro3.parte1;

public class Bicicleta extends VeiculoTransporte {
    public Bicicleta(double tarifaBase) {
        super(0);
    }

    @Override
    public double calcularTarifa() {
        throw new UnsupportedOperationException("A bicicleta não tem tarifa.");
    }
    
}
