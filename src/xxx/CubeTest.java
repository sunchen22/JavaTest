package xxx;

public class CubeTest {
	public static void main(String[] args) {
		Cube c = new Cube();
		try {
			c.setlength(-10);
			System.out.println(c.getVolume());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
