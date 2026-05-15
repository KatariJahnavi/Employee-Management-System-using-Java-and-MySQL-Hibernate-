package org.jsp.emplyeeproject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the id");
		int eid=scn.nextInt();
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran = ses.beginTransaction();
		Employee e=ses.get(Employee.class, eid);
		if(e!=null) {
			ses.delete(e);
			tran.commit();
		}
		else {
			System.err.println("Invalid id");
		}
	}

}
