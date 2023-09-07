package xxx;

import java.util.Scanner;

public class IDcheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入身分證字號:");
		String id = sc.next();
		
		String regex = "^[A-Za-z][12][0-9]{8}$";
//		String regex = "^[A-Za-z][12]\\d{8}$";
		
		if(id.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("OH...no good");
		}
		
	}

}
