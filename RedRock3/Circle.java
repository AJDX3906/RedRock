package RedRock3;

/**
 * Created by AJDX3906 on 2016/10/21.
 */
public class Circle extends Shape implements IPlayGame {

    final double I = 3.14 ;
    @Override
    public double zhou(double r , double y) {
        double z = 2 * I * r ;
        return z;
    }

    @Override
    public double mian(double r , double y) {
        double s = I * r * r ;
        return  s;
    }

    @Override
    public void playgame() {
        System.out.println("I am NO." + x + "这是一个接口");
    }
}
