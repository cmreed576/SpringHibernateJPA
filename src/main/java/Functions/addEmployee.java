package Functions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Delete;

import empPackage.EmployeeDetail;

public class addEmployee {
	private static String thisName = "Phil";
	public static void main(String[] args) {
		Session session = null;
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		EmployeeDetail.saveUser(new Employee(thisName, "San Diego"));
		System.out.println("Adding Employee " + thisName);
	}

}
