package corejava.assignment.basicdatastructure;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username ");
		String username=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		if(username.equals("kiki")&&password.equals("kiki21"))
		{
			System.out.println("Welcome "+username);
		}
		else
		{
			int count=0;
			for(int i=1;i<4;i++)
			{
				System.out.println("enter correct username ");
				username=sc.next();
				System.out.println("enter correct password");
				password=sc.next();
				if(username.equals("kiki")&&password.equals("kiki21"))
				{
					System.out.println("Welcome "+username);
					break;
				}
				count++;
			}
			if(count==3)
				System.out.println("contact admin");
			
		}

	}

}
