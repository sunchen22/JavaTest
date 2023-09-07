package xxx;

import java.util.Scanner;

public class HomeWork04_03 {
//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = 0;
		int month = 0;
		int day = 0;
		int theday = 0;

		int[] m = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 || year % 1000 == 0) {
			m[1] = 29;
		}

		a: while (true) {
			System.out.println("請輸入西元年份:");
			year = sc.nextInt();
			System.out.println("請輸入月份:");
			month = sc.nextInt();
			System.out.println("請輸入日期:");
			day = sc.nextInt();

			if (m[month - 1] >= day) {
				for (int i = 0; i < (month - 1); i++) {
					theday += m[i];
					break a;
				}
			} else {
				System.out.println("日期錯誤，請重新輸入");
			}
		}

		System.out.println("輸入日期為該年的第" + (theday + day) + "天");
		sc.close();

	}
}

