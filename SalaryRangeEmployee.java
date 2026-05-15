package org.jsp.emplyeeproject;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SalaryRangeEmployee {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the Minimum Salary");
		double eminsal=scn.nextDouble();
		System.out.println("enter the Maximum Salary");
		double emaxsal=scn.nextDouble();
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses=sef.openSession();
		Query<Employee> q=ses.createQuery("select e from Employee e where e.salary between ?1 and ?2",Employee.class);
		q.setParameter(1,eminsal);
		q.setParameter(2,emaxsal);
		List<Employee>elist=q.getResultList();
		if(elist.size()>0) {
			for(Employee e : elist) {
				System.out.println(e.getId()+ "\t" +e.getName()+ "\t" +e.getPhone()+ "\t" +e.getEmail()+ " \t " +e.getPassword()+ " \t " +e.getSalary()+ " \t " +e.getDesignation());
			}
		}
		else {
			System.err.println("No Record Found");
		}
	}

}
