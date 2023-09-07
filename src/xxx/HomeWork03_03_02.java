package xxx;

import java.util.Scanner;

public class HomeWork03_03_02 {
	public static void main(String[] args) {
//		第三題	
//		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數，如圖：
//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文，請輸入討厭的數字(1～9)");

		int[] comnum = new int[6];

		int hatenum = sc.nextInt();

		A: for (int i = 0; i < comnum.length; i++) {
			comnum[i] = (int) (Math.random() * 49 + 1);

			if (comnum[i] % 10 == hatenum) {
				i--;
				continue A;
			} else if (comnum[i] > 9 && comnum[i] % (10 * hatenum) <= 9 && comnum[i] / (10 * hatenum) == 1) {
				i--;
				continue A;
			} else {
				for (int j = 0; j < i; j++) {
					if (comnum[i] == comnum[j]) {
						i--;
						continue A;
					}
					// continue;
				}
				System.out.print(comnum[i] + " ");
			}
		}
		sc.close();
	}
}