package xxx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class classmate {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		for (Object o : list)
			System.out.println(o);
		System.out.println("------------------------------------------");
		int i = 0;
		while (i < list.size()) {
			if (!(list.get(i) instanceof Number)) {
				list.remove(list.get(i));
			} else
				i++;
		}
		for (Object o : list)
			System.out.println(o);

	}

}
