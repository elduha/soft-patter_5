package bridge;

public abstract class shape {
    protected Drawfigure drawfigure;
    protected shape(Drawfigure drawfigure){
        this.drawfigure = drawfigure;
    }
    public abstract void draw();
}
