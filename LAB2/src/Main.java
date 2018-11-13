import adapter.BankAdaptee;
import adapter.BankAdapter;
import adapter.OperationInterface;
import adapter.Paypal;
import adapter.SimpleClient;
import bridge.AbstractAccount;
import bridge.EmployeeAccount;
import bridge.internetBanking.MoldovianBankInternetBanking;
import bridge.internetBanking.TurkishBankInternetBanking;
import composite.Employee;
import composite.EmployeeComponent;
import composite.EmployeeDisk;
import composite.EmployeeGroup;


public class Main {
    public static void main(String[] args) {
        OperationInterface turkishbank = new BankAdapter(new BankAdaptee());
        OperationInterface paypal = new Paypal();
        SimpleClient ClientSezer = new SimpleClient("Sezer", 200);
        SimpleClient clientStas = new SimpleClient("Stas", 500);
        turkishbank.fill(ClientSezer, 300);
        turkishbank.transfer(ClientSezer, 200);
        turkishbank.withdraw(ClientSezer, 100);

        paypal.fill(ClientSezer, 100);
        paypal.transfer(ClientSezer, 50);
        paypal.withdraw(ClientSezer, 50);

        AbstractAccount sezerAccountAtTurkishBank = new EmployeeAccount(new TurkishBankInternetBanking(), ClientSezer);
        AbstractAccount StasAccountAtMoldovianBank = new EmployeeAccount(new MoldovianBankInternetBanking(), clientStas);
        sezerAccountAtTurkishBank.show();
        StasAccountAtMoldovianBank.show();
        EmployeeComponent group1 =
                new EmployeeGroup("Elite Employee",
                        "This is Elite Employee Group of Bank");

        EmployeeComponent group2 =
                new EmployeeGroup("\nStar Employee",
                        "This is Star Employee Group of Bank");

        EmployeeComponent group3 =
                new EmployeeGroup("\nBasic Employee",
                        "This is Basic Employee Group of Bank");

       

        EmployeeComponent eachEmployee = new EmployeeGroup("Employee List", "My cool Employee list");

        eachEmployee.add(group1);

        group1.add(new Employee("Sezer Aksoy", "Elite", 2016));
        group1.add(new Employee("Stas Biziga", "Elite", 2017));

        group1.add(group3);

        group3.add(new Employee("John Doe", "Basic", 2016));
        group3.add(new Employee("Holly Dolly", "Basic", 2016));

  

        eachEmployee.add(group2);

        group2.add(new Employee("Crazy Shilly", "Star", 2010));
        group2.add(new Employee("Boiley Britney", "Star", 2015));

        EmployeeDisk xyz = new EmployeeDisk(eachEmployee);

        xyz.getEmployeeList();

    
    }
}
