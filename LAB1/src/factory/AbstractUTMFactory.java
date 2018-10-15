package factory;

import interfaces.Student;
import interfaces.Teacher;

public abstract class AbstractUTMFactory {
    public abstract Student getStudent(String studentGroup);
    public abstract Teacher getTeacher(String teacherGroup);

}
