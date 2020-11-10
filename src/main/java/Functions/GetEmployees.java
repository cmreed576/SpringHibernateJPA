package Functions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import empPackage.Employee;

public class GetEmployees {
	
	public static void main(String[] args) {
		Session session = null;
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		System.out.println("Fetching Employees");
		for(int x : Employee)
		{
			Employee e = (Employee) session.get(Employee.class, x);
			System.out.println("Name = " + e.getName() + " ID = " + 
			e.getEmployeeId() + " city = " + e.getCity() + 
			" department = " + e.getDepartment() + " email = " + 
			e.getEmail() + " phone no = " + e.getPhoneNo() + 
			" birthdate = " + e.getBirthDate());
		}
	}
}
