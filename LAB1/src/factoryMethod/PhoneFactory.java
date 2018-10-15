package factoryMethod;

import interfaces.Phone;

public class PhoneFactory {

    public Phone getPhone(String name) {
        switch(name) {
            case "iPhone":
                return new iPhone();
            case "Samsung":
                return new Samsung();
            default:
                return null;
        }
    }

}
