package xxx;

public class Student {
	int score = 80;

//需要時間資料，故設定傳入參數
	public void play(int hours) {
		score = score - hours;
	}
//也可以寫score -= hours;	
	
	public void study(int hours) {
		score = score + hours;
	}
//也可以寫score += hours;	
	
	public static void main(String[] args) {
//創立物件，用new
		Student student1 = new Student();		
		student1.play(5);
		student1.study(8);
		System.out.println("student1's score:"+student1.score);
		
		Student student2 = new Student();		
		student2.play(20);
		student2.study(5);
		System.out.println("student2's score:"+student2.score);
		
	}
}
