package Functions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmployeeByID {
	private static int employeeId = 100;
	
	public static void main(String[] args) {
		Session session = null;
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		System.out.println("Fetching Employee by Id");
		
		Employee e = (Employee) session.get(Employee.class, employeeId);
		System.out.println("Name = " + e.getName());
	}

}
