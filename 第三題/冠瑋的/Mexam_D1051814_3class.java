import java.math.BigInteger;

public class Mexam_D1051814_3class extends BigInteger{
    public Mexam_D1051814_3class(String s){
        super(s, 16);
    }

    public Mexam_D1051814_3class add(BigInteger a){
        return new Mexam_D1051814_3class(super.add(a).toString(16));
    }

    public Mexam_D1051814_3class add(Mexam_D1051814_3class a){
        return new Mexam_D1051814_3class(super.add(a).toString(16));
    }

    public Mexam_D1051814_3class subtract(BigInteger a){
        return new Mexam_D1051814_3class(super.subtract(a).toString(16));
    }

    public Mexam_D1051814_3class subtract(Mexam_D1051814_3class a){
        return new Mexam_D1051814_3class(super.subtract(a).toString(16));
    }

    public Mexam_D1051814_3class multiply(BigInteger a){
        return new Mexam_D1051814_3class(super.multiply(a).toString(16));
    }

    public Mexam_D1051814_3class multiply(Mexam_D1051814_3class a){
        return new Mexam_D1051814_3class(super.multiply(a).toString(16));
    }

    public String toString() {
		return super.toString(16);
	}
}
