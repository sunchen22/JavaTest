package Cube;

public class Cube {
	private double length;

	public Cube() {
	};

	public double getlength() {
		return length;
	}

	public void setlength(double length) throws CubeException{
		if (length <= 0) {
			throw new CubeException("正方體邊長不得為0或負數");
		} else {
			this.length = length;
		}
	}

	public double volume() {
		double vol ;
		return vol = Math.pow(length, 3);
	}
}
