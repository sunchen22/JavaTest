package HomeWork07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HomeWork07_04 {
//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main(String[] args) {
		try {
			File f = new File("C:\\data\\");
			f.mkdir();

//			建立檔案
			File f1 = new File(f, "Object.ser");

//			建立物件
			Dog[] dobj = new Dog[2];
			dobj[0] = new Dog("doooog1");
			dobj[1] = new Dog("doooog2");

			Cat[] cobj = new Cat[2];
			cobj[0] = new Cat("caaaat1");
			cobj[1] = new Cat("caaaat2");

//			輸出
			FileOutputStream fos = new FileOutputStream(f1);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (int i = 0; i < dobj.length; i++) {
				oos.writeObject(dobj[i]);
			}
			for (int i = 0; i < cobj.length; i++) {
				oos.writeObject(cobj[i]);
			}

			oos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
