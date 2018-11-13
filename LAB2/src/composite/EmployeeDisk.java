package composite;

public class EmployeeDisk {
    private EmployeeComponent employeeList;

    public EmployeeDisk(EmployeeComponent newEmployeeList){
    	employeeList = newEmployeeList;
    }

    public void getEmployeeList(){
    	employeeList.displayEmployeeInfo();
    }
}
