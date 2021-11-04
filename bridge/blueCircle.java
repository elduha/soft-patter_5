package bridge;

public class blueCircle implements Drawfigure{
    @Override
    public void drawCircle(int radius, int a, int b) {
        System.out.println("Circle is blue , radius :" + radius +" a is : " + a + " b is : " + b);
    }
}
