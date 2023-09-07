package xxx;

public class Animal {
	public int age;
	public float weight;

	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}

	public void speak() {
		System.out.println("年紀:" + age + "歲");
		System.out.println("體重:" + weight + "公斤");
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public void setweight(float weight) {
		this.weight = weight;
	}
	
	public int getage() {
		return age;
	}

	public float getweight() {
		return weight;
	}
}
