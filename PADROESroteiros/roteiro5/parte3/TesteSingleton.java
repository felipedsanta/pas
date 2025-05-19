package PADROESroteiros.roteiro5.parte3;

public class TesteSingleton {
    public static void main(String[] args) {
        // Obtendo duas instâncias de InocenteSingleton
        InocenteSingleton n1 = InocenteSingleton.getInstance();
        InocenteSingleton n2 = InocenteSingleton.getInstance();

        // Problema: A implementação de InocenteSingleton cria uma nova instância toda
        // vez que getInstance() é chamado.
        // Resultado esperado: "Instâncias diferentes"
        System.out.println(n1 == n2 ? "Instâncias iguais" : "Instâncias diferentes");

        // Obtendo duas instâncias de LazySingleton
        LazySingleton n3 = LazySingleton.getInstance();
        LazySingleton n4 = LazySingleton.getInstance();

        // LazySingleton implementa corretamente o padrão Singleton, garantindo que
        // apenas uma instância seja criada.
        // Resultado esperado: "Instâncias iguais"
        System.out.println(n3 == n4 ? "Instâncias iguais" : "Instâncias diferentes");

        // Obtendo duas instâncias de EagerSingleton

        EagerSingleton n5 = EagerSingleton.getInstance();
        EagerSingleton n6 = EagerSingleton.getInstance();

        // EagerSingleton também implementa corretamente o padrão Singleton, garantindo
        // que apenas uma instância seja criada.
        // Resultado esperado: "Instâncias iguais"
        // EagerSingleton é inicializado no momento da classe, enquanto LazySingleton
        System.out.println(n5 == n6 ? "Instâncias iguais" : "Instâncias diferentes");

        StaticSingleton n7 = StaticSingleton.instance;
        StaticSingleton n8 = StaticSingleton.instance;
        System.out.println(n7 == n8 ? "Instâncias iguais" : "Instâncias diferentes");
    }
}
