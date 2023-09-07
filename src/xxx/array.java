package xxx;

public class array {
	public static void main(String[] args) {
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 31);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=============");

		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][j] = (int) (Math.random() * 31);
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=============");

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
