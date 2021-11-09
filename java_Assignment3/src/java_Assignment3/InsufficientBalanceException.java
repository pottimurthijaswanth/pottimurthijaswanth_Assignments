package java_Assignment3;


 import java.util.Scanner;
public class InsufficientBalanceException {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter the amount you need :");
		int amount=scan.nextInt();
		
		int balance=2000;
		
		if(amount>balance || balance==0)
		{
		 System.out.println("Raise InsufficientBalance Exception");	
		}
		else{
			System.out.println("Raise InsufficientBalance Exception");	
		}

	}

}
