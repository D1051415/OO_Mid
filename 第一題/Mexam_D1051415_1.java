import java.util.Scanner;

public class Mexam_D1051415_1 {

	public static void main(String[] args) 
    {
		int[][] square; // Two dimensional square matrix.
		Scanner in = new Scanner(System.in); // Initial an input stream.
		int n = 3; // Scale of the magic square, an odd number such that 3<=n<20.
		int start = 0; // Starting cell, at the center of 0: top row, 1: right-most column, 2: bottom row, 3: left-most column.		
		int move = 0; // Move step, 0: upper-left, 1: upper-right, 2: lower-right, 3: lower-left.
		int value = 1; // The first value to be filled to the magic square is 1. 
		int row = 0, col = 0; // Row and column indexes. Initial to be the cell on the top-left corner.
		int total; // Total value, (1+n^2)n/2, of each row, each column, the diagonal, and the anti-diagonal.
		int sum = 0; // To compute row of rows, columns, the diagonal, and the anti-diagonal.
		int i, j; // Loop variables. 

        int x = 0, y = 0, xi, yi;//記錄當下的位置(x、y)、和上一次的位置(xi、yi)
		  
		//TODO: Add some code here for input data
		do {
			System.out.print("Enter the size of the magic square (3<=n<20, odd integer): ");
            n = in.nextInt();
			//......
            //輸入給定陣列大小
            square = new int [n][n];
            total = (1 + n * n) * n / 2;
		} while (n<3 | n>20 | n%2 == 0); // 3<=n<20 and n is odd; otherwise, repeat the input.
        
		// Set the starting cell, at the center of 0: top row, 1: right-most column, 2: bottom row, 3: left-most column.
		do {
			System.out.println("Enter position of the starting cell at the center of");
			System.out.print("  0: top row, 1: right-most column, 2: bottom row, 3: left-most column: ");
            start = in.nextInt();
			//......
            //輸入判斷起始位置 並先set起始點為1
            if(start == 0)
            {
                square[0][n/2] = 1;
                x = 0;
                y = n/2;
            }
            if(start == 1)
            {
                square[n/2][n-1] = 1;
                x = n/2;
                y = n-1;
            }
            if(start == 2)
            {
                square[n-1][n/2] = 1;
                x = n-1;
                y = n/2;
            }
            if(start == 3)
            {
                square[n/2][0] = 1;
                x = n/2;
                y = 0;
            }
		} while (start<0 | start>3); // If start is invalid, repeat the input.

        
		// Set the move step, 0: upper-left, 1: upper-right, 2: lower-right, 3: lower-left.
		do {
			System.out.print("Set move step (0: upper-left, 1: upper-right, 2: lower-right, 3: lower-left): ");
            move = in.nextInt();
			//......
		} while (move<0 | move >3); // If move is invalid, repeat the input.

        //計算最終數字
        double put = Math.pow(n, 2);
        int fin = (int)put;

        /*
         * 以下開始判斷move應該往哪個方向
         * 並判斷是否超出陣列
         * 若超出就用將位置%n + 1
         * 然後直到最後一個位置
         */
        for(i = 2; i <= fin; i++)
        {
            if(move == 0)
            {
                xi = x;
                yi = y;
                x -= 1;
                y -= 1;

                if(x < 0 && y >= 0)
                {
                    x = n - 1;
                    if(square[x][y] != 0)
                    {
                        square[xi+1][yi] = i;
                        x = xi+1;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else if(y < 0 && x >= 0)
                {
                    y = n - 1;
                    if(square[x][y] != 0)
                    {
                        square[0][yi] = i;
                        x = 0;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else if(y < 0 && x < 0)
                {
                    x = n - 1;
                    y = n - 1;

                    if(square[x][y] != 0)
                    {
                        square[xi+1][yi] = i;
                        x = xi+1;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else
                {
                    if(square[x][y] != 0)
                    {
                        square[(xi+1)%n][yi] = i;
                        x = (xi+1)%n;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }
            }
            else if(move == 1)
            {
                xi = x;
                yi = y;
                x -= 1;
                y += 1;

                if(x < 0 && y < n)
                {
                    x = n - 1;
                    if(square[x][y] != 0)
                    {
                        square[xi+1][yi] = i;
                        x = xi+1;
                        y = yi;  
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else if(y >= n && x >= 0)
                {
                    y = 0;
                    if(square[x][y] != 0)
                    {
                        square[(xi+1)%n][yi] = i;
                        x = (xi+1)%n;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else if(y >= n  && x < 0)
                {
                    x = n - 1;
                    y = 0;

                    if(square[x][y] != 0)
                    {
                        square[xi+1][yi] = i;
                        x = xi+1;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else
                {
                    if(square[x][y] != 0)
                    {
                        square[(xi+1)%n][yi] = i;
                        x = (xi+1)%n;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }
            }
            else if(move == 2)
            {
                xi = x;
                yi = y;
                x += 1;
                y += 1;

                if(x >= n && y < n)
                {
                    x = 0;
                    if(square[x][y] != 0)
                    {
                        square[xi-1][yi] = i;
                        x = xi-1;
                        y = yi;  
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else if(y >= n && x < n)
                {
                    y = 0;
                    if(square[x][y] != 0)
                    {
                        square[n-1][yi] = i;
                        x = n-1;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else if(y >= n  && x >= n)
                {
                    x = 0;
                    y = 0;

                    if(square[x][y] != 0)
                    {
                        square[xi-1][yi] = i;
                        x = xi-1;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else
                {
                    if(square[x][y] != 0)
                    {
                        square[(xi-1+n)%n][yi] = i;
                        x = (xi-1+n)%n;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }
            }
            else if(move == 3)
            {
                xi = x;
                yi = y;
                x += 1;
                y -= 1;

                if(x >= n && y >= 0)
                {
                    x = 0;
                    if(square[x][y] != 0)
                    {
                        square[xi-1][yi] = i;
                        x = xi-1;
                        y = yi;  
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else if(y < 0 && x < n)
                {
                    y = n - 1;
                    if(square[x][y] != 0)
                    {
                        square[n-1][yi] = i;
                        x = n-1;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else if(y < 0  && x >= n)
                {
                    x = 0;
                    y = n-1;

                    if(square[x][y] != 0)
                    {
                        square[xi-1][yi] = i;
                        x = xi-1;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }

                else
                {
                    if(square[x][y] != 0)
                    {
                        square[(xi-1+n)%n][yi] = i;
                        x = (xi-1+n)%n;
                        y = yi;
                    }
                    else
                    {
                        square[x][y] = i;
                    }
                }
            }
        }
		
		// ToDo: Print the magic square.
		System.out.printf("The magic square of degree %d:\n", n); // Heading message.
		for (i=0; i<n; i++) 
        { // Output n rows.
	        System.out.print("      "); // Leave 6 blanks on the left-hand-side.
			for (j=0; j<n; j++) 
            { // output n columns.
				System.out.printf("%4d", square[i][j]); // Print the value of a cell, 4-digit format.			
			}
			System.out.print("\n");
		}
		
        /*
         * 判斷每一行
         * 每一列是否符合規定
         * 和兩條對角線是否符合規定
         * 
         * 行、列總和
         * 如果到最後一個判斷的都一樣就flag++(判斷用)
         */

        //符合規定的話就print出來
		// ToDo: Start to verify magic square.
		// Verify all rows.
		// Verify all columns.	
		// Verify diagonals. 
		// Verify anti-diagonals.	
		// If all verification pass.
        int flag = 0;
        for(i = 0; i < n; i++)
        {
            row = 0;
            for(j = 0; j < n; j++)
            {
                row += square[i][j];
            }

            if(row != total)
            {
                break;
            }

            if(i == n-1 && j == n)
            {
                if(total == row)
                {
                    flag++;
                    value = total;
                }
            }
        }

        for(i = 0; i < n; i++)
        {
            col = 0;
            for(j = 0; j < n; j++)
            {
                col += square[i][j];
            }

            if(col != total)
            {
                break;
            }

            if(i == n-1 && j == n)
            {
                if(total == col)
                {
                    flag++;
                    value = total;
                }
            }
        }
		if (flag == 2) System.out.println("\nThe magic square passes verification.");
        if (row > 0) System.out.printf("The row of each row and each column is %d.\n", value);
        

        flag = 0;
        for(i = 0; i < n; i++)
        {
            sum = 0;
            for(j = 0; j < n; j++)
            {
                sum += square[j][Math.abs(j - n - i)%n];
            }
            if(sum == row)
            {
                flag++;
                break;
            }
        }
        if (flag > 0) System.out.printf("The row of at least one diaginal is %d.\n", sum);
        
        flag = 0;
        for(i = 0; i < n; i++)
        {
            sum = 0;
            for(j = 0; j < n; j++)
            {
                sum += square[j][Math.abs(j + n + i )%n];
            }
            if(sum == row)
            {
                flag++;
                break;
            }
        }
        if (flag > 0) System.out.printf("The row of at least one anti-diaginal is %d.\n", sum);
		
		in.close();
	}
}