package cg.eis.service;

import java.util.Scanner;

import cg.eis.bean.Employee;
import cg.eis.bean.EmployeeSerives.Employeeservices;

public class ServicesOffered implements Employeeservices {
	static int id,salary;
	static String designation,name;
	static Scanner sc= new Scanner(System.in);
	static Employee[] emp=new Employee[10];
	int count=0;
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Employee ID");
		id=sc.nextInt();
		System.out.println("Enter Employee name: ");
		name=sc.next();
		System.out.println("Enter salary: ");
		salary=sc.nextInt();
		System.out.println("Enter designation");
		designation=sc.next();
		
		emp[count++]= new Employee(id,salary,name,designation);
	}

	@Override
	public String showAllDetail() {
		// TODO Auto-generated method stub
		System.out.println("Enter the employee name you want to search: ");
		String sn=sc.next();
		String output="";
		for(int i=0;i<count;i++)
		{
			if(sn.equals(emp[i].getName()))
			{
				output+="Id:"+" "+ emp[i].getId()+" "+ "Name: "+" " +emp[i].getName()+" "+ "Salary: "+ " "+ emp[i].getSalary()+" "+ "Designation"+" "+ emp[i].getDesignation();
			}
		}
		return output;
	}

	@Override
	public String showScheme() {
		// TODO Auto-generated method stub
		String isc=" ";
		System.out.println("Enter the employees Name:");
		String sn=sc.next();
		System.out.println("Enter the salary:");
		int sal=sc.nextInt();
		System.out.println("Enter designation: ");
		String dsgn=sc.next();
		for(int i=0;i<count;i++)
		{
			if(sn.equals(emp[i].getName()) && sal==emp[i].getSalary() && dsgn.equals(emp[i].getDesignation()))
			{
				if((sal>=12000 && sal<=16000) && dsgn.equals("Internship"))
					isc=isc+"Scheme A is very well suitable....";
				else if((sal>=25000 && sal<=50000) && dsgn.equals("SoftwareEngineer"))
					isc=isc+"Scheme B is very well suitable....";
				else if((sal>50000 && sal<=60000) && dsgn.equals("Manager"))
					isc=isc+"Scheme C is very well suitable....";
				break;
			}
		}
		
		return "Match Not Found";
	}
}
