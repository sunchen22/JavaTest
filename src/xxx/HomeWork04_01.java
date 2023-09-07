package xxx;

public class HomeWork04_01 {
	public static void main(String[] args) {
//		第一題
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}		
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)
		int[] num = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		int avg = sum / num.length;
		System.out.println("平均值:" + avg);
		System.out.print("大於平均值的元素:");
		for (int i = 0; i < num.length; i++) {
			if (num[i] > avg) {
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
		System.out.println("================================");

////		第二題		
////		• 請建立一個字串，經過程式執行後，輸入結果是反過來的
////		例如String s = “Hello World”，執行結果即為dlroW olleH
////		(提示：String方法，陣列)
		String s = "Hello World";
//
////		方法一(toCharArray()):
		char[] schar = s.toCharArray();
		for (int i = schar.length - 1; i >= 0; i--) {
			System.out.print(schar[i]);
		}
		System.out.println();
		System.out.println("================================");
//
////		方法二(substring):
		for (int i = 10; i >= 0; i--) {
			System.out.print(s.substring(i, i + 1));
		}
		System.out.println();
		System.out.println("================================");
//
////		方法三(only for迴圈 charat):
		for (int i = 10; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("================================");
//
////		方法四(StringBuilder):
		StringBuilder str = new StringBuilder();
		str.append("Hello World");
		str.reverse();
		System.out.print(str);

//		第三題
//		有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//		(提示：字元比對，String方法)

		String[] str2 = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;

		
//可用SWITCH case達到簡化
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length(); j++) {
//				System.out.print(str2[i].substring(j, j + 1));
				if (str2[i].substring(j, j + 1).equals("a") || str2[i].substring(j, j + 1).equals("e")
						|| str2[i].substring(j, j + 1).equals("i") || str2[i].substring(j, j + 1).equals("o")
						|| str2[i].substring(j, j + 1).equals("u")) {
					count++;
				}
			}

		}
		System.out.print("共有" + count + "個母音");

	}
}
