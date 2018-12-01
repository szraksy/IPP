package src.com.sezeraksoy;

import com.sezeraksoy.console.AboutCommand;
import com.sezeraksoy.console.CalculatorCommand;
import com.sezeraksoy.console.Command;
import com.sezeraksoy.printing.IntegerFormatter;
import com.sezeraksoy.printing.PrintFormatter;
import com.sezeraksoy.printing.StringFormatter;
import com.sezeraksoy.printing.TwoDigitFormatter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int operation = -1;
        Scanner scanner = new Scanner(System.in);
        while (operation != 0) {

            Command command = null;
            System.out.println("1 : Calculator");
            System.out.println("2 : About");
            System.out.print("Enter option : ");
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    command = new CalculatorCommand();
                    break;
                case 2:
                    command = new AboutCommand();
                    break;
            }

            if (command == null && operation != -1) {
                System.out.println("Invalid option given.");
            }
            if (command != null) {
                System.out.println("--------------------");
                command.execute();
                System.out.println("--------------------");
            }
        }
    }
}
