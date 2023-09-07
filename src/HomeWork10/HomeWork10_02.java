package HomeWork10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork10_02 {
//	請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
//	(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖 (提示： TestFormatter.java, Java API
//	文件, 判斷數字可用正規表示法)

	public static void main(String[] args) {
		boolean b = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個任意數");
		while (true) {
			try {
				int num = sc.nextInt();
				System.out.println("任選一種類型：1.千分位 2.百分比 3.科學記號（請輸入數字）");
				int type =sc.nextInt();
				switch(type) {
				case 1:
					Format df = new DecimalFormat("#,###"); 
					System.out.println("千分位:"+df.format(num));
					b = true;
					break;
				case 2:
					Format dfh = new DecimalFormat("##%"); 
					System.out.println("百分比:"+dfh.format(num));
					b = true;
					break;
				case 3:
					Format dfe = new DecimalFormat("0.###E0");
					System.out.println("科學記號:"+dfe.format(num));
					b = true;
					break;
				}
				if (b == true) {
					break;
				}
			} catch (InputMismatchException n) {
				System.out.println("格式錯誤,請再輸入一次");
				String s1 = sc.nextLine();
			}
			
		}	
		sc.close();
		
	}

}
