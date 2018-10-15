package factoryMethod;

import interfaces.Phone;

public class Samsung implements Phone {
    public String name = "Samsung";
    @Override
    public void ring() {
        System.out.println("The song you want!!!");
    }
}
