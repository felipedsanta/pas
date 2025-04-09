package roteiro3.parte2;

public class Onibus extends VeiculoTransporte{

    private double tarifaBase;

    public Onibus(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase * 1.2; // A tarifa do ônibus é 20% maior que a tarifa base
    }
}
