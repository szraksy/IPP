package factory;

import factory.AbstractUTMFactory;
import interfaces.Student;
import interfaces.Teacher;


public class StudentFactory extends AbstractUTMFactory {

    @Override
    public Student getStudent(String studentGroup) {
        switch (studentGroup) {
            case "FAF":
                return new FAFStudent();
            case "TI":
                return new TIStudent();
            default:
                return null;
        }
    }

    @Override
    public Teacher getTeacher(String teacherGroup) {
        return null;
    }
}
