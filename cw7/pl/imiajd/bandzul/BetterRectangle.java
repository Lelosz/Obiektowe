package pl.imiajd.bandzul;

public class BetterRectangle extends java.awt.Rectangle{
    public BetterRectangle(int x, int y, int width, int height){
        super();
        setLocation(x,y);
        setSize(width,height);
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public double getArea(){
        return width*height;
    }
}
