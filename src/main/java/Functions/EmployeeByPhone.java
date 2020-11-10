package Functions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeByPhone {
	
private static int phoneNo = 1234567;
	
	public static void main(String[] args) {
		Session session = null;
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		System.out.println("Fetching Employee by name");
		
		Employee e = (Employee) session.get(Employee.class, phoneNo);
		System.out.println("Name = " + e.getName());
	}
}
