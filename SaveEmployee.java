package org.jsp.emplyeeproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {
		public static void main(String[] args) {
			Configuration conf=new Configuration();
			conf.configure();
			SessionFactory sef = conf.buildSessionFactory();
			Session ses=sef.openSession();
			Transaction tran = ses.beginTransaction();
			Employee e=ses.get(Employee.class, 5);
			if(e!=null) {
				e.setName("Raju");
				e.setPhone(707856782);
				e.setEmail("raju03@gmail.com");
				e.setPassword("Raju@03");
				e.setSalary(60000);
				e.setDesignation("HR");
				tran.commit();
			}
	}

}
