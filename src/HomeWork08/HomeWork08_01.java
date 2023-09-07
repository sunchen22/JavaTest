package HomeWork08;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HomeWork08_01 {
	public static void main(String[] args) {
//		請建立一個Collection物件並將以下資料加入：
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)

		Set set = new HashSet();
		set.add(new Integer(100));
		set.add(new Double(3.14));
		set.add(new Long(21L));
		set.add(new Short("100"));
		set.add(new Double(5.1));
		set.add("Kitty");
		set.add(new Integer(100));
		set.add(new Object());
		set.add("Snoopy");
		set.add(new BigInteger("1000"));

//		System.out.println("toString()=" + set);

//		第1題
//		• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//		第2題
//		• 移除不是java.lang.Number相關的物件

		Iterator it2 = set.iterator();
		while (it2.hasNext()) {
			if (!(it2.next() instanceof Number)) {
				it2.remove();
			}
		}

//		第3題
//		• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功

		System.out.println("===============");

		Iterator it3 = set.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
	}

}
