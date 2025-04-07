package roteiro3.parte1;

public class Onibus extends VeiculoTransporte{
    public Onibus(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase * 1.2; // A tarifa do ônibus é 20% maior que a tarifa base
    }
}
