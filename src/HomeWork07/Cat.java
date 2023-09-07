package HomeWork07;

import java.io.Serializable;

public class Cat implements Serializable,speak {
	private static final long serialVersionUID = 222L;
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
