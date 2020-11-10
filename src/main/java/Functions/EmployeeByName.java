package Functions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeByName {
	private static String name = "Dave";
	
	public static void main(String[] args) {
		Session session = null;
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		System.out.println("Fetching Employee by name");
		
		Employee e = (Employee) session.get(Employee.class, name);
		System.out.println("Name = " + e.getName());
	}
}
