package factory;

import factory.AbstractUTMFactory;
import interfaces.Student;
import interfaces.Teacher;


public class TeacherFactory extends AbstractUTMFactory {

    @Override
    public Student getStudent(String studentGroup) {
        return null;
    }

    @Override
    public Teacher getTeacher(String teacherGroup) {
        switch (teacherGroup) {
            case "FAF":
                return new FAFProfessor();
            case "TI":
                return new TIProfessor();
            default:
                return null;
        }
    }
}
