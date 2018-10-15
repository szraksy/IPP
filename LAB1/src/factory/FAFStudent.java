package factory;

import builder.SkillSet;
import builder.SkillSetBuilder;
import interfaces.Phone;
import interfaces.Student;

public class FAFStudent implements Student {
    private Phone phone;
    private SkillSetBuilder builder = new SkillSetBuilder();
    public SkillSet fafSkillSet = builder.createFAFStudentSkillSet();
    public void learn() {
        System.out.println("Reads ones and start writing code");
    }
    public void showsWhatHeOrSheCanDo() {
        System.out.println("~~~~~~~~~ FAF student ~~~~~~~~~");
        fafSkillSet.showSkillSet();
        System.out.println("~~~~~~~~~ FAF student ~~~~~~~~~");
        System.out.println("~~~~~~~~~ My phone rings... ~~~~~~~~~");
        phone.ring();
        System.out.println("~~~~~~~~~ My phone rings... ~~~~~~~~~");
    }

    @Override
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
