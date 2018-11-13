package composite;

import java.util.ArrayList;

import java.util.Iterator;

public class EmployeeGroup extends EmployeeComponent {
    private ArrayList employeeComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public EmployeeGroup(String newGroupName, String newGroupDescription){
        groupName = newGroupName;
        groupDescription = newGroupDescription;

    }

    public String getGroupName() { return groupName; }
    public String getGroupDescription() { return groupDescription; }

    public void add(EmployeeComponent newEmployeeComponent) {
    	employeeComponents.add(newEmployeeComponent);

    }

    public void remove(EmployeeComponent newEmployeeComponent) {
    	employeeComponents.remove(newEmployeeComponent);
    }

    public EmployeeComponent getComponent(int componentIndex) {
        return (EmployeeComponent)employeeComponents.get(componentIndex);
    }

    public void displayEmployeeInfo(){
        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");
        Iterator songIterator = employeeComponents.iterator();

        while(songIterator.hasNext()) {
            EmployeeComponent songInfo = (EmployeeComponent) songIterator.next();
            songInfo.displayEmployeeInfo();
        }
    }
}