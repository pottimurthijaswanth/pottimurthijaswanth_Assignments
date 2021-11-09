import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int n1,n,Sum=0,digit;
	
    System.out.println("enter n");
    n=scan.nextInt();
    
    n1=n;
	 Sum=0;
	 
	 while(n!=0){
		 digit=n%10;
		 Sum=Sum+(digit)*(digit)*(digit);
		 n=n/10;
	 }
	 
	 if(n1==Sum)
	 {
		 System.out.println("it is armstrong");
		 
	 }else{
		 
		 System.out.println("not amstrong");
	 
	 }

	}
}
