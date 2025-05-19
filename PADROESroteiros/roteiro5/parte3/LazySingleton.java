package PADROESroteiros.roteiro5.parte3;

public class LazySingleton {
    // atributo estático para garantir que haja apenas uma instância
    private static LazySingleton instance;

    // construtor privado para evitar a criação de instâncias fora da classe
    private LazySingleton() {
    }

    // método estático para fornecer acesso à instância única
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
