
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		






		System.out.println("enter the principal: ");
		double principal = scan.nextDouble();
		
		System.out.println("enter the rate:");
		double rate = scan.nextDouble();
		
		System.out.println("enter the time:");
		double time = scan.nextDouble();
		
		
		
		double interest = (principal*rate*time);
		
		System.out.println("Principal:" + principal);
		System.out.println("Interest rate:" + rate);
		System.out.println("Duration time:" + time);
		
		System.out.println("Simple Interest:" + interest);
		
		

		
	}

}
