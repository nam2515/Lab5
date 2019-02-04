package cg.eis.pl;

import java.security.Provider.Service;
import java.util.Scanner;

import cg.eis.bean.EmployeeSerives;
import cg.eis.service.ServicesOffered;

public class Main {
	static ServicesOffered so= new ServicesOffered();
	static Scanner sc= new Scanner(System.in);
	public static void main(String [] args)
	{
		
		showMenu();
		
	}
	public static void showMenu()
	{
		while(true)
		{
		System.out.println("1. Enter employee details");
		System.out.println("2. show the insurance scheme");
		System.out.println("3. Show all details");
		System.out.println("4. Exit");
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: so.getDetails();
				break;
		case 2: System.out.println(so.showScheme());
				break;
		case 3: System.out.println(so.showAllDetail());
				break;
		case 4: System.exit(0);
		default: System.out.println("You entered wrong choice");
		}
		}
		
	}

}
