package com.day6;
import java.util.*;
public class UserMain {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println(" 1) Login \n 2) New User \n 3)View All \n 4)exit");
			int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the username :");
			String uname=sc.next();
			System.out.println("Enter password :");
			String pass=sc.next();
			UserService us=new UserService();
			if(us.validateUser(uname,pass)) 
			{
				System.out.println("Welcome "+uname+"!");			   
			}
			else
			{
				System.out.println("Invalid User Data");
			}
			break;
		case 2:
			System.out.println("Enter the username :");
			String uname1=sc.next();
			System.out.println("Enter password :");
			String pass1=sc.next();
			UserService us1=new UserService();
			us1.addUser(uname1,pass1);
			break;
		case 3:
			UserService us2=new UserService();
		    
			us2.getDetails();
			break;
		case 4:
			System.exit(0);
		}
		}
		}
	}


