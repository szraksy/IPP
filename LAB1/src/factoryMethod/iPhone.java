package factoryMethod;

import interfaces.Phone;


public class iPhone implements Phone {
    public String name = "iPhone";
    @Override
    public void ring() {
        System.out.println("iPhone awesome phone ring");
    }
}
