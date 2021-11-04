package bridge;

public class Circle extends shape{
    private int a , b , radius;
    public Circle(int a , int b , int radius , Drawfigure drawfigure){
        super(drawfigure);
        this.a = a ;
        this.b = b ;
        this.radius = radius ;
    }
    public void draw() {
        drawfigure.drawCircle(a , b ,radius);
    }
}
