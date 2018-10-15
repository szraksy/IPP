package factory;

import interfaces.Teacher;


public class TIProfessor implements Teacher {
    @Override
    public void present() {
        System.out.println("Reads slides.");
    }
}
