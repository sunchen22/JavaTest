package HomeWork07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeWork07_03 {

//	請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案
	public static void main(String[] args) {
		File f1 = new File("c:\\javawork\\01.txt");
		File f2 = new File("c:\\javawork\\02.txt");
		
		HomeWork07_03 home = new HomeWork07_03();
		home.copyFile(f1, f2);

	}

	public void copyFile(File f1, File f2) {
		try {
			FileReader f3 = new FileReader(f1);
			BufferedReader f5 = new BufferedReader(f3);
			
			FileWriter f4 = new FileWriter(f2);
			BufferedWriter f6 = new BufferedWriter(f4);
			PrintWriter p = new PrintWriter(f6);

			String s;
			while ((s = f5.readLine()) != null) {
				p.println(s);
				System.out.print(s);
				System.out.flush();
			}
			p.close();
			f6.close();
			f4.close();
			f5.close();
			f3.close();

		} catch (IOException e) {
			e.getStackTrace();
		}

	}

}
