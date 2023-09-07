package Cal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
//	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			try {
//				System.out.print("請輸入X值:");
//				String x = sc.next();
//				if (isNumeric(x) == true) {
//					System.out.print("請輸入y值:");
//					String y = sc.next();
//					if (isNumeric(y) == true) {
//						int xxx = Integer.parseInt(x);
//						int yyy = Integer.parseInt(y);
//						c.powerXY(xxx, yyy);
//						break;
//					} else {
//						System.out.print("格式錯誤");
//					}
//				} else {
//					System.out.print("格式錯誤");
//				}
//			} catch (Exception e) {
//				System.out.print(e.getMessage());
//			}
//			System.out.println();
//		}
//		sc.close();
//	}

//	第二種寫法:
	public static void main(String[] args) {
		Calculator cc = new Calculator();
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("請輸入X值:");
				int x = sc.nextInt();
				System.out.println("請輸入y值:");
				int y = sc.nextInt();     //空白符bug：系統偵測到按下輸入後，沒有跳開（故一直在＂不是Int＂中迴圈）
				cc.powerXY(x, y);
				break;
			} catch (InputMismatchException n) {
				System.out.println("格式錯誤");
				String s1 = sc.nextLine();  //nextLine(); 跳出空白符（另外還有抓取一行String的功用）
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}

		sc.close();
	}

	public static boolean isNumeric(String str) {
		return str.matches("^([-+]?\\d+)(\\.\\d+)?$");
	}
}
