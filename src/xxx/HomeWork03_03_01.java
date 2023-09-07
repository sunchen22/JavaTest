package xxx;

import java.util.Scanner;

public class HomeWork03_03_01 {
	public static void main(String[] args) {
//	第三題	
//	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//	厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	的號碼與總數，如圖：

	Scanner sc = new Scanner(System.in);
	System.out.println("阿文，請輸入討厭的數字(1～9)");
	int hatenum = sc.nextInt();

	int sum = 0;

	System.out.println("有這些數字可以選擇：");
	for (int i = 1; i <= 49; i++) {
		if (i % 10 == hatenum) {
			continue;
		} else if (i > 9 && i % (10 * hatenum) <= 9 && i / (10 * hatenum) == 1) {
			continue;
		}
		System.out.print(i + "\t");
		sum++;
	}
	System.out.println();
	System.out.println("共：" + sum + "個數字");
	sc.close();
}
}
