package xxx;

public class array2 {
	public static void main(String[] args) {
		int[][] x = array2();
		int[][] y = array2();
		int[][] z = new int[3][3];

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static int[][] array2() {
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = (int) (Math.random() * 31);
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}System.out.println("=====================");
		return data;
	}

}
