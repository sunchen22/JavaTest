package xxx;

public class AnimalTeat {
	public static void main(String[] args) {
		Animal dog = new Animal(2, 5.0f);
		dog.speak();

		System.out.println("==========");
		
		dog.setage(5);
		dog.setweight(25.0f);
		dog.speak();
		
	}

}
