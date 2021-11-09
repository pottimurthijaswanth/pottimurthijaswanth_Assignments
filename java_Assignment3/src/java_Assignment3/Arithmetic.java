package java_Assignment3;

import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the first number: ");
		int number1 =scan.nextInt();
		
		System.out.println("enter the second number");
		int number2=scan.nextInt();
		
		try
		{
		int result=number1/number2;
		System.out.println(result);
		}
		
		catch(Exception e){
			System.out.println("Arithmetic Exception");
			
		}
		System.out.println("Divided by zero is not allowed");
		
		

	}

}
