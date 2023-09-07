package xxx;

public class Homework02 {
	public static void main(String[] args) {
		// 第1題
		// 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)

		int sum1 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.print("第1題: ");
		System.out.println("2+4+6+8+…+1000= " + sum1);

		// 第2題
		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int sum2 = 1;
		for (int i = 1; i <= 10; i++) {
			sum2 *= i;
		}
		System.out.print("第2題: ");
		System.out.println("1*2*3*…*10= " + sum2);

		// 第3題
		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int sum3 = 1;
		int i = 1;
		while (i <= 10) {
			sum3 *= i;
			i++;
		}
		System.out.print("第3題: ");
		System.out.println("1*2*3*…*10= " + sum3);

		// 第4題
		// 請設計一隻Java程式，輸出結果為以下：
		// 1 4 9 16 25 36 49 64 81 100
		System.out.print("第4題: ");
		for (i = 1; i <= 10; i++) {
			System.out.printf("%.0f", (Math.pow(i, 2)));
			System.out.printf(" ");
		}
		System.out.println();

		// 第5題
		// 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		System.out.print("第5題-阿文可以選擇的數字: ");
		int sum5 = 0;
		for (i = 1; i <= 49; i++) {
			if (i % 10 == 4) {
				continue;
			} else if (i > 9 && i % 40 <= 9) {
				continue;
			}
			sum5++;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("第5題-共有:" + sum5++ + "個");

		// 第6題
		// 請設計一隻Java程式，輸出結果為以下：
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		System.out.println("第6題: ");
		for (i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 第7題
		// 請設計一隻Java程式，輸出結果為以下：
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF
		System.out.println("第7題: ");

		for (i = 1; i <= 6; i++) {
			int k=1;
			while (i >= k) {
				System.out.print((char)(i + 64));
				k++;
				}
			System.out.println();
			}
			System.out.println();
		}

	

}
