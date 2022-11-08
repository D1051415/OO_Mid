// package 第三題;

import java.math.BigInteger;

public class Mexam_D1051415_3class extends BigInteger
{
    public Mexam_D1051415_3class(String val)//Convert to 16
    {
		// TODO: Add some code here
        super(val, 16);
	}

    public Mexam_D1051415_3class add16(Mexam_D1051415_3class val)//radix 16 add，因為val是16進制的，所以要super
    {
        // TODO: Add some code here
        Mexam_D1051415_3class m = new Mexam_D1051415_3class(super.add(val).toString(16));
        return m;
    }
    
    public Mexam_D1051415_3class add10(BigInteger val) //radix 10 add，因為val是10進制的，所以不用super
    {
        // TODO: Add some code here
        Mexam_D1051415_3class m = new Mexam_D1051415_3class(add(val).toString(16));
        return m;
    }
    
    public Mexam_D1051415_3class subtract16(Mexam_D1051415_3class val) //radix 16 subtract，因為val是16進制的，所以要super
    {
        // TODO: Add some code here
        Mexam_D1051415_3class m = new Mexam_D1051415_3class(super.subtract(val).toString(16));
        return m;
    }
    
    public Mexam_D1051415_3class subtract10(BigInteger val) //radix 10 subtract，因為val是10進制的，所以不用super
    {
        // TODO: Add some code here
        Mexam_D1051415_3class m = new Mexam_D1051415_3class(subtract(val).toString(16));
        return m;
    }

    public Mexam_D1051415_3class multiply16(Mexam_D1051415_3class val) //radix 16 multiply，因為val是16進制的，所以要super
    {
        // TODO: Add some code here
        Mexam_D1051415_3class m = new Mexam_D1051415_3class(multiply(val).toString(16));
        return m;
    }

    public Mexam_D1051415_3class multiply10(BigInteger val) //radix 10 multiply，因為val是10進制的，所以不用super
    {
        // TODO: Add some code here
        Mexam_D1051415_3class m = new Mexam_D1051415_3class(super.multiply(val).toString(16));
        return m;
    }

    public Mexam_D1051415_3class divide16(Mexam_D1051415_3class val) //radix 16 divide，因為val是16進制的，所以要super
    {
        // TODO: Add some code here
        Mexam_D1051415_3class m = new Mexam_D1051415_3class(divide(val).toString(16));
        return m;
    }
    
    public Mexam_D1051415_3class divide10(BigInteger val) //radix 10 divide，因為val是10進制的，所以不用super
    {
        // TODO: Add some code here
        Mexam_D1051415_3class m = new Mexam_D1051415_3class(super.divide(val).toString(16));
        return m;
    }

    public String toString()//Integer (radix 16) to String (16進制整數的print)
    {
        return super.toString(16);
    }
}
