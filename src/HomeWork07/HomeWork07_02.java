package HomeWork07;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import javax.xml.crypto.Data;

public class HomeWork07_02 {
//	 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//			 append功能讓每次執行結果都能被保存起來)

	public static void main(String[] args) {
		try {
			// 用JAVA創檔案
//			boolean b = false;
//			File f = new File("Data.txt");
//			b = f.createNewFile();
//			System.out.println("File created: " + b);

			HomeWork07_02 home = new HomeWork07_02();
			int[] ar = new int[10];

			FileOutputStream f1 = new FileOutputStream("Data.txt", true);
			BufferedOutputStream bb = new BufferedOutputStream(f1);
			PrintStream p = new PrintStream(bb);
			
			p.println(home.array(ar));

			
			p.close();
			bb.close();
			f1.close();

		} catch (IOException e) {
			e.getStackTrace();
		}

	}

	public String array(int[] arr) {
		String st = "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1000) + 1;
			st += (arr[i]+" ");
		}
		return st;
	}

}
