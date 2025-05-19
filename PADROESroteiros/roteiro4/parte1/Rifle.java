package PADROESroteiros.roteiro4.parte1;

// Classe Rifle
public class Rifle implements Arma {
    public void carregar() {
        System.out.println("Carregando o Rifle");
    }

    public void atirar() {
        System.out.println("Tiro com rifle não falha");
    }

    public void mirar() {
        System.out.println("Zoom no alvo");
    }
}