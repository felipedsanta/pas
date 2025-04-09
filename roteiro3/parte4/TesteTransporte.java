package roteiro3.parte4;

public class TesteTransporte {
    public static void main(String[] args) {
        
        VeiculoTransporte veiculo1 = new Onibus(5.0,10.0);
        VeiculoTransporte veiculo2 = new Bicicleta(10.0);
        
        System.out.println("Tarifa do Ônibus: " + veiculo1.calcularTarifa());
        System.out.println("Distância do Ônibus: " + veiculo1.getDistancia());
        System.out.println("Tarifa da Bicicleta: " + veiculo2.calcularTarifa());
        System.out.println("Distância da Bicicleta: " + veiculo2.getDistancia());

        System.out.println("CALCULO DE CONSUMO DA VIAGEM");
        if(veiculo1 instanceof Onibus){
            System.out.println("Consumo do veiculo 1: " + ((Onibus) veiculo1).calcularTotalCombustivel(10.0));
        }else{
            System.out.println("Veiculo 1: não é um veículo motorizado");
        }

        if(veiculo2 instanceof Onibus){
            System.out.println("Consumo do veiculo 2: " + ((Onibus) veiculo2).calcularTotalCombustivel(10.0));
        }else{
            System.out.println("Veiculo 2: não é um veículo motorizado");
        }
    }
}