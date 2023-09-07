package HomeworkExt;

public class Pencil extends Pen {

	public Pencil(int price, String brand) {
		setprice(price);
		super.setbrand(brand);
	};

	public void write() {
		System.out.println("削鉛筆再寫");
	}

	public void setprice(int price) {
		super.setprice((int)(price*0.8));
	}

}
