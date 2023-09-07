package xxx;

public class TestBMI {
	public static void main(String[] args) {
		int weight = 53;
		double height = 1.68;
		double bmi = weight/(height * height); 
//		double bmi = weight/Math.pow(height,2); 立方公式
		System.out.println(bmi);  
//		小數點後留三位; %n為換行
		System.out.printf("bmi=%.3f%n",bmi);  
		
		if(bmi<18.5) {
			System.out.println("過瘦嘍");	
		}else if(18.5<=bmi && bmi<24) {   
			//也可直接寫else if(bmi<24)
			System.out.println("正常");
		}else {
			System.out.println("過胖!");
		}
		

	}
	

}
