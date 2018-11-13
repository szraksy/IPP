package composite;

public class Employee extends EmployeeComponent {

    private String employeeName;
    private String groupName;
    private int startYear;

    public Employee(String newEmployeeName, String newGroupName, int newStartYear){

    	employeeName = newEmployeeName;
    	groupName = newGroupName;
    	startYear = newStartYear;

    }

    public String getEmployeeName() { return employeeName; }
    public String getGroupName() { return groupName; }
    public int getStartYear() { return startYear; }

    public void displayEmployeeInfo(){
        System.out.println(getEmployeeName() + " was accepted by " + getGroupName() + " in " + getStartYear());
    }
}