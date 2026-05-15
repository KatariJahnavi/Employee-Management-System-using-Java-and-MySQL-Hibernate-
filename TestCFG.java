package org.jsp.emplyeeproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class TestCFG {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran = ses.beginTransaction();
		Employee e1 = new Employee();
		e1.setName("Blake");
		e1.setPhone(879056436);
		e1.setEmail("blake10@gmail.com");
		e1.setPassword("Blake@10");
		e1.setSalary(40000);
		e1.setDesignation("Tester");
		
		Employee e2 = new Employee();
		e2.setName("Smith");
		e2.setPhone(867856486);
		e2.setEmail("smith11@gmail.com");
		e2.setPassword("Smith@11");
		e2.setSalary(45000);
		e2.setDesignation("Developer");
		
		Employee e3 = new Employee();
		e3.setName("Ward");
		e3.setPhone(854356480);
		e3.setEmail("ward12@gmail.com");
		e3.setPassword("Ward@12");
		e3.setSalary(55000);
		e3.setDesignation("Trainer");
		
		Employee e4 = new Employee();
		e4.setName("King");
		e4.setPhone(890564486);
		e4.setEmail("king14@gmail.com");
		e4.setPassword("King@14");
		e4.setSalary(65000);
		e4.setDesignation("Java Developer");
		
		Employee e5 = new Employee();
		e5.setName("Ram");
		e5.setPhone(905976486);
		e5.setEmail("ram15@gmail.com");
		e5.setPassword("Ram@15");
		e5.setSalary(50000);
		e5.setDesignation("Web Developer");
		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		ses.save(e5);
		tran.commit();
	
	}

}
