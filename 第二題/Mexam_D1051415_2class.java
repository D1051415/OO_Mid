import java.util.Random; // Package for random number generator.

public class Mexam_D1051415_2class 
{
    private int[][] A;
    private int[][] B;
    private int[][] C;
    private int ra;
    private int sa;
    private int rb;
    private int sb;
    private int n;

    //丟進來的數值要有相對接收的陣列、參數
    Mexam_D1051415_2class(int matrixa[][], int matrixb[][], int matrixc[][], int raa, int saa, int rbb, int sbb, int nn) 
    {
        setA(matrixa);
        setB(matrixb);
        setC(matrixc);
        setRa(raa);
        setSa(saa);
        setRb(rbb);
        setSb(sbb);
        setN(nn);
    }

    //set進去
    public void setA(int matrixa[][]) 
    {
        A = matrixa;
    }

    public void setB(int matrixb[][]) 
    {
        B = matrixb;
    }

    public void setC(int matrixc[][]) 
    {
        C = matrixc;
    }

    public void setRa(int raa) 
    {
        ra = raa;
    }
    public void setSa(int saa) 
    {
        sa = saa;
    }
    public void setRb(int rbb) 
    {
        rb = rbb;
    }
    public void setSb(int sbb) 
    {
        sb = sbb;
    }
    public void setN(int nn)
    {
        n = nn;
    }

    int x, y;

    //A的亂數矩陣產生
    public int[][] getA(){
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(i == j || i <= j + ra)//先處理下帶寬，判斷非下帶寬的地方就不產生亂書
                {
                    int r = 0;
                    Random rn = new Random();
                    r = rn.nextInt(50 + 50) - 50;
                    A[i][j] = r;
                }
                else//非下帶寬的地方給100(為了方便判斷非帶寬的位置，因為亂數介於50~-50)
                {
                    A[i][j] = 100;
                }
            }
        }
        for (int i = 0; i < n; i++) //第二步
        {
            for (int j = 0; j < n; j++) 
            {
                if(i == j)
                {
                    for(int k = i; k+sa+1 < n; k++)//判斷非上帶寬的地方就設值100(因為亂數介於50~-50)
                    {
                        A[i][k+sa+1] = 100;
                    }
                }
            }
        }
        return A;
    }
    public int[][] getB(){
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(i == j || i <= j + rb)//先處理下帶寬，判斷非下帶寬的地方就不產生亂書
                {
                    int r = 0;
                    Random rn = new Random();
                    r = rn.nextInt(50 + 50) - 50;
                    B[i][j] = r;
                }
                else//非下帶寬的地方給100(為了方便判斷非帶寬的位置，因為亂數介於50~-50)
                {
                    B[i][j] = 100;
                }
            }
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(i == j)
                {
                    for(int k = i; k+sb+1 < n; k++)//判斷非上帶寬的地方就設值100(因為亂數介於50~-50)
                    {
                        B[i][k+sb+1] = 100;
                    }
                }
            }
        }
        return B;
    }

    public int[][] getC(){
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < n; k++) 
                {
                    if(A[i][k] != 100 && B[k][j] != 100)//判斷如果有一邊的矩陣位置是100，就不相乘
                    {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }
        return C;
    }
}
