package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdd {
private static List<EmployeePOJO> employeeList = new ArrayList<EmployeePOJO>();
	
	public static List<EmployeePOJO> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(List<EmployeePOJO> employeeList) {
		EmployeeAdd.employeeList = employeeList;
	}

	public void AddEmployee(EmployeePOJO emp) {
		employeeList.add(emp);
	}
	
	public EmployeePOJO getEmployee(int id) {
		for(EmployeePOJO employee : employeeList) {
			if(employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}

}
