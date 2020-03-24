// a "Document" can't be instantiated! But its children can
public abstract class Document {

	protected String name;

	public void printThatIExsit() {
		System.out.println("Document exists!");
	}
	
	// declaration only!
	public abstract void printDocumentName();
}
