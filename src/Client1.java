
public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// can't instantiate an object from an abstract class
		// Document d = new Document();
		
		// We can, however, create objects form concrete classses
		// that inherit from abstract ones:
		ExcelDocument e = new ExcelDocument();
		
		// set name of e:
		e.name = "My first Excel Document";
		
		e.printThatIExsit(); 
		
		e.printDocumentName();
	}

}
