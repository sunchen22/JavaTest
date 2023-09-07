package HomeWork08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork08_02 {
	public static void main(String[] args) {

		train[] t = new train[7];
		t[0] = new train(202, "普悠瑪", "樹林", "花蓮", 400);
		t[1] = new train(1254, "區間", "屏東", "基隆", 700);
		t[2] = new train(118, "自強", "高雄", "台北", 500);
		t[3] = new train(1288, "區間", "新竹", "基隆", 400);
		t[4] = new train(122, "自強", "台中", "花蓮", 600);
		t[5] = new train(1222, "區間", "樹林", "七堵", 300);
		t[6] = new train(1254, "區間", "屏東", "基隆", 700);

		System.out.println("=======第一題========");
//		請寫一隻程式，能印出不重複的Train物件
		Set<train> set = new HashSet<train>();
		for (int i = 0; i < t.length; i++) {
			set.add(t[i]);
		}

		System.out.println("-------iterator()-------");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(((train) it.next()).info());
		}

		System.out.println("-------增強功能 for 迴圈-------");
		for (train objs : set) {
			System.out.println(objs.info());
		}

		System.out.println("=======第二題========");
//		請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		List<train> list = new ArrayList<train>();

//		for (int i = 0; i < t.length; i++) {
//			list.add(t[i]);
//		}
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		System.out.println("-------for 迴圈-------");
		Arrays.sort(t);
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i].info());
		}
		
		System.out.println("-------iterator()-------");
		Collections.sort(list);
		Iterator it3 = list.iterator();
		while(it3.hasNext()) {
			System.out.println(((train)it3.next()).info());
		}
		System.out.println("-------增強功能 for 迴圈-------");
		for(train tobj : list) {
			System.out.println(tobj.info());
		}

		System.out.println("=======第三題========");
//		承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件

		Set<train> tset = new TreeSet<train>();
		for (int i = 0; i < t.length; i++) {
			tset.add(t[i]);
		}

		System.out.println("-------iterator()-------");
		Iterator it2 = tset.iterator();
		while (it2.hasNext()) {
			System.out.println(((train) it2.next()).info());
		}

		System.out.println("-------增強功能 for 迴圈-------");
		for (train objs2 : tset) {
			System.out.println(objs2.info());
		}

	}

}
