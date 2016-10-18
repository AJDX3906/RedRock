package 红岩2;

import java.math.BigInteger;

/**
 * Created by AJDX3906 on 2016/10/16.
 */
public class Test {
    private BigInteger num;
    private int a, b;
    private String prin;

    public String subResule(int input , int start , int end){
        this.num=new BigInteger("1");
        for (int x = input ; x > 0 ; x--)
            num = num.multiply(new BigInteger(String.valueOf(x)));
        this.a= start;
        this.b=end;
        this.prin = num.toString().substring(a, b);

        return prin;
    }

}


