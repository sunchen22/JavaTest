package xxx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomNum {
	public static void main(String[] args) {
		Set set = new HashSet();

		RandomNum r = new RandomNum();

//		自己寫的...也太迂迴!!
//		for (int i = 1; i <= 6; i++) {
//			set.add(r.randomnum());
//			while (i == 6 && set.size() < 6) {
//				set.add(r.randomnum());
//			}
//		}
		
		while(set.size() != 6) {
			set.add(r.randomnum());
		}
		
//		System.out.print("toString()=" + set);
		
		//用迭代器取值
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public int randomnum() {
		return (int) (Math.random() * 49) + 1;
	}

}
