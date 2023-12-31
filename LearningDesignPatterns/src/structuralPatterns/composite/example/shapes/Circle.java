package structuralPatterns.composite.example.shapes;

import java.awt.*;

public class Circle extends BaseShape{
    public int radius;

    public Circle(int x, int y, int radius, Color color){
        super(x,y,color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius;
    }

    @Override
    public int getHeight() {
        return radius;
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.drawOval(super.getX(), super.getY(), getWidth() - 1, getHeight() - 1);
    }

}
