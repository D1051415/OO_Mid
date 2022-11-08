import java.util.Scanner;

public class Mexam_skeleton_1 {

	public static void main(String[] args) {
		int[][] square; // Two dimensional square matrix.
		Scanner in = new Scanner(System.in); // Initial an input stream.
		int n = 3; // Scale of the magic square, an odd number such that 3<=n<20.
		int start = 0; // Starting cell, at the center of 0: top row, 1: right-most column, 2: bottom row, 3: left-most column.		
		int move = 0; // Move step, 0: upper-left, 1: upper-right, 2: lower-right, 3: lower-left.
		int value = 1; // The first value to be filled to the magic square is 1.
		int row = 0, col = 0; // Row and column indexes. Initial to be the cell on the top-left corner.
		int total; // Total value, (1+n^2)n/2, of each row, each column, the diagonal, and the anti-diagonal.
		int sum; // To compute sum of rows, columns, the diagonal, and the anti-diagonal.
		int i, j; // Loop variables. 
		  
		//TODO: Add some code here for input data
		do {
			System.out.print("Enter the size of the magic square (3<=n<20, odd integer): ");
			//......
		} while (n<3 | n >20 | n%2==0); // 3<=n<20 and n is odd; otherwise, repeat the input.
		  
		// Set the starting cell, at the center of 0: top row, 1: right-most column, 2: bottom row, 3: left-most column.
		do {
			System.out.println("Enter position of the starting cell at the center of");
			System.out.print("  0: top row, 1: right-most column, 2: bottom row, 3: left-most column: ");
			//......
		} while (start<0 | start>3); // If start is invalid, repeat the input.
		  
		// Set the move step, 0: upper-left, 1: upper-right, 2: lower-right, 3: lower-left.
		do {
			System.out.print("Set move step (0: upper-left, 1: upper-right, 2: lower-right, 3: lower-left): ");
			//......
		} while (move<0 | move >3); // If move is invalid, repeat the input.
		
		//TODO: Add some code here & complete the program.
		
		// ToDo: Print the magic square.
		System.out.printf("The magic square of degree %d:\n", n); // Heading message.
		for (i=0; i<n; i++) { // Output n rows.
	        System.out.print("      "); // Leave 6 blanks on the left-hand-side.
			for (j=0; j<n; j++) { // output n columns.
				System.out.printf("%4d", square[i][j]); // Print the value of a cell, 4-digit format.			
			}
			System.out.print("\n");
		}
		
		// ToDo: Start to verify magic square.
		// Verify all rows.
		// Verify all columns.	
		// Verify diagonals. 
		// Verify anti-diagonals.	
		// If all verification pass.
		if (valid) System.out.println("\nThe magic square passes verification.");
		if (valid) System.out.printf("The sum of each row and each column is %d.\n", total);
		if (valid) System.out.printf("The sum of at least one diaginal is %d.\n", total);
		if (valid) System.out.printf("The sum of at least one anti-diaginal is %d.\n", total);
		
		in.close();
	}
}
