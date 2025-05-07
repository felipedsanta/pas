package roteiro7.parte1;

import java.util.ArrayList;
import java.util.List;

public class FlowContainer extends Container {

    private List<Component> elements;

    public FlowContainer() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void addComponent(Component component) {
        this.elements.add(component);
        System.out.println("Adicionando componente: " + component);
    }

    @Override
    public void removeComponent(Component component) {
        this.elements.remove(component);
        System.out.println("Removendo componente: " + component);
    }

    @Override
    public void doLayout() {
        System.out.println("Layout do FlowContainer:");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(elements);
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------"); 
    }

}
