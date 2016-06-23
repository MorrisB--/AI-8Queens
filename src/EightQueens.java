import java.util.Random;
//import java.util.Scanner;

public class EightQueens {

	public static void main(String[] args) {
		int board[][] = new int[8][8];
		int numberOfAttacks = 0;
		int bestRowIndex = 0;

		InitializeBoard(board);
		PlaceQueens(board);
		System.out.println("Initial Board: ");
		PrintBoard(board);
		numberOfAttacks = TotalNumberOfAttacks(board);
		System.out.println("Number of total attacks: " + numberOfAttacks + "\n");

		while (numberOfAttacks != 0) {
			int leastNumberOfAttacks = 28;

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					MoveQueen(board, j, i);
					numberOfAttacks = TotalNumberOfAttacks(board);
					if (numberOfAttacks < leastNumberOfAttacks) {
						leastNumberOfAttacks = numberOfAttacks;
						bestRowIndex = j;
					}
				}
				MoveQueen(board, bestRowIndex, i);
				PrintBoard(board);
				numberOfAttacks = TotalNumberOfAttacks(board);

				System.out.println("Moved the queen " + i + " to [" + bestRowIndex + "]");
				System.out.println("Number of total attacks: " + TotalNumberOfAttacks(board));

				// This will print all the solutions it can find add below to break once it finds a single solution
				
				/*
				 * if (numberOfAttacks == 0)
				 * 		break;
				 */
				
			}
		}

	}

	public static void MoveQueen(int[][] brd, int row, int column) {
		for (int i = 0; i < 8; i++) {
			brd[i][column] = 0;
		}
		brd[row][column] = 1;
	}

	public static int TotalNumberOfAttacks(int[][] brd) {
		return NumberOfDiagonalAttacks(brd) + NumberOfHorizontalAttacks(brd);
	}

	public static int NumberOfDiagonalAttacks(int[][] brd) {
		int diagonalAttacks = 0;
		int diagonalQueens = 0;

		int rows = brd.length;
		int cols = brd[0].length;

		for (int i = 0; i < rows; i++) {
			for (int r = i, c = 0; r >= 0 && c < cols; r--, c++) {
				if (brd[r][c] == 1)
					diagonalQueens++;
			}
			if (diagonalQueens > 0)
				diagonalAttacks += (diagonalQueens - 1) * diagonalQueens / 2;
			diagonalQueens = 0;
		}

		for (int i = 1; i < cols; i++) {
			for (int r = rows - 1, c = i; r >= 0 && c < cols; r--, c++) {
				if (brd[r][c] == 1)
					diagonalQueens++;
			}
			if (diagonalQueens > 0)
				diagonalAttacks += (diagonalQueens - 1) * diagonalQueens / 2;
			diagonalQueens = 0;
		}

		for (int i = rows - 1; i >= 0; i--) {
			for (int r = i, c = 0; r < rows && c < cols; r++, c++) {
				if (brd[r][c] == 1)
					diagonalQueens++;
			}
			if (diagonalQueens > 0)
				diagonalAttacks += (diagonalQueens - 1) * diagonalQueens / 2;
			diagonalQueens = 0;
		}

		for (int i = cols - 1; i >= 0; i--) {
			for (int r = 0, c = i; r < cols && c < cols; r++, c++) {
				if (brd[r][c] == 1)
					diagonalQueens++;
			}
			if (diagonalQueens > 0)
				diagonalAttacks += (diagonalQueens - 1) * diagonalQueens / 2;
			diagonalQueens = 0;
		}
		return diagonalAttacks;
	}

	public static int NumberOfHorizontalAttacks(int[][] brd) {
		int horizontalAttacks = 0;
		int horizontalQueens = 0;

		for (int i = 0; i < brd.length; i++) {
			for (int j = 0; j < brd[i].length; j++) {
				if (brd[i][j] == 1)
					horizontalQueens++;
			}
			horizontalAttacks += (horizontalQueens - 1) * horizontalQueens / 2;
			horizontalQueens = 0;
		}
		return horizontalAttacks;
	}

	public static void InitializeBoard(int[][] brd) {
		for (int i = 0; i < brd.length; i++) {
			for (int j = 0; j < brd[i].length; j++) {
				brd[i][j] = 0;
			}
		}
	}

	public static void PlaceQueens(int[][] brd) {
		Random rand = new Random();
		for (int i = 0; i < brd[0].length; i++) {
			brd[rand.nextInt(8)][i] = 1;
		}
	}

	public static void PrintBoard(int[][] brd) {
		for (int i = 0; i < brd.length; i++) {
			for (int j = 0; j < brd[i].length; j++) {
				System.out.print(brd[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
