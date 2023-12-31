package structuralPatterns.composite.example.shapes;


import java.awt.Graphics;
import java.awt.Color;

public class Dot extends BaseShape{
    private final int DOT_SIZE = 3;

    public Dot(int x, int y, Color color){
        super(x,y,color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.fillRect(super.getX() - 1, super.getY() - 1, getWidth(), getHeight());
    }
}
