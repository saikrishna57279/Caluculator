package Scanner;

import java.util.Scanner;

public class Calculator 
{
	/*WAP for calculator?
	 * Enter 1 for addition
	 * Enter 2 Subtraction
	 * Enter 3 Multiplication
	 * Enter 4 Division
	 * Switch or else if ladder
	 * In valid input
	 * Enter 2 for addition 2 numbers
	 * Enter 3 for addition 3 numbers
	 * Enter 4 for addition 4 numbers
	 * In valid input
	 * Press 1 for continue 2 for exit
	 * Thank you
	 */
	public static void Calculation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Calculator-------");
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplacation");
		System.out.println("Enter 4 for Division");
		int chooice =sc.nextInt();
		if (chooice==1) 
		{
			System.out.println("Enter 2 addition for 2 numbers ");
			System.out.println("Enter 3 addition for 3 numbers ");
			System.out.println("Enter 4 addition for 4 numbers ");
			int num=sc.nextInt();
			if (num==2) 
			{
				System.out.println("Enter first number:");
				int n1=sc.nextInt();
				System.out.println("Enter second number:");
				int n2=sc.nextInt();
				int result=n1+n2;
				System.out.println("Result : "+result);
			}
			else if (num==3) 
			{
				System.out.println("Enter first number:");
				int n1=sc.nextInt();
				System.out.println("Enter second number:");
				int n2=sc.nextInt();
				System.out.println("Enter third number:");
				int n3=sc.nextInt();
				int result=n1+n2+n3;
				System.out.println("Result : "+result);
			}
			else if (num==4) 
			{
				System.out.println("Enter first number:");
				int n1=sc.nextInt();
				System.out.println("Enter second number:");
				int n2=sc.nextInt();
				System.out.println("Enter third number:");
				int n3=sc.nextInt();
				System.out.println("Enter fourth number:");
				int n4=sc.nextInt();
				int result=n1+n2+n3+n4;
				System.out.println("Result : "+result);
			}
			else 
			{
				System.err.println("Invalid OPTION...");
			}
			
		}
		else if (chooice==2) 
		{
			System.out.println("Enter 2 Subtraction for 2 numbers ");
			System.out.println("Enter 3 Subtraction for 3 numbers ");
			System.out.println("Enter 4 Subtraction for 4 numbers ");
			int num1=sc.nextInt();
			if (num1==2) 
			{
				System.out.println("Enter first number:");
				int n1=sc.nextInt();
				System.out.println("Enter second number:");
				int n2=sc.nextInt();
				int result=n1-n2;
				System.out.println("Result : "+result);
			}
			else if (num1==3) 
			{
				System.out.println("Enter first number:");
				int n1=sc.nextInt();
				System.out.println("Enter second number:");
				int n2=sc.nextInt();
				System.out.println("Enter third number:");
				int n3=sc.nextInt();
				int result=n1-n2-n3;
				System.out.println("Result : "+result);
			}
			else if (num1==4) 
			{
				System.out.println("Enter first number:");
				int n1=sc.nextInt();
				System.out.println("Enter second number:");
				int n2=sc.nextInt();
				System.out.println("Enter third number:");
				int n3=sc.nextInt();
				System.out.println("Enter fourth number:");
				int n4=sc.nextInt();
				int result=n1-n2-n3-n4;
				System.out.println("Result : "+result);
			}
			else 
			{
				System.err.println("Invalid OPTION...");
			}
			
		}
		else if (chooice==3) 
		{

			System.out.println("Enter 2 Multiplacation for 2 numbers ");
			System.out.println("Enter 3 Multiplacation for 3 numbers ");
			System.out.println("Enter 4 Multiplacation for 4 numbers ");
			int num2=sc.nextInt();
			if (num2==2) 
			{
				System.out.println("Enter first number:");
				int n1=sc.nextInt();
				System.out.println("Enter second number:");
				int n2=sc.nextInt();
				int result=n1*n2;
				System.out.println("Result : "+result);
			}
			else if (num2==3) 
			{
				System.out.println("Enter first number:");
				int n1=sc.nextInt();
				System.out.println("Enter second number:");
				int n2=sc.nextInt();
				System.out.println("Enter third number:");
				int n3=sc.nextInt();
				int result=n1*n2*n3;
				System.out.println("Result : "+result);
			}
			else if (num2==4) 
			{
				System.out.println("Enter first number:");
				int n1=sc.nextInt();
				System.out.println("Enter second number:");
				int n2=sc.nextInt();
				System.out.println("Enter third number:");
				int n3=sc.nextInt();
				System.out.println("Enter fourth number:");
				int n4=sc.nextInt();
				int result=n1*n2*n3*n4;
				System.out.println("Result : "+result);
			}
			else 
			{
				System.err.println("Invalid OPTION...");
			}
		}
		else if (chooice==4) 
		{
			System.out.println("Enter first number:");
			int n1=sc.nextInt();
			System.out.println("Enter second number:");
			int n2=sc.nextInt();
			int result=n1/n2;
			System.out.println("Result : "+result);
		}
		else
		{
			System.err.println("Invalid Input...");
		}
		conti();
	}
	public static void conti()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for continue 2 for Exit...");
		int num=sc.nextInt();
		if (num==1)
		{
			Calculation();
		}
		else if(num==2)
		{
			System.out.println("Thank You...!");
		}
	}
	public static void main(String[] args)
	{
		Calculation();
	}
}
