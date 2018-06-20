//解题思路：使用hashset对每行、每列、每个单独数独块的元素进行验重。

class Solution {
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> bag = new HashSet<Character>();
		int x = 0, y = 0;
		for (y = 0; y < 9; y++) {
			for (x = 0; x < 9; x++) {

				if ('.'!=board[y][x]) {
					boolean judge = bag.add(board[y][x]);
					if (!judge) {
						return false;
					}
				}

			}
			bag.clear();

		}
		for (y = 0; y < 9; y++) {
			for (x = 0; x < 9; x++) {

				if ('.'!=board[x][y]) {
					boolean judge = bag.add(board[x][y]);
					if (!judge) {
						return false;
					}
				}

			}
			bag.clear();
		}
		for (x = 0; x < 9; x += 3) {
			for (y = 0; y < 9; y += 3) {
				for (int m = 0; m < 3; m++) {
					for (int n = 0; n < 3; n++) {
						if ('.'!=board[x + m][y + n]) {
							boolean judge = bag.add(board[x + m][y + n]);
							if (!judge) {
								System.out.println((x + m)+":"+(y + n));
								return false;
								
							}
						}

					}

				}

				bag.clear();
			}

		}
		return true;
	}
}