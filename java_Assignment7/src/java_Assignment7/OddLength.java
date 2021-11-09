package java_Assignment7;

import java.util.ArrayList;
import java.util.List;

public class OddLength 
{
	public static void main(String[] args) 
	{
		List<String> li=new ArrayList<>();
		li.add("sai");
		li.add("nithin");
		li.add("mallikarjun");
		li.add("rahul");
		
		System.out.println("-------------------------------");
		System.out.println("Elements in the list are:");
		
		for (String string : li) {
			System.out.println(string);
		}
		System.out.println("-------------------------------");
		System.out.println(" ");
		
		li.removeIf(a->(a.length()%2 !=0));
		System.out.println("------------------------------------------");
		System.out.println("Elements in the list with odd lengths are:");
		
		for (String string : li) {
			System.out.println(string);
		}
		System.out.println("------------------------------------------");
	}
}