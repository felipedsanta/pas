package roteiro3.parte4;

public class Onibus extends VeiculoTransporte implements VeiculoMotorizado {

    private double tarifaBase;
    private double consumoPorKm;

    public Onibus(double tarifaBase, double distancia) {
        super(distancia);
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase * 1.2; // A tarifa do ônibus é 20% maior que a tarifa base
    }

    @Override
    public double calcularTotalCombustivel(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
        return this.consumoPorKm*super.getDistancia();
    }
}
