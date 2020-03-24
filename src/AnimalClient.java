import java.util.ArrayList;

public class AnimalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList of Animal objects
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Cat());	// adding a Cat to an Animal array list
		animals.add(new Dog()); // adding a Dog to an Animal array list
		// animals.add(new ExcelDocument());	// No- not in inheritance chain
		
		//Animal.printAnimals(animals);
		
		//Animal.OutputAnimalBehavior(animals);
		
		Animal.PerformAnimalBehaviors(animals);
	}
	
}
