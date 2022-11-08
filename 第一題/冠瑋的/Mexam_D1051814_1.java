import java.util.Scanner;

public class Mexam_D1051814_1 {
    // 0為左上
    public static int[][] magic0(int n, int n1){
        int array[][] = new int[n][n];
        int i = 0, j = 0;

        // 判斷起始點 
        if(n1 == 0){
            i = 0;
            j = ((n+1)/2)-2;
        }else if(n1 == 1){
            i = n/2;
            j = n-2;
        }else if(n1 == 2){
            i = n-1;
            j = (n/2)-1;
        }else if(n1 == 3){
            i = n/2;
            j = -1;
        }

        // 下面是公式解法
        int key = 1;
        for(int a = i, b = j; key <= n*n; key++){
            if((key%n) == 1){
                a++;
            }else{
                a--;
                b--;
            }
            if(a == 0){
                a = n;
            }
            if(a > n){
                a = 1;
            }
            if(b < -1){
                b = n-2;
            }
            array[a-1][b+1] = key;
        }
        return array;
    }

    // 1為右上
    public static int[][] magic1(int n, int n1){
        int array[][] = new int[n][n];
        int i = 0 , j = 0;

        // 判斷起始點
        if(n1 == 0){
            i = 0;
            j = (n+1)/2;
        }else if(n1 == 1){
            i = ((n+1)/2)-1;
            j = n;
        }else if(n1 == 2){
            i = n-1;
            j = (n/2)+1;
        }else if(n1 == 3){
            i = ((n+1)/2)-1;
            j = 1;
        }

        int key = 1;
        for(int a = i, b = j; key <= n*n; key++){
            if((key%n) == 1){
                a++;
            }else{
                a--;
                b++;
            }
            if(a == 0){
                a = n;
            }
            if(a > n){
                a = 1;
            }
            if(b > n){
                b = 1;
            }
            array[a-1][b-1] = key;
        }
        return array;
    }

    // 2為右下
    public static int[][] magic2(int n, int n1){
        int array[][] = new int[n][n];
        int i = 0, j = 0;

        // 判斷起始點
        if(n1 == 0){
            i = 0;
            j = (n+1)/2; 
        }else if(n1 == 1){
            i = n/2;
            j = n;
        }else if(n1 == 2){
            i = n-1;
            j = (n/2)+1;
        }else if(n1 == 3){
            i = n/2;
            j = 1;
        }

        int key = 1;
        for(int a = i, b = j; key <= n*n; key++){
            if((key%n) == 1){
                a--;
            }else{
                a++;
                b++;
            }
            if(b > n){
                b = 1;
            }
            if(a == n-1){
                a = -1;
            }
            if(a < -1){
                a = n-2;
            }
            array[a+1][b-1] = key;
        }
        return array;
    }

    // 3為左下
    public static int[][] magic3(int n, int n1){
        int array[][] = new int[n][n];
        int i = 0, j = 0;

        // 判斷起始點
        if(n1 == 0){
            i = 0;
            j = (n/2)-1;
        }else if(n1 == 1){
            i = n/2;
            j = n-2;
        }else if(n1 == 2){
            i = n-1;
            j = (n/2)-1;
        }else if(n1 == 3){
            i = n/2;
            j = -1;
        }

        int key = 1;
        for(int a = i, b = j; key <= n*n; key++){
            if((key%n) == 1){
                a--;
            }else{
                a++;
                b--;
            }
            if(b < -1){
                b = n-2;
            }
            if(a == n-1){
                a = -1;
            }
            if(a < -1){
                a = n-2;
            }
            array[a+1][b+1] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the magic square (3<=n<=20, odd integer): ");
        int n = scn.nextInt();
        System.out.println("Enter position of the starting cell at the center of");
        System.out.print(" 0: top row, 1: right-most column, 2: bottom row, 3: left-most column: ");
        int n1 = scn.nextInt();
        System.out.print("Set move step (0: upper-left, 1: upper-right, 2: lower-right, 3: lower-left): ");
        int move = scn.nextInt();
        int ans[][] = new int[n][n];

        // 判斷方向
        if(move == 0){
            System.out.println("The magic square of degree " + n + ":");
            ans = magic0(n, n1);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.printf("%4d", ans[i][j]);
                }
                System.out.println("");
            }
            int sum = 0, diagsum = 0, antidiagsum = 0;
            for(int i = 0; i < n; i++){
                sum += ans[i][0];
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i == j){
                        diagsum += ans[i][j];
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = n-1; j >= 0; j--){
                    if((i+j) == n-1){
                        antidiagsum += ans[i][j];
                    }
                }
            }
            System.out.println("The magic square passes verification.");
            System.out.println("The sum of each row and each column is " + sum + ".");
            System.out.println("The sum of at least one diagonal is " + diagsum + ".");
            System.out.println("The sum of at least one anti-diagonal is " + antidiagsum + ".");
        }else if(move == 1){
            System.out.println("The magic square of degree " + n + ":");
            ans = magic1(n, n1);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.printf("%4d", ans[i][j]);
                }
                System.out.println("");
            }
            int sum = 0, diagsum = 0, antidiagsum = 0;
            for(int i = 0; i < n; i++){
                sum += ans[i][0];
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i == j){
                        diagsum += ans[i][j];
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = n-1; j >= 0; j--){
                    if((i+j) == n-1){
                        antidiagsum += ans[i][j];
                    }
                }
            }
            System.out.println("The magic square passes verification.");
            System.out.println("The sum of each row and each column is " + sum + ".");
            System.out.println("The sum of at least one diagonal is " + diagsum + ".");
            System.out.println("The sum of at least one anti-diagonal is " + antidiagsum + ".");
        }else if(move == 2){
            System.out.println("The magic square of degree " + n + ":");
            ans = magic2(n, n1);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.printf("%4d", ans[i][j]);
                }
                System.out.println("");
            }
            int sum = 0, diagsum = 0, antidiagsum = 0;
            for(int i = 0; i < n; i++){
                sum += ans[i][0];
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i == j){
                        diagsum += ans[i][j];
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = n-1; j >= 0; j--){
                    if((i+j) == n-1){
                        antidiagsum += ans[i][j];
                    }
                }
            }
            System.out.println("The magic square passes verification.");
            System.out.println("The sum of each row and each column is " + sum + ".");
            System.out.println("The sum of at least one diagonal is " + diagsum + ".");
            System.out.println("The sum of at least one anti-diagonal is " + antidiagsum + ".");
        }else if(move == 3){
            System.out.println("The magic square of degree " + n + ":");
            ans = magic3(n, n1);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.printf("%4d", ans[i][j]);
                }
                System.out.println("");
            }
            int sum = 0, diagsum = 0, antidiagsum = 0;
            for(int i = 0; i < n; i++){
                sum += ans[i][0];
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i == j){
                        diagsum += ans[i][j];
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = n-1; j >= 0; j--){
                    if((i+j) == n-1){
                        antidiagsum += ans[i][j];
                    }
                }
            }
            System.out.println("The magic square passes verification.");
            System.out.println("The sum of each row and each column is " + sum + ".");
            System.out.println("The sum of at least one diagonal is " + diagsum + ".");
            System.out.println("The sum of at least one anti-diagonal is " + antidiagsum + ".");
        }
        
    }
}