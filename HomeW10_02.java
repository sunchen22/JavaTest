package HomeWork10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class HomeW10_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("請輸入一個任意數");
			String num = sc.next();
			if (isNumeric(num) == true) {
				Double dnum = Double.parseDouble(num);
				System.out.println("任選一種類型：1.千分位 2.百分比 3.科學記號（請輸入數字）");
				int type = sc.nextInt();
				switch (type) {
				case 1:
					Format df = new DecimalFormat("#,###");
					System.out.println("千分位:" + df.format(dnum));
					break;
				case 2: // 怪怪的
					Format dfh = new DecimalFormat("##%");
					System.out.println("百分比:" + dfh.format(dnum));
					break;
				case 3:
					Format dfe = new DecimalFormat("0.###E0");
					System.out.println("科學記號:" + dfe.format(dnum));
					break;
				}
				sc.close();
				break;
			} else {
				System.out.println("格式錯誤,請重新輸入");
			}
		}
	}

	public static boolean isNumeric(String str) {
		return str.matches("^([-+]?\\d+)(\\.\\d+)?$");
	}
}
