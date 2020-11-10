package Functions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Delete;

public class DeleteEmployee {
	private static String thisName = "Sam";
	public static void main(String[] args) {
		Session session = null;
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		System.out.println("Deleting Employee " + thisName);
		Delete FROM Employee WHERE name = thisName;
		System.out.println(thisName + " has been removed");
	}

}
