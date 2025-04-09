package roteiro3.parte3;

public class TesteTransporte {
    public static void main(String[] args) {
        
        VeiculoTransporte onibus = new Onibus(5.0, 10.0);
        VeiculoTransporte bicicleta = new Bicicleta(10.0);
        
        System.out.println("Tarifa do Ônibus: " + onibus.calcularTarifa());
        System.out.println("Distancia Ônibus: " + onibus.getDistancia());
        System.out.println("Total de Combustível do Ônibus: " + onibus.calcularTotalCombustivel(2.0));

        System.out.println("Tarifa da Bicicleta: " + bicicleta.calcularTarifa());
        System.out.println("Distancia Bicicleta: " + bicicleta.getDistancia());
        System.out.println("Consumo total Bicicleta: " + bicicleta.calcularTotalCombustivel(12));

    }
}