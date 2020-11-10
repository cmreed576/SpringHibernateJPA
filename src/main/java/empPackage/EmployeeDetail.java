package empPackage;

import java.util.List;

import com.spring.model.User;

public class EmployeeDetail {
	
		public void saveEmployee(Employee e);
		public List<Employee> GetEmployees();
		public void DeleteEmployee(String name);
		public Employee EmployeeByCity(String city);
		public Employee EmployeeByDepartment(String department);
		public Employee EmployeeByID(int EmployeeId);
		public Employee EmployeeByName(String name);
		public Employee EmployeeByPhone(int phoneNo);
		public Employee GetEmployees();
		public Employee GetEmployeeCount();
		public void updateEmployee(Employee e);

}
