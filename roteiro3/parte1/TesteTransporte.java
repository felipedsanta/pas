package roteiro3.parte1;

public class TesteTransporte {
    public static void main(String[] args) {
        
        VeiculoTransporte onibus = new Onibus(5.0);
        System.out.println("Tarifa do ônibus: " + onibus.calcularTarifa());
        
        
        //VeiculoTransporte bicicleta = new Bicicleta(0.0);
        //System.out.println("Tarifa da bicicleta: " + bicicleta.calcularTarifa());

        try{
            VeiculoTransporte bicicleta = new Bicicleta(0.0);
            System.out.println("Tarifa da bicicleta: " + bicicleta.calcularTarifa());
        }catch(UnsupportedOperationException e) {
            System.out.println("Bicicleta não tem tarifa, então ignoramos esse cálculo.");
        }
    }
}