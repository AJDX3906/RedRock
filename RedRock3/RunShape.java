package RedRock3;

/**
 * Created by AJDX3906 on 2016/10/21.
 */
public class RunShape {
    public static void main(String[] args){
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        System.out.println("周长"+s1.zhou(5,0) + "   面积" + s1.mian(5,0) );
        System.out.println("周长"+s2.zhou(1,2) + "   面积" + s2.mian(1,2) );
        IPlayGame Ip1 = new Circle();    //调用接口
        Ip1.playgame();

    }
}
