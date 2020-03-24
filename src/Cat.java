
public class Cat extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat eating...");
	}
	
	public void meow() {
		System.out.println("Cat meowing...");
	}

	// Cat only does one thing
	public void performBehavior() {
		// TODO Auto-generated method stub
		meow();
	}
}
