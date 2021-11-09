import java.util.Scanner;
public class SearchArray {

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


}
