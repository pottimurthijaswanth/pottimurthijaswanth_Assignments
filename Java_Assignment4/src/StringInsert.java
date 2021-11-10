public class StringInsert{

	public static void main(String[] args) {
		
		
		StringBuffer sb =new StringBuffer("It is used to at a specified index position");
		
		int index=13;
		
		sb.insert(index," insert text");

		System.out.println(sb);
	}

}

