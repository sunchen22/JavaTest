package Cube;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RanNum {
	public static void main(String[] args) {
		Set set = new HashSet();
		while (set.size() != 6) {
			set.add((int) (Math.random() * 49) + 1);
		}
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
