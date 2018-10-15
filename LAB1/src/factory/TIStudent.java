package factory;

import builder.SkillSet;
import builder.SkillSetBuilder;
import interfaces.Phone;
import interfaces.Student;

public class TIStudent implements Student {
    private Phone phone;
    private SkillSetBuilder builder = new SkillSetBuilder();
    public SkillSet tiSkillSet = builder.createTIStudengSkillSet();
    public void learn() {
        System.out.println("Read ones, twice, 3 times etc.");
    }

    @Override
    public void showsWhatHeOrSheCanDo() {
        System.out.println("~~~~~~~~~ TI student ~~~~~~~~~");
        tiSkillSet.showSkillSet();
        System.out.println("~~~~~~~~~ TI student ~~~~~~~~~");
        System.out.println("~~~~~~~~~ My phone rings... ~~~~~~~~~");
        phone.ring();
        System.out.println("~~~~~~~~~ My phone rings... ~~~~~~~~~");
    }

    @Override
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
