import java.io.*;
import java.util.*;
import java.lang.Math;
public class IncomeTax {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
			double tax=0.0;
				
				System.out.println("Enter your income: ");
				double income=scan.nextDouble();
				
				System.out.println("You income per annum is "+income);
				
				
				if(income<=180000)
				{
					
					tax=0.0;
				}
				else if (income>181000 && income<=300000)
				{
					
					tax=income*(0.1);
				}
				else if(income>300001 && income<=500000)
				{
					
					tax=income*(0.2);
				}
				else
				{
					
					tax=income*(0.3);
				}
				System.out.println("The income tax amount need to be paid is " +tax);

			}

		}
