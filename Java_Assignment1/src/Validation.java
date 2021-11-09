
 import java.util.*;
import java.lang.Math;
public class Validation {

	
		
		public static void Validation(String name,String pwd,int attempts)
		{
				String n="sai",p="123";
				
				int result;
				
				if(attempts!=3)
				{
					if(name.equals(n) && pwd.equals(p))
					{
						System.out.println(" Welcome "+ name);
					}
					else
					{
						System.out.println("invalid login");
						attempts=attempts+1;
						enterDetails(attempts);
						if(attempts==3)
						{
							System.out.println("Login limit exceeded....!!!");
						}
					}
				}
		}
		static void enterDetails(int attempts)
		{
			Scanner scan=new Scanner(System.in);
			String password,name;
			System.out.println("enter the username:");
			name=scan.next();
			System.out.println("enter password:");
			password=scan.next();
			Validation(name,password, attempts);
		}
			public static void main(String [] args){
				int attempts=1;
				enterDetails(attempts);
		}
}
