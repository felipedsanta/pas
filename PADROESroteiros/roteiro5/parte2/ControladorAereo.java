package PADROESroteiros.roteiro5.parte2;

// Eager Singleton:
// A instância do singleton é criada imediatamente no momento da inicialização da classe.
// a instância é criada de forma antecipada:
public class ControladorAereo {
    private boolean permitidoAterrissar;
    private boolean permitidoDecolar;
    // atributo estático para garantir que haja apenas uma instância
    
    private static ControladorAereo instance = new ControladorAereo();

    // construtor privado para evitar a criação de instâncias fora da classe
    private ControladorAereo() {
        this.permitidoAterrissar = false;
        this.permitidoDecolar = true;
    }

    // método estático para fornecer acesso à instância única
    public static ControladorAereo getInstance() {
        return instance;
    }

    public void solicitarAterrissagem() {
        if (this.permitidoAterrissar) {
            System.out.println("Permissão para aterrissagem concedida ");
            this.permitidoAterrissar = false;
            this.permitidoDecolar = true;
        } else {
            System.out.println("Permissão para aterrissagem negada ");
        }
    }

    public void solicitarDecolagem() {
        if (this.permitidoDecolar) {
            System.out.println("Permissão para decolar concedida ");
            this.permitidoAterrissar = true;
            this.permitidoDecolar = false;
        } else {
            System.out.println("Permissão para decolagem negada ");
        }
    }
}
