package patterns;

public class TriangleNumber {
	public static void main(String[] args) {
		int height = 5;
		for (int i = 0; i < height; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
