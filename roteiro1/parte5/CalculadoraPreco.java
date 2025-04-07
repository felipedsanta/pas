package roteiro1.parte5;

import java.util.List;

public class CalculadoraPreco {
    public double calcularTotal(List<String> itens) {
        double total = 0;
        for (String item : itens) {
            if (item.equals("Pizza")) total += 30.0;
            else if(item.equals("Bebida")) total += 10.0;
        }
        return total - (total * calcularDesconto(itens));
    }

    private double calcularDesconto(List<String> itens){
        double desconto = 0;
        boolean temPizza = false;
        boolean temBebida = false;

        for (String item : itens) {
            if (item.equals("Pizza")) temPizza = true;
            else if(item.equals("Bebida")) temBebida = true;
        }

        if(temPizza && temBebida){
            desconto = 0.15; // 15% de desconto
        }else if(temPizza){
            desconto = 0.1; // 10% de desconto
        }

        return desconto;
    }

}
