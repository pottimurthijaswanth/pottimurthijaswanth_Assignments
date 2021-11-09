import java.util.Scanner;
    public class TotalAvg{

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the a marks: ");
		int a=scan.nextInt();
		
		System.out.println("enter the b marks:");
		int b=scan.nextInt();
		
		System.out.println("enter the c marks: ");
		int c=scan.nextInt();
		
		int Total=a+b+c;
		
		int Avg=(a+b+c)/3;
		
		System.out.println(" The total marks obtained is"+Total);
		System.out.println("Avg of subjects is: "+Avg);

	}

}

