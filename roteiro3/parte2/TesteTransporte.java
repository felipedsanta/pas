package roteiro3.parte2;

public class TesteTransporte {
    public static void main(String[] args) {
        
        VeiculoTransporte onibus = new Onibus(5.0);
        VeiculoTransporte bicicleta = new Bicicleta();
        
        System.out.println("Tarifa do Ônibus: " + onibus.calcularTarifa());
        System.out.println("Tarifa da Bicicleta: " + bicicleta.calcularTarifa());

    }
}