
import java.util.*;
public class BubbleSort {

	static void BubbleSort(int a[],int key)
	{
	 int i,j,temp;
	 boolean found=false;
	 for(i=0;i<14;i++)
	 {
		 for(j=0;j<(14-i);j++)
		 {
			 if(a[j] > a[j+1])
			 {
				 temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
			 }
		 }
	 }
	 for(i=0;i<15;i++)
		{
			if(a[i]==key)
			{
				found=true;
				System.out.println(" key "+key+" found in the array" );
			break;
			
			}
		}
		if(found==false)
		{
			System.out.println("key "+key+" not found in the array");
			
		}
	}
	

	public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
		
		int a[]=new int[15];
		int i,key;
        boolean found=false;
        
        System.out.println("enter the elements in the array:");
        for(i=0;i<15;i++)
        {
        	a[i]=scan.nextInt();
        }
		System.out.println("enter the element to be searched:");
		key=scan.nextInt();
		
		BubbleSort(a,key);
		

	}

}
