package org.jsp.emplyeeproject;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DesgEmployee {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the Designation");
		String edesg=scn.next();
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses=sef.openSession();
		Query<Employee> q=ses.createQuery("select e from Employee e where e.designation=?1");
		q.setParameter(1,edesg);
		List<Employee>elist=q.getResultList();
		if(elist.size()>0) {
			for(Employee e : elist) {
				System.out.println(e.getId()+ "\t" +e.getName()+ "\t" +e.getPhone()+ "\t" +e.getEmail()+ "\t" +e.getPassword()+ " \t " +e.getSalary()+ " \t " +e.getDesignation());
			}
		}
		else {
			System.err.println("No Record Found");
		}
	}

}
