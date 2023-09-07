package HomeWork08;

import java.util.Objects;

public class train implements Comparable<train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public train() {};

	public train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public String info() {
		return "您的班次為:"+number+" 車種為:"+type+" 出發地為:"+start+" 目的地為:"+dest+" 票價"+price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		train other = (train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	public int compareTo(train anumber) {
		if(this.number > anumber.number) {
			return -1;
		}else if(this.number == anumber.number) {
			return 0;
		}else {
			return 1;
		}
	}


}
