package xxx;

public class Elephant extends Animal {
	public String name;

	public void speak() {
		System.out.println("名稱:" + name);
		super.speak();
	}

	public Elephant(int age, float weight,String name) {
		super(age, weight);
		this.name = name;
		
	}

	public static void main(String[] args) {

		Elephant elepant = new Elephant(8, 1200.0f,"大象");
		elepant.speak();
		
		Animal animal = new Animal(3,8.0f);
		animal.speak();

	}

}
