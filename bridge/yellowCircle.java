package bridge;

public class yellowCircle implements Drawfigure{
    @Override
    public void drawCircle(int radius, int a, int b) {
        System.out.println("Circle is yellow , radius :" + radius +" a is : " + a + " b is : " + b );
    }
}
