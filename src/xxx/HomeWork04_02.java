package xxx;

import java.util.Scanner;

public class HomeWork04_02 {
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下：
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("想借多少錢？");
		int money = sc.nextInt();
		System.out.println("有錢可借的員工編號:");
		int count = 0;

		int[][] e = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e[i].length; j++) {
				if (i>0 && e[i][j] >= money) {
					System.out.print(e[i][j] + " ");
					count++;
				}
			}
		}
		System.out.print("共" + count + "人");
		sc.close();
	}
}
