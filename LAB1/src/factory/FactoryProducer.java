package factory;

import factory.AbstractUTMFactory;

public class FactoryProducer {

    public static AbstractUTMFactory getFactory(String entity) {
        switch (entity) {
            case "STUDENT":
                return new StudentFactory();
            case "TEACHER":
                return new TeacherFactory();
            default:
                return null;
        }

    }
}
