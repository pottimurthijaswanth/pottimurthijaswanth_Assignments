
import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
	   
		int marks1,marks2;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your marks :");
		 marks1=scan.nextInt();
		 marks2=scan.nextInt();
		if(marks1>60){
			System.out.println("Passed");
		}
		else if(marks2>60){
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}

