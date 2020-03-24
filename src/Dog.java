
public class Dog extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eating...");
	}
	
	public void bark() {
		System.out.println("Dog barking...");
	}

	public void retrieve() {
		System.out.println("Retrieving a duck...");
	}
	
	// Dog only does one things
	public void performBehavior() {
		// TODO Auto-generated method stub
		bark();
		retrieve();
	}

}
