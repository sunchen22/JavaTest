package xxx;

import java.util.Scanner;

public class TestBMI02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入體重:");
		int weight = sc.nextInt();
		System.out.println("請輸入身高(公尺):");
		double height = sc.nextDouble();
		double bmi = weight/(height * height);
		System.out.println(bmi);
		
		
		if(bmi<18.5) {
			System.out.println("過瘦嘍");	
		}else if(18.5<=bmi && bmi<24) {
			System.out.println("正常");
		}else {
			System.out.println("過胖!");
		}
		sc.close();
	}

}
