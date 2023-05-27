package com.gl.app;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredServiceImpl;

public class EmailDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstname = sc.next();
		System.out.println("Enter Last Name");
		String lastname = sc.next();
		Employee e1 = new Employee(firstname,lastname); 
		CredServiceImpl cs = new CredServiceImpl();
		
		System.out.println("1. Techncal");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		System.out.println("Please enter a Choice");
		int choice=  sc.nextInt();
		
		String genemail = "";
		String genpass = "";
		switch(choice)
		{
		case 1 : genemail = cs.generateEmailId(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(), "tech");
		break;
		case 2 : genemail = cs.generateEmailId(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(), "admin");
		break;
		case 3 : genemail = cs.generateEmailId(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(), "hr");
		break;
		case 4 : genemail = cs.generateEmailId(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(), "legal");
		break;
		 default :
			 System.out.println("PLEASE ENTER VALID OPTION");
		}
		
			genpass = cs.generatePassword();
			e1.setEmail(genemail);
			e1.setPassword(genpass);
			
			cs.showDetails(e1);

}
}