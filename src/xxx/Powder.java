package xxx;

public class Powder implements Weightget{
	private String color; 
	private double weight;
	
	public Powder() {
		super();
	}
	
	public Powder(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void getWeightTool() {
		setColor("Powder");
		System.out.print(getColor()+"秤重工具是天枰");
}
	
}

//以下是自己練習的
//可以直接做在Powder class啦
//class PowderWeight extends Powder implements Weightget{
//	public void getWeightTool() {
//		super.setColor("Powder");
//		System.out.print(super.getColor()+"秤重工具是天枰");
//}
//}
