package HomeWork10;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork10_03 {
//	請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成(1)
//	年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
//	(提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex = "^[12][0-9]{3}[0-1][0-9][0-3][0-9]$";

		A: while (true) {
			System.out.println("請輸入日期(年月日，例如:20110131):");
			String d = sc.next();
			if (d.matches(regex)) {
				System.out.println("欲轉換成哪種格式:(1)年/月/日(2)月/日/年(3)日/月/年:");
				int type = sc.nextInt();
				try {
					Date date = new SimpleDateFormat("yyyyMMdd").parse(d);

					switch (type) {
					case 1:
						Format sfm1 = new SimpleDateFormat("yyyyMMdd");
						System.out.println(sfm1.format(date));
						break A;
					case 2:
						Format sfm2 = new SimpleDateFormat("MMddyyyy");
						System.out.println(sfm2.format(date));
						break A;
					case 3:
						Format sfm3 = new SimpleDateFormat("ddMMyyyy");
						System.out.println(sfm3.format(date));
						break A;
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}

			}
			System.out.println("格式錯誤，請重新輸入");
		}

	}
}
