package HomeWork07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork07_01 {
//	請自行建立一個文字檔Sample.txt，內容如下：
//	請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//	Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

	public static void main(String[] args) {
		try {
			String s;
			int i = 0;
			int count = 0;
			int row = 0;
			File f = new File("c:\\javawork\\Sample.txt");

			FileReader f1 = new FileReader("c:\\javawork\\Sample.txt");
			FileReader f2 = new FileReader("c:\\javawork\\Sample.txt");
			BufferedReader b1 = new BufferedReader(f1);
			BufferedReader b2 = new BufferedReader(f2);

			System.out.println("Sample.txt檔案共有" + f.length() + "個位元組");
			while ((s = b1.readLine()) != null) {
				row++;
			}
			System.out.println("Sample.txt檔案共有" + row + "列資料");
			
			while ((i = b2.read()) != -1) {
//				System.out.print((char) i);
				count++;
			}
			System.out.println("Sample.txt檔案共有" + count + "個字元");

			b2.close();
			b1.close();
			f2.close();
			f1.close();

		} catch (IOException e) {

		}

	}
}
