package structuralPatterns.composite.example.editor;
import structuralPatterns.composite.example.shapes.CompoundShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ImageEditor {
    private EditorCanvas canvas;
    private CompoundShape allShapes; //= new CompoundShape();

    public ImageEditor(){
        canvas = new EditorCanvas();
    }

    public void loadShapes(Shape... components){
        allShapes.clear();
        //allShapes.addAll(components);
        canvas.refresh();
    }

    private class EditorCanvas extends Canvas {
        JFrame frame;

        private static final int PADDING = 10;

        EditorCanvas(){
            createFrame();
            refresh();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    allShapes.unSelect();
                    allShapes.selectChildAt(e.getX(),e.getY());
                    e.getComponent().repaint();
                }
            });
        }

        void createFrame(){
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            JPanel contentPanel = new JPanel();
            frame.setContentPane(contentPanel);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.green);

        }

        public int getWidth(){
            return allShapes.getX() + allShapes.getWidth() + PADDING;
        }

        public int getHeight(){
            return allShapes.getY() + allShapes.getHeight() + PADDING;
        }

        void refresh(){
            this.setSize(getWidth(),getHeight());
            frame.pack();
        }

        public void paint(Graphics graphics){
            allShapes.paint(graphics);
        }
    }
}
