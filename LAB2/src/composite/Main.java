package composite;

public class Main {
    public static void main(String[] args){

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
