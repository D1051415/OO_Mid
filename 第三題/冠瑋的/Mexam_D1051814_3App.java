import java.math.BigInteger;

public class Mexam_D1051814_3App {
    public static void main(String[] args) {
        BigInteger[] bi = new BigInteger[6];
        bi[0] = new BigInteger("121");     	// a
		bi[1] = new Mexam_D1051814_3class("FF");	// b
		bi[2] = new BigInteger("-28");		// c
		bi[3] = new Mexam_D1051814_3class("-1C");	// d
		bi[4] = new BigInteger("83");		// e
		bi[5] = new Mexam_D1051814_3class("2B");	// f

        Mexam_D1051814_3class bighexint_1 = new Mexam_D1051814_3class("0");
        BigInteger bigint_1 = new BigInteger("0");

        for(int i = 0; i < bi.length; i++){
            bigint_1 = bigint_1.add(bi[i]);
            bighexint_1 = bighexint_1.add(bi[i]);
        }

        Mexam_D1051814_3class bighexint_2 = new Mexam_D1051814_3class("0");
        BigInteger bigint_2 = new BigInteger("0");

        bigint_2 = bigint_2.add(bi[0]).add(bi[1]).add(bi[3]).add(bi[4]).subtract(bi[2]).subtract(bi[5]);
        bighexint_2 = bighexint_2.add(bi[0]).add(bi[1]).add(bi[3]).add(bi[4]).subtract(bi[2]).subtract(bi[5]);

        Mexam_D1051814_3class bighexint_3 = new Mexam_D1051814_3class("1");
        BigInteger bigint_3 = new BigInteger("1");

        for(int i = 0; i < bi.length; i++){
            bigint_3 = bigint_3.multiply(bi[i]);
            bighexint_3 = bighexint_3.multiply(bi[i]);
        }

        System.out.println("The testing data as follows:");
        System.out.println("========================================");
        System.out.println("a = 121 (BigInteger)");
        System.out.println("b = FF (BigHexInteger)");
        System.out.println("c = -28 (BigInteger)");
        System.out.println("d = -1C (BigHexInteger)");
        System.out.println("e = 83 (BigInteger)");
        System.out.println("f = 2B (BigHexInteger)");
        System.out.println("\n");
        System.out.println("The output data as follows:");
        System.out.println("========================================");
        System.out.println("");
        System.out.println("a+b+c+d+e+f = " + bigint_1.toString().toUpperCase() + "(BigInteger) " + bighexint_1.toString().toUpperCase() + "(BigHexInteger)");
        System.out.println("");
        System.out.println("b-c+d+e-f+a = " + bigint_2.toString().toUpperCase() + "(BigInteger) " + bighexint_2.toString().toUpperCase() + "(BigHexInteger)");
        System.out.println("");
        System.out.println("a*b*c*d*e*f = " + bigint_3.toString().toUpperCase() + "(BigInteger) " + bighexint_3.toString().toUpperCase() + "(BigHexInteger)");
    }
}
