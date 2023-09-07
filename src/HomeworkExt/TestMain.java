package HomeworkExt;

public class TestMain {
	public static void main(String[] args) {

		Pen[] p = new Pen[2];
		p[0] = new Pencil(100, "pencil");
		p[1] = new InkBrush(100, "inkbrush");

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getbrand());
			p[i].write();
			System.out.println(p[i].getprice());
		}

	}

}
