package RedRock2;

import java.math.BigInteger;

/**
 * Created by AJDX3906 on 2016/10/16.
 */
public class Test1 {
    private BigInteger num;
    private int a, b;
    private String prin;
    public void setNum ( int i){
        this.num = new BigInteger("1");
        for (int x = i; x > 0; x--) {
            num = num.multiply(new BigInteger(String.valueOf(x)));
        }
    }

    public void setA(int i) {
        if (i > num.toString().length())
            System.out.println("ERROR:error this bigger than length input....");
        else if (i < 0)
            System.out.println("ERROR:error this must > 0 ");
        else
            this.a = i;
    }

    public void setB(int i) {
        if (i > num.toString().length())
            System.out.println("ERROR：error this bigger than length input....");
        else if (i < 0)
            System.out.println("ERROR:error this must > 0 ");
        else
            this.b = i;
    }

    public String getPrin() {
        return prin;
    }

    public void setPrin() {
        if (a >= b)
            System.out.println("ERROR: error Must:B >A && B =/= A ");
        else
            this.prin = num.toString().substring(a, b);
    }

}
