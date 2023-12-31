package structuralPatterns.composite.example;



import structuralPatterns.composite.example.editor.ImageEditor;
import structuralPatterns.composite.example.shapes.Circle;
import structuralPatterns.composite.example.shapes.CompoundShape;
import structuralPatterns.composite.example.shapes.Dot;
import structuralPatterns.composite.example.shapes.Shape;
import structuralPatterns.composite.example.shapes.Rectangle;

import java.awt.Color;



public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        Shape c1 = new Circle(10, 10, 10, Color.BLUE);
        Shape c2 = new CompoundShape(
                new Circle(110, 110, 50, Color.RED),
                new Dot(160, 160, Color.RED)
        );

        Shape c3 = new CompoundShape(
                new Rectangle(250, 250, 100, 100, Color.GREEN),
                new Dot(240, 240, Color.GREEN),
                new Dot(240, 360, Color.GREEN),
                new Dot(360, 360, Color.GREEN),
                new Dot(360, 240, Color.GREEN)
        );

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
        //editor.loadShapes(shapes);
    }
}
