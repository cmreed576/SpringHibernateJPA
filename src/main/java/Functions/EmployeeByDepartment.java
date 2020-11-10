package Functions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeByDepartment {
private static String department = "admin";
	
	public static void main(String[] args) {
		Session session = null;
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		System.out.println("Fetching Employee by department");
		
		Employee e = (Employee) session.get(Employee.class, department);
		System.out.println("Name = " + e.getName());
	}

}
