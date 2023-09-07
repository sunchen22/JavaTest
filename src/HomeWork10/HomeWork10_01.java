package HomeWork10;

public class HomeWork10_01 {
//	請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
//	為質數 (提示：Math類別)

	public static void main(String[] args) {
		int[] x = new int[5];
		for (int i = 0; i < 5; i++) {
			x[i] = (int) (Math.random() * 100) + 1;
			System.out.print(x[i] + " ");
		}

		System.out.println();
		System.out.println("========");
		for (int i = 0; i < x.length; i++) {
			if(isPrime(x[i]) == true){
				System.out.println("質數的有:"+x[i]);
			}
		}
	}

	public static boolean isPrime(int x) {
		if(x == 1) {
			return false;
		}else if (x == 2 || x == 3) {
			return true;
		}
		
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
