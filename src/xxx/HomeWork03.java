package xxx;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork03 {
	public static void main(String[] args) {
//		第一題
//		請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形，如圖示結果：

		Scanner sc = new Scanner(System.in);

//		方法1:
//		System.out.println("請輸入三個整數:");	
//		int triangle1 = sc.nextInt();
//		int triangle2 = sc.nextInt();
//		int triangle3 = sc.nextInt();
//		if(triangle1 ==triangle2 && triangle2 == triangle3) {
//		System.out.println("此為正三角形");
//	}else if(triangle1 ==triangle2 ||triangle2 == triangle3) {
//		System.out.println("此為等腰三角形");			
//	}else if(triangle1==0||triangle2==0||triangle3==0) {
//		System.out.println("這個不是三角形!");						
//	}else {
//		System.out.println("此為其他三角形");	
//	}

//		方法2:
		System.out.println("請輸入三個整數:");	
		int [] triangle = new int[3];
			
		for(int i =0;i<3;i++) {
		 triangle[i] = sc.nextInt();			
		};
//		
//		if(triangle[0] ==triangle[1] && triangle[1] == triangle[2]) {
//		System.out.println("此為正三角形");
//	}else if(triangle[0] ==triangle[1] ||triangle[1] == triangle[2]) {
//		System.out.println("此為等腰三角形");			
//	}else if(triangle[0]==0||triangle[1]==0||triangle[2]==0) {
//		System.out.println("這個不是三角形!");						
//	}else {
//		System.out.println("此為其他三角形");	
//	}

//		(進階功能：加入直角三角形的判斷)
		Arrays.sort(triangle);
		if(triangle[0] ==triangle[1] && triangle[1] == triangle[2]) {
		System.out.println("此為正三角形");
	}else if(triangle[0] ==triangle[1] ||triangle[1] == triangle[2]) {
		System.out.println("此為等腰三角形");			
	}else if(triangle[0]==0||triangle[1]==0||triangle[2]==0) {
		System.out.println("這個不是三角形!");						
	}else if(triangle[0]*triangle[0]+triangle[1]*triangle[1]==triangle[2]*triangle[2]) {
		System.out.println("此為直角三角形!");			
	}else {
		System.out.println("此為其他三角形");	
	}	

//		第二題		
//		請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息，如圖示結果：

//		System.out.println("開始猜數字吧!請輸入0~9之間的數字~");		
//		int r =(int) (Math.random()*10);
//		int num =sc.nextInt();
//		while(num != r) {
//			System.out.println("猜錯了，再猜一次！");	
//			num =sc.nextInt();
//		}
//		System.out.println("答對了！答案就是："+r);			
//		

//		第二題		
//		(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案) 

		System.out.println("★★★猜數字PART2★★★");	
		System.out.println("請輸入0～100之間的數字~");		
		int r2 =(int) (Math.random()*101);
		int num2 =sc.nextInt();		
		while(num2 != r2) {
			if(num2<r2) {
				System.out.println("再猜一次!正確數字比你大方多了!");	
				num2 =sc.nextInt();				
			}else {
				System.out.println("再猜一次!正確數字較小!");	
				num2 =sc.nextInt();					
			}
		}
		System.out.println("答對了！答案就是："+r2);
		sc.close();
	}
}
