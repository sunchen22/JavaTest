package xxx;

public class TestNineNine {
//	請建立一個TestNineNine.java程式，可輸出九九乘法表
//	• 一：使用for迴圈 + while迴圈
	public static void main(String[] args) {
		int i = 1;
		int j;

		for (i = 1; i <= 9;i++) {
			j = 1;
			while (j <= i) {
				System.out.print(i+"*"+j+"="+ (i * j)+"\t");
				j++;
			}
			System.out.println();
		}
		System.out.println("===========================");
		
//	• 二：使用for迴圈 + do while迴圈

		for (i = 1; i <= 9; i++) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				j++;
			} while (j <= i);
			System.out.println();
		}
		System.out.println("===========================");
		
//	• 三：使用while迴圈 + do while迴圈
		int k =1;
		while (k <= 9) {
			j = 1;
			do {
				System.out.print(k + "*" + j + "=" + (k * j) + "\t");
				j++;
			} while (j <= k);
			System.out.println();
			k++;
		}

	}
}
