

public class Strings {

	public static void main(String[] args) {
		
		String str1="Hello,";
		String str2="How are you?";
		
		String str3=str1+=str2;
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		String replaceString=str3.replace('a','$');
		System.out.println(replaceString);
		System.out.println(str1.contains("collection"));
		System.out.println(str1.contains("Hello"));
		System.out.println(str1.equals(str2));

	}

}
