package xxx;

public class WeightTest {

	public static void main(String[] args) {
//		以下是自己寫的
		Weightget dogWeight = new Dog();
		dogWeight.getWeightTool();
		System.out.println();

		Weightget planeWeight = new Plane();
		planeWeight.getWeightTool();
		System.out.println();

		Weightget powderWeight = new Powder();
		powderWeight.getWeightTool();
		System.out.println();

//		練習用迴圈寫
//		介面雖然不能產生物件，但以下動作是產生陣列物件，是利用他的型別
		Weightget[] objs = new Weightget[3];
		objs[0] = new Dog();
		objs[1] = new Plane();
		objs[2] = new Powder();

		for (int i = 0; i < objs.length; i++) {
			objs[i].getWeightTool();
			System.out.println();
		}
	}
}
