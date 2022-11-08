import java.util.Scanner; // Package for input stream.

public class Mexam_D1051415_2APP {

	public static void main(String[] args) {
		int[][] A; // Matrix A.
		int[][] B; // Matrix B.
		int[][] C; // Matrix C.
		int n; // Row size and Column size of square matrices A, b, and C.
		int ra, sa; // Lower bandwidth and upper bandwidth of matrix A.
		int rb, sb; // Lower bandwidth and upper bandwidth of matrix B.
		// Lower bandwidth and upper bandwidth of matrix C are ra+rb and sa+sb,
		// respectively.
		Scanner in = new Scanner(System.in); // Initial an input stream.
		// Random random = new Random(); // Initial a random number seed.
		int i, j; // Loop variables.

		//輸入n，並輸入想要的上、下帶寬

		//TODO: Add some code here for input data
		do {
			System.out.print("Enter integers n for square matrix size: ");
			n = in.nextInt(); // Row and column size of square matrices.
			System.out.print("Enter lower bandwidth and upper bandwidth of matrix A: ");
			ra = in.nextInt(); // Lower bandwidth matrix A.
			sa = in.nextInt(); // Upper bandwidth matrix A.
			System.out.print("Enter lower bandwidth and upper bandwidth of matrix B: ");
			rb = in.nextInt(); // Lower bandwidth matrix B.
			sb = in.nextInt(); // Upper bandwidth matrix B.
			A = new int[n][n];
			B = new int[n][n];
			C = new int[n][n];
		} while (n <= 0 | ra < 0 | sa < 0 & rb < 0 | sb < 0 | ra >= n | sa >= n | rb >= n | sb >= n);
		
		//	TODO: Add some code here & Complete the program.
		
		//將數值丟進去Class，產生亂數矩陣
		Mexam_D1051415_2class m = new Mexam_D1051415_2class(A, B, C, ra, sa, rb, sb, n);

		/*
		 * 因為非帶寬位置的值皆是100
		 * 因此判斷若是100就不print
		 * 因為亂數介於50~-50
		 * 所以不用擔心「帶寬位置」卻沒print出來
		 */
		System.out.println("Matrix A:");
        A = m.getA();
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                if(A[i][j] == 100)
				{
					System.out.printf("      ");
					
				}
				else
				{
					System.out.printf("%6d", A[i][j]);
				}
            }
            System.out.println("");
        }

		System.out.println("Matrix B:");
        B = m.getB();
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
				if(B[i][j] == 100)
				{
					System.out.printf("      ");
					
				}
				else
				{
					System.out.printf("%6d", B[i][j]);
				}
            }
            System.out.println("");
        }

		System.out.println("Matrix C:");
        C = m.getC();
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                if(C[i][j] == 0)
				{
					System.out.printf("      ");
					
				}
				else
				{
					System.out.printf("%6d", C[i][j]);
				}
            }
            System.out.println("");
        }

		in.close();
	}
}