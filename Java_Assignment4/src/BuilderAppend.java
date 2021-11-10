
public class BuilderAppend {

	public static void main(String[] args) {
		
		
		StringBuilder sb =new StringBuilder("It is used to at a specified index position");
		
		int index=13;
		
		sb.insert(index," insert text");

		System.out.println(sb);
	}

}

