package code.test;

public class ArrayTest {

	private static boolean excuteSearch(int x[][], int y[][], int i, int j) {
		boolean b = true;
		for (int k = i; k < y.length; k++) {
			for (int n = j; n < y[k].length; n++) {
				if (y[k - i][n - j] != x[k][n]) {
					System.out.println("c");
					b = false;
					break;
				}
			}
		}
		return b;

	}

	static boolean searchPattern() {
		int[][] array = { { 1, 2, 3, 4, 5, 6, 7, 8, 7, 0 }, { 0, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 } };

		int array_row = array.length;
		int array_column = array[0].length;
		int[][] grid = { { 8, 7, 6, 5, 4, 3 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };

		// if(array[c][r]==grid[0][0] && r<boundry) {

		for (int c = 0; c < array_row; c++) {
			for (int r = 0; r < array_column; r++) {
				if (array[c][r] == grid[0][0]) {
					if (ArrayTest.excuteSearch(array, grid, c, r))
						return true;
				}

			}

		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(ArrayTest.searchPattern());
	}

}
