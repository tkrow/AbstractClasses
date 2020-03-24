import java.util.ArrayList;

public abstract class Animal {
	protected String name;
	
	public abstract void eat();
	public abstract void performBehavior();
	
	public static void PerformAnimalBehaviors(ArrayList<Animal> animals) {
		for(Animal a : animals) {
			a.performBehavior();
		}
	}
	
	// Each animal does their own thing
	public static void OutputAnimalBehavior(ArrayList<Animal> animals) {
		
		// Loop through all animals
		for(Animal a : animals) {
			// Just Dog functionality
			if(a instanceof Dog) {
				// a.bark() 	// no - have to explicitly convert
				((Dog) a).bark();
			}
			else if(a instanceof Cat) {
				((Cat)a).meow();
			}
		}
	}
	
	// Method that loops through and prints objects
	public static void printAnimals(ArrayList<Animal> animals) {
		
		for(Animal a : animals) {
			System.out.println("a is: " + a);
			a.eat();	// should be in a separate method
			
		}
	}
}
