package factory;

import interfaces.Teacher;

public class FAFProfessor implements Teacher {
    @Override
    public void present() {
        System.out.println("Explain slides and give real examples");
    }
}
