package RedRock3;

/**
 * Created by AJDX3906 on 2016/10/21.
 */
public class Rectangle extends Shape {

    @Override
    public double zhou(double x, double y) {
        double c = 2*(x + y);
        return c;
    }

    @Override
    public double mian(double x, double y) {
        return x * y;
    }
}
