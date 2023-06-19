
public class Animal {
	
	void printSound() {
		System.out.println("Sounds of Animals");
	}

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		Pig p = new Pig();
		
		a.printSound();
		d.printSound();
		c.printSound();
		p.printSound();
	}
}
