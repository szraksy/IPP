package singleton;

import interfaces.Teacher;

import java.util.ArrayList;
import java.util.List;

public class UTM {
    private static UTM instance = null;
    private List<Teacher> teachers = new ArrayList<Teacher>();
    protected UTM() {
        // Exists only to defeat instantiation.
    }
    public static UTM getInstance() {
        if(instance == null) {
            instance = new UTM();
        }
        return instance;
    }

    public void addProfesor(Teacher utmProffesor) {
        teachers.add(utmProffesor);
    }

    public void showUTMProffesors() {
        System.out.println("~~~~~~~~~ singleton.UTM Stuff ~~~~~~~~~");
        for (Teacher teacher : teachers) {
            teacher.present();
        }
        System.out.println("~~~~~~~~~ singleton.UTM Stuff ~~~~~~~~~");
    }
}
