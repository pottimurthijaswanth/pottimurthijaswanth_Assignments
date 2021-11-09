
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the principal: ");
		double principal = scan.nextDouble();
		
		System.out.println("enter the rate:");
		double rate = scan.nextDouble();
		
		System.out.println("enter the time:");
		double time = scan.nextDouble();
		
		










System.out.println("enter the number of times to be compounded");
		int number=scan.nextInt();
		
		double interest = principal*(Math.pow((1 + rate/100),(time * number))) - principal;
		
		System.out.println("Principal:" + principal);
		System.out.println("Interest rate:" + rate);
		System.out.println("Duration time:" + time);
		System.out.println("number of time interest compounded:"+number);
		System.out.println("Simple Interest:" + interest);
		
		

		
	}

}
