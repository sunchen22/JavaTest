package xxx;

public class Dog implements Weightget{
	protected String name;
	private double weight;
	
	public Dog() {
		super();
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void getWeightTool() {
		setName("狗");
		System.out.print(getName()+"的秤重工具是體重計");
	}
}

//以下是自己練習的
//可以直接做在dog class啦
//class DogWeight extends Dog implements Weightget{
//
//	public void getWeightTool() {
//		super.setName("狗");
//		System.out.print(super.getName()+"的秤重工具是體重計");
//}
//}