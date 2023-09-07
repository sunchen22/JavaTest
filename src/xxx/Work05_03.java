package xxx;

public class Work05_03 {
	public void maxElement() {
	}

	public int maxElement(int[][] arr) {
		int tep = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (tep < arr[i][j]) {
					tep = arr[i][j];
				}
			}
		}
		return tep;
	}
	
	public double maxElement(double[][] arr) {
		double tep = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (tep < arr[i][j]) {
					tep = arr[i][j];
				}
			}
		}
		return tep;
	}
	
}
