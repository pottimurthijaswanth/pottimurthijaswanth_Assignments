
public class ArmstrongNumbers {

	public static void main(String[] args) {

	 for(int k=100;k<=1000;k++)
	 {
	 int n=k;
	 int digit=0;
	 int Sum=0;
	 
	 while(n!=0){
		 digit=n%10;
		 Sum=Sum+(digit)*(digit)*(digit);
		 n=n/10;
	 }
	 
	 if(k==Sum)
	 {
		 System.out.println(k+ "is armstrong");
		 
	 }
	 
	 }

	}

}

