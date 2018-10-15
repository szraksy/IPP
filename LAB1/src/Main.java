import interfaces.Phone;
import factoryMethod.PhoneFactory;
import interfaces.Student;
import interfaces.Teacher;
import prototype.ClassRoom;
import singleton.UTM;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone iPhone = phoneFactory.getPhone("iPhone");
        Phone samsung = phoneFactory.getPhone("Samsung");


   

        ClassRoom fafClassRoom = new ClassRoom("fafClassRoom", 40);
        ClassRoom tiClassRoom = fafClassRoom.clone();
        tiClassRoom.setName("tiClassRoom");

        System.out.println("~~~~~~~~~ Clone ~~~~~~~~~ ");
        fafClassRoom.setName("newNameOfClass");
        fafClassRoom.show();

        tiClassRoom.show();
        System.out.println("~~~~~~~~~ Clone~~~~~~~~~");

   
    }
}
