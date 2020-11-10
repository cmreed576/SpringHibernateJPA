package Functions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import empPackage.Employee;

public class GetEmployeeCount {
	
	public static void main(String[] args) {
		Session session = null;
		int totalEmp = 0;
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		System.out.println("Fetching Employees");
		for(int x : Employee)
		{
			Employee e = (Employee) session.get(Employee.class, x);
			totalEmp++;
		}
		System.out.println("Total employees = " + totalEmp);
	}

}
