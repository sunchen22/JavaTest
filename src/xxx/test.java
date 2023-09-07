package xxx;

public class test {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//int 和char可互通
//		int aaa = 'A';
//		System.out.println(aaa);
//		int sum = 0;
//		sum += aaa;
//		System.out.println(sum);
//
//		char bbb = 'B';
//		System.out.println(bbb);
		
		
		int a = 8 ;
		int sum = 6 ;
		sum =+ a * 2 ;
		System.out.println(sum);
		System.out.println(a);
		
		char d='A';
		System.out.println(d+1);	
		System.out.println(1+d);
		

		boolean t = true;
		System.out.println(t+"1");			
		System.out.println("1"+t);	
		
	}
}
