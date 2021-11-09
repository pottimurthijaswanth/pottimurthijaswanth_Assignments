public class Client {
	
	public static void main(String[] args) {
		
	    Filepersistence file = new Filepersistence();
	    file.persist();
	    Databasepersistence data =new Databasepersistence();
	    data.persist();
		}

}
