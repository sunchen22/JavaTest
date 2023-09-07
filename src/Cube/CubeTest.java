package Cube;

public class CubeTest {
	public static void main(String[] args) {
		Cube cube = new Cube();
		try {
			cube.setlength(-10.0);
			System.out.println(cube.volume());
		} catch (CubeException e) {
			e.printStackTrace();
		}

	}

}
