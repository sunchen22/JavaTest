package xxx;

public class Jeff {
	public static void main(String[] args) {
//		 班上有8位同學，他們進行了6次考試結果如下：
//		 請算出每位同學考最高分的次數
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] highScore = new int[8];

		for (int i = 0; i < test.length; i++) {
			int temp = 0;
			for (int j = 0; j < test[i].length; j++) {
				if (test[i][temp] < test[i][j]) {
					temp = j;
				}
			}
			highScore[temp]++;
		}

		for (int i = 0; i < highScore.length; i++) {
			System.out.println("第" + (i + 1) + "位同學共得了" + highScore[i] + "次最高分!");
		}
	}
}
