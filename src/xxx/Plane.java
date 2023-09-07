package xxx;

public class Plane implements Weightget{
	private String kind;     // 種類
	private double weight;
	
	public Plane() {
		super();
	}

	public Plane(String kind, double weight) {
		super();
		this.kind = kind;
		this.weight = weight;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void getWeightTool() {
		setKind("飛機");
		System.out.print(getKind()+"的秤重工具是地磅");
}

}


//以下是自己練習的
//可以直接做在Plane class啦
//class PlaneWeight extends Plane implements Weightget{
//	public void getWeightTool() {
//		super.setKind("飛機");
//		System.out.print(super.getKind()+"的秤重工具是地磅");
//}
//}