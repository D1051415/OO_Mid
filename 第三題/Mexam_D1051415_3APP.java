// package 第三題;

import java.math.BigInteger;

public class Mexam_D1051415_3APP{
    public static void main(String[] args) 
    {
        BigInteger[] bi = new BigInteger[6];
		bi[0] = new BigInteger("121");     	// a
		bi[1] = new Mexam_D1051415_3class("FF");	// b
		bi[2] = new BigInteger("-28");		// c
		bi[3] = new Mexam_D1051415_3class("-1C");	// d
		bi[4] = new BigInteger("83");		// e
		bi[5] = new Mexam_D1051415_3class("2B");	// f
		


        //第一題 a+b+c+d+e+f
		//TODO: Add some code here for expression a+b+c+d+e+f & output the restult
		BigInteger exp1Integer = new BigInteger("0");
		Mexam_D1051415_3class exp1HexInteger = new Mexam_D1051415_3class("0");	
		for(int i = 0; i < bi.length; i++)
        {
			//TODO: Add some code here 
            exp1Integer = exp1Integer.add(bi[i]);////Big10 add
            exp1HexInteger = exp1HexInteger.add10(bi[i]);//Big10 to 16 add
            // System.out.println(exp1Integer);
            // System.out.println(exp1HexInteger);
		}
		


        //第二題 b-c+d+e-f+a
		//TODO: Add some code here for expression b-c+d+e-f+a & output the restult
		BigInteger exp2Integer = new BigInteger("0");		  
		Mexam_D1051415_3class exp2HexInteger = new Mexam_D1051415_3class("0");	
        //TODO: Add some code here 

        //Big10 add~
        BigInteger plus = new BigInteger("0");//new 一個空的BigInteger來加被加的數
        BigInteger unplus = new BigInteger("0");//new 一個空的BigInteger來加被減的數
        plus = plus.add(bi[0]);//被加的加起來
        plus = plus.add(bi[1]);
        plus = plus.add(bi[3]);
        plus = plus.add(bi[4]);

        unplus = unplus.add(bi[2]);//被減的加起來
        unplus = unplus.add(bi[5]);

        exp2Integer = exp2Integer.add(plus);//最後再用被加的
        exp2Integer = exp2Integer.subtract(unplus);//再減被減的
        // System.out.println(exp2Integer);


        //Big10 to 16 add~
		Mexam_D1051415_3class plus16 = new Mexam_D1051415_3class("0");//new 一個空的BigHexInteger來加被加的數
		Mexam_D1051415_3class unplus16 = new Mexam_D1051415_3class("0");//new 一個空的BigHexInteger來加被減的數
        plus16 = plus16.add10(bi[0]);//被加的加起來
        plus16 = plus16.add10(bi[1]);
        plus16 = plus16.add10(bi[3]);
        plus16 = plus16.add10(bi[4]);

        unplus16 = unplus16.add10(bi[2]);//被減的加起來
        unplus16 = unplus16.add10(bi[5]);

        exp2HexInteger = exp2HexInteger.add10(plus16);//最後先加被加的
        exp2HexInteger = exp2HexInteger.subtract10(unplus16);//再減被減的
        // System.out.println(exp2HexInteger);



        //第三題 (a*b+c*d)/e-f
        //Big10 ~
        BigInteger mul_1 = new BigInteger("0");//new 一個空的BigInteger來加乘、除數
        BigInteger mul_2 = new BigInteger("0");//new 一個空的BigInteger來加乘、除數
        //ab部分
        mul_1 = mul_1.add(bi[0]);
        mul_1 = mul_1.multiply(bi[1]);

        //cd部分
        mul_2 = mul_2.add(bi[2]);
        mul_2 = mul_2.multiply(bi[3]);

        //相加
        mul_1 = mul_1.add(mul_2);

        //ef部分
        mul_1 = mul_1.divide(bi[4]);
        mul_1 = mul_1.subtract(bi[5]);
        System.out.println(mul_1);


        //Big10 to 16 ~
        Mexam_D1051415_3class mul_3 = new Mexam_D1051415_3class("0");//new 一個空的BigHexInteger來加乘、除數
		Mexam_D1051415_3class mul_4 = new Mexam_D1051415_3class("0");//new 一個空的BigHexInteger來加乘、除數
        //ab部分
        mul_3 = mul_3.add10(bi[0]);
        mul_3 = mul_3.multiply10(bi[1]);

        //cd部分
        mul_4 = mul_4.add10(bi[2]);
        mul_4 = mul_4.multiply10(bi[3]);
        
        //相加
        mul_3 = mul_3.add10(mul_4);

        //ef部分
        mul_3 = mul_3.divide10(bi[4]);
        mul_3 = mul_3.subtract10(bi[5]);
        System.out.println(mul_3);


        //輸出結果
        System.out.println("The testing data as follows:");
        System.out.println("================================");
        System.out.println("a = 121 (BigInteger)");
        System.out.println("b = FF (BigHexInteger)");
        System.out.println("c = -28 (BigInteger)");
        System.out.println("d = -1C (BigHexInteger)");
        System.out.println("e = 83 (BigInteger)");
        System.out.println("f = 2B (BigHexInteger)\n\n");


        System.out.println("The output data as follows:");
        System.out.println("================================\n");

        //第一題 a+b+c+d+e+f
        System.out.print("a+b+c+d+e+f = " + exp1Integer + "(BigInteger) ");//Big10輸出
        System.out.println(exp1HexInteger.toString().toUpperCase() + "(BigHexInteger)\n");//Big16輸出

        //第二題 b-c+d+e-f+a
        System.out.print("b-c+d+e-f+a = " + exp2Integer + "(BigInteger) ");//Big10輸出
        System.out.println(exp2HexInteger.toString().toUpperCase() + "(BigHexInteger)\n");//Big16輸出

        //第三題 (a*b+c*d)/e-f
        System.out.print("(a*b+c*d)/e-f = " + mul_1 + "(BigInteger) ");//Big10輸出
        System.out.println(mul_3.toString().toUpperCase() + "(BigHexInteger)");//Big16輸出
    }
}