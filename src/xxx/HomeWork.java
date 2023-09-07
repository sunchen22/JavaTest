package xxx;

public class HomeWork {
	public static void main(String[] args) {
//第一題
//• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 12, b = 6;
		int sum1 = a + b;
		int sum2 = a * b;
		System.out.println("12+6=" + sum1 + " " + "12X6=" + sum2);

//第二題
//• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int dozen = 200 / 12;
		int egg = 200 % 12;
		System.out.println("200顆蛋共" + dozen + "打" + egg + "顆");

//第三題	
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int time = 256559;
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 3600) % 24;
		int day = (time / 3600) / 24;
		System.out.println("2256559秒為" + day + "日" + hour + "時" + minute + "分" + second + "秒");

//第四題	
//• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double pi = 3.1415;
		double area = Math.pow(5, 2) * pi;
		double line = 5 * 2 * pi;
		System.out.println("圓面積為" + area);
		System.out.println("圓周長為" + line);

//第五題
//• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//金加利息共有多少錢 (用複利計算，公式請自行google)
		int capital = 1500000;
		double rate = 1.02;
		double money = capital * Math.pow(rate, 10);
		System.out.println("本金加利息共有" + (int) money + "元");

//第六題
//• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//並請用註解各別說明答案的產生原因
//5 + 5
//數字+數字,java直接進行算數運算
		System.out.println(5 + 5);

//5 + ‘5’
//單引號表示內容為字元，參照編碼表為55
		System.out.println(5 + '5');

//5 + “5”
//雙引號表示內容為文字，+號會進行文字串接
		System.out.println(5 + "5");

	}

}
