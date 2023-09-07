package HomeworkExt;

public abstract class Pen {

	private String brand;
	private int price;

	public Pen() {
	};

	public String getbrand() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("輸入價格不得小於0");
		}
	}

	public abstract void write();
}
