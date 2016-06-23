
public class QueenHillClimbing {
	public static void main(String[] args) {

		int[][] board = new int[8][8];

		// Filling the board
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[i].length; j++)
				board[i][j] = 0;

		// Randomly placing queens
		for (int j = 0; j < board.length; j++) 
			board[(int) (Math.random() * 7)][j] = 1;
		
		int whileLoop = 0;
	while(true ){	
		
		whileLoop++;
		
		/*for(int i = 0;i<board.length;i++){
			for(int j=0;j<board.length;j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
		System.out.println("Done");
		*/
		// CODE FOR THE FIRST QUEEN
		
		boolean collisions = true;
		while (collisions) {

			// Checking the first queen
			int i = 0;
			int j = 0;
			// Finding the location of the first queen
			for (i = 0; i < board[0].length; i++)
				if (board[i][0] == 1)
					break;

			boolean stillChecking = true;
			int iTempDU = i, jTempDU = j, iTempDD = i, jTempDD = j, iTempH = i, jTempH = j;
			int totalCollisions = 0;
			while (stillChecking) {

				// Diagonal up
				if (iTempDU - 1 >= 0 && jTempDU + 1 < board.length) {
					if (board[iTempDU - 1][jTempDU + 1] == 1)
						totalCollisions++;
					stillChecking = true;
				} else
					stillChecking = false;

				// Diagonal down
				if (iTempDD + 1 < board.length && jTempDD + 1 < board.length) {
					if (board[iTempDD + 1][jTempDD + 1] == 1)
						totalCollisions++;
					stillChecking = true;
				} else
					stillChecking = false;

				// Horizontal
				if (jTempH + 1 < board.length) {
					if (board[iTempH][jTempH + 1] == 1)
						totalCollisions++;
					stillChecking = true;
				} else
					stillChecking = false;

				iTempDU--;
				jTempDU++;
				iTempDD++;
				jTempDD++;
				iTempH = iTempH; // Just to keep track
				jTempH++;
			}

			if (totalCollisions > 0) {
				// Move the queen to top of column if we reached bottom
				if (i == 7) {
					board[i][j] = 0;
					board[0][j] = 1;
				} else {
					board[i][j] = 0;
					board[i+1][j] = 1;
				}
			}

			// CODE FOR THE SECOND QUEEN
						
			 collisions = true;
			while (collisions) {

				// Checking the second queen
				 i = 0;
				 j = 1;  // ---------- CHANGE THIS ----------
				// Finding the location of the second queen
				for (i = 0; i < board[0].length; i++)
					if (board[i][1] == 1) // ----- CHANGE THIS -----
						break;

				stillChecking = true;
				iTempDU = i;
				jTempDU = j;
				iTempDD = i;
				jTempDD = j;
				iTempH = i;
				jTempH = j;
				
				totalCollisions = 0;
				while (stillChecking) {

					// Diagonal up
					if (iTempDU - 1 >= 0 && jTempDU + 1 < board.length) {
						if (board[iTempDU - 1][jTempDU + 1] == 1)
							totalCollisions++;
						stillChecking = true;
					} else
						stillChecking = false;

					// Diagonal down
					if (iTempDD + 1 < board.length && jTempDD + 1 < board.length) {
						if (board[iTempDD + 1][jTempDD + 1] == 1)
							totalCollisions++;
						stillChecking = true;
					} else
						stillChecking = false;

					// Horizontal
					if (jTempH + 1 < board.length) {
						if (board[iTempH][jTempH + 1] == 1)
							totalCollisions++;
						stillChecking = true;
					} else
						stillChecking = false;

					iTempDU--;
					jTempDU++;
					iTempDD++;
					jTempDD++;
					iTempH = iTempH; // Just to keep track
					jTempH++;
				}

				if (totalCollisions > 0) {
					// Move the queen to top of column if we reached bottom
					if (i == 7) {
						board[i][j] = 0;
						board[0][j] = 1;
					} else {
						board[i][j] = 0;
						board[i+1][j] = 1;
					}
				}
				
				// CODE FOR THE third QUEEN
				
				 collisions = true;
				while (collisions) {

					// Checking the third queen
					 i = 0;
					 j = 2;  // ---------- CHANGE THIS ----------
					// Finding the location of the second queen
					for (i = 0; i < board[0].length; i++)
						if (board[i][2] == 1) // ----- CHANGE THIS -----
							break;

					stillChecking = true;
					iTempDU = i;
					jTempDU = j;
					iTempDD = i;
					jTempDD = j;
					iTempH = i;
					jTempH = j;
					
					totalCollisions = 0;
					while (stillChecking) {

						// Diagonal up
						if (iTempDU - 1 >= 0 && jTempDU + 1 < board.length) {
							if (board[iTempDU - 1][jTempDU + 1] == 1)
								totalCollisions++;
							stillChecking = true;
						} else
							stillChecking = false;

						// Diagonal down
						if (iTempDD + 1 < board.length && jTempDD + 1 < board.length) {
							if (board[iTempDD + 1][jTempDD + 1] == 1)
								totalCollisions++;
							stillChecking = true;
						} else
							stillChecking = false;

						// Horizontal
						if (jTempH + 1 < board.length) {
							if (board[iTempH][jTempH + 1] == 1)
								totalCollisions++;
							stillChecking = true;
						} else
							stillChecking = false;

						iTempDU--;
						jTempDU++;
						iTempDD++;
						jTempDD++;
						iTempH = iTempH; // Just to keep track
						jTempH++;
					}

					if (totalCollisions > 0) {
						// Move the queen to top of column if we reached bottom
						if (i == 7) {
							board[i][j] = 0;
							board[0][j] = 1;
						} else {
							board[i][j] = 0;
							board[i+1][j] = 1;
						}
					}
					
					// CODE FOR THE fourth QUEEN
					
					 collisions = true;
					while (collisions) {

						// Checking the fourth queen
						 i = 0;
						 j = 3;  // ---------- CHANGE THIS ----------
						// Finding the location of the fourth queen
						for (i = 0; i < board[0].length; i++)
							if (board[i][3] == 1) // ----- CHANGE THIS -----
								break;

						stillChecking = true;
						iTempDU = i;
						jTempDU = j;
						iTempDD = i;
						jTempDD = j;
						iTempH = i;
						jTempH = j;
						
						totalCollisions = 0;
						while (stillChecking) {

							// Diagonal up
							if (iTempDU - 1 >= 0 && jTempDU + 1 < board.length) {
								if (board[iTempDU - 1][jTempDU + 1] == 1)
									totalCollisions++;
								stillChecking = true;
							} else
								stillChecking = false;

							// Diagonal down
							if (iTempDD + 1 < board.length && jTempDD + 1 < board.length) {
								if (board[iTempDD + 1][jTempDD + 1] == 1)
									totalCollisions++;
								stillChecking = true;
							} else
								stillChecking = false;

							// Horizontal
							if (jTempH + 1 < board.length) {
								if (board[iTempH][jTempH + 1] == 1)
									totalCollisions++;
								stillChecking = true;
							} else
								stillChecking = false;

							iTempDU--;
							jTempDU++;
							iTempDD++;
							jTempDD++;
							iTempH = iTempH; // Just to keep track
							jTempH++;
						}

						if (totalCollisions > 0) {
							// Move the queen to top of column if we reached bottom
							if (i == 7) {
								board[i][j] = 0;
								board[0][j] = 1;
							} else {
								board[i][j] = 0;
								board[i+1][j] = 1;
							}
						}
						
						// CODE FOR THE fifth QUEEN
						
						 collisions = true;
						while (collisions) {

							// Checking the fifth queen
							 i = 0;
							 j = 4;  // ---------- CHANGE THIS ----------
							// Finding the location of the fifth queen
							for (i = 0; i < board[0].length; i++)
								if (board[i][4] == 1) // ----- CHANGE THIS -----
									break;

							stillChecking = true;
							iTempDU = i;
							jTempDU = j;
							iTempDD = i;
							jTempDD = j;
							iTempH = i;
							jTempH = j;
							
							totalCollisions = 0;
							while (stillChecking) {

								// Diagonal up
								if (iTempDU - 1 >= 0 && jTempDU + 1 < board.length) {
									if (board[iTempDU - 1][jTempDU + 1] == 1)
										totalCollisions++;
									stillChecking = true;
								} else
									stillChecking = false;

								// Diagonal down
								if (iTempDD + 1 < board.length && jTempDD + 1 < board.length) {
									if (board[iTempDD + 1][jTempDD + 1] == 1)
										totalCollisions++;
									stillChecking = true;
								} else
									stillChecking = false;

								// Horizontal
								if (jTempH + 1 < board.length) {
									if (board[iTempH][jTempH + 1] == 1)
										totalCollisions++;
									stillChecking = true;
								} else
									stillChecking = false;

								iTempDU--;
								jTempDU++;
								iTempDD++;
								jTempDD++;
								iTempH = iTempH; // Just to keep track
								jTempH++;
							}

							if (totalCollisions > 0) {
								// Move the queen to top of column if we reached bottom
								if (i == 7) {
									board[i][j] = 0;
									board[0][j] = 1;
								} else {
									board[i][j] = 0;
									board[i+1][j] = 1;
								}
							}
		}
	}

					// CODE FOR THE sixth QUEEN
					
					 collisions = true;
					while (collisions) {

						// Checking the sixth queen
						 i = 0;
						 j = 5;  // ---------- CHANGE THIS ----------
						// Finding the location of the sixth queen
						for (i = 0; i < board[0].length; i++)
							if (board[i][5] == 1) // ----- CHANGE THIS -----
								break;

						stillChecking = true;
						iTempDU = i;
						jTempDU = j;
						iTempDD = i;
						jTempDD = j;
						iTempH = i;
						jTempH = j;
						
						totalCollisions = 0;
						while (stillChecking) {

							// Diagonal up
							if (iTempDU - 1 >= 0 && jTempDU + 1 < board.length) {
								if (board[iTempDU - 1][jTempDU + 1] == 1)
									totalCollisions++;
								stillChecking = true;
							} else
								stillChecking = false;

							// Diagonal down
							if (iTempDD + 1 < board.length && jTempDD + 1 < board.length) {
								if (board[iTempDD + 1][jTempDD + 1] == 1)
									totalCollisions++;
								stillChecking = true;
							} else
								stillChecking = false;

							// Horizontal
							if (jTempH + 1 < board.length) {
								if (board[iTempH][jTempH + 1] == 1)
									totalCollisions++;
								stillChecking = true;
							} else
								stillChecking = false;

							iTempDU--;
							jTempDU++;
							iTempDD++;
							jTempDD++;
							iTempH = iTempH; // Just to keep track
							jTempH++;
						}

						if (totalCollisions > 0) {
							// Move the queen to top of column if we reached bottom
							if (i == 7) {
								board[i][j] = 0;
								board[0][j] = 1;
							} else {
								board[i][j] = 0;
								board[i+1][j] = 1;
							}
						}
	}
}
	
				
				
				
				
				
				
				
				
				
				// CODE FOR THE seventh QUEEN
				
				 collisions = true;
				while (collisions) {

					// Checking the seventh queen
					 i = 0;
					 j = 6;  // ---------- CHANGE THIS ----------
					// Finding the location of the seventh queen
					for (i = 0; i < board[0].length; i++)
						if (board[i][6] == 1) // ----- CHANGE THIS -----
							break;

					stillChecking = true;
					iTempDU = i;
					jTempDU = j;
					iTempDD = i;
					jTempDD = j;
					iTempH = i;
					jTempH = j;
					
					totalCollisions = 0;
					while (stillChecking) {

						// Diagonal up
						if (iTempDU - 1 >= 0 && jTempDU + 1 < board.length) {
							if (board[iTempDU - 1][jTempDU + 1] == 1)
								totalCollisions++;
							stillChecking = true;
						} else
							stillChecking = false;

						// Diagonal down
						if (iTempDD + 1 < board.length && jTempDD + 1 < board.length) {
							if (board[iTempDD + 1][jTempDD + 1] == 1)
								totalCollisions++;
							stillChecking = true;
						} else
							stillChecking = false;

						// Horizontal
						if (jTempH + 1 < board.length) {
							if (board[iTempH][jTempH + 1] == 1)
								totalCollisions++;
							stillChecking = true;
						} else
							stillChecking = false;

						iTempDU--;
						jTempDU++;
						iTempDD++;
						jTempDD++;
						iTempH = iTempH; // Just to keep track
						jTempH++;
					}

					if (totalCollisions > 0) {
						// Move the queen to top of column if we reached bottom
						if (i == 7) {
							board[i][j] = 0;
							board[0][j] = 1;
						} else {
							board[i][j] = 0;
							board[i+1][j] = 1;
						}
					}
}
				
				

				// CODE FOR THE eight QUEEN
				
				 collisions = true;
				while (collisions) {

					// Checking the eighth queen
					 i = 0;
					 j = 7;  // ---------- CHANGE THIS ----------
					// Finding the location of the eighth queen
					for (i = 0; i < board[0].length; i++)
						if (board[i][7] == 1) // ----- CHANGE THIS -----
							break;

					stillChecking = true;
					iTempDU = i;
					jTempDU = j;
					iTempDD = i;
					jTempDD = j;
					iTempH = i;
					jTempH = j;
					
					totalCollisions = 0;
					while (stillChecking) {

						// Diagonal up
						if (iTempDU - 1 >= 0 && jTempDU + 1 < board.length) {
							if (board[iTempDU - 1][jTempDU + 1] == 1)
								totalCollisions++;
							stillChecking = true;
						} else
							stillChecking = false;

						// Diagonal down
						if (iTempDD + 1 < board.length && jTempDD + 1 < board.length) {
							if (board[iTempDD + 1][jTempDD + 1] == 1)
								totalCollisions++;
							stillChecking = true;
						} else
							stillChecking = false;

						// Horizontal
						if (jTempH + 1 < board.length) {
							if (board[iTempH][jTempH + 1] == 1)
								totalCollisions++;
							stillChecking = true;
						} else
							stillChecking = false;

						iTempDU--;
						jTempDU++;
						iTempDD++;
						jTempDD++;
						iTempH = iTempH; // Just to keep track
						jTempH++;
					}

					if (totalCollisions > 0) {
						// Move the queen to top of column if we reached bottom
						if (i == 7) {
							board[i][j] = 0;
							board[0][j] = 1;
						} else {
							board[i][j] = 0;
							board[i+1][j] = 1;
						}
					}
}
				
			}
					
			}}

	}}
