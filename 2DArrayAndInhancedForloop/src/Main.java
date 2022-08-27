
public class Main {

	public static void main(String[] args) {
		int p[][] = { { 4, 5, 6, 7

				}, { 8, 9, 0, 1 }, { 1, 2, 3, 4 } };
		for (int[] i : p) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}
