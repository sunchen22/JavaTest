package HomeworkExt;

public class InkBrush extends Pen {

	public InkBrush(int price, String brand) {
		setprice(price);
		super.setbrand(brand);
	};

	public void write() {
		System.out.println("沾墨汁再寫");
	}

	public void setprice(int price) {
		super.setprice((int)(price*0.9));
	}

}
