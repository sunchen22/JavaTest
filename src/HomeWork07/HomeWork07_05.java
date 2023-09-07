package HomeWork07;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HomeWork07_05 {
//	承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//			型簡化本題的程式設計)

	public static void main(String[] args) {

		try {
			File f1 = new File("C:\\data\\Object.ser");
			FileInputStream fis = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(f1.getName() + "檔案內容如下: ");
			System.out.println("==================");
			try {
				while (true) {
					((speak) ois.readObject()).speak();
				}
			} catch (EOFException e) {
				System.out.println("資料讀取完畢！");
			}
			ois.close();
			fis.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
