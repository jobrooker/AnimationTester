package animationtester;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * An icon that contains a moveable shape.
 */
public class ShapeIcon implements Icon {

    public ShapeIcon(ArrayList<MoveableShape> someShapes,
            int width, int height) 
    {
        shapes = someShapes;
        this.width = width;
        this.height = height;
        
    }
    
    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        for(int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw(g2);}
        
    }
    private int width;
    private int height;
    public ArrayList<MoveableShape> shapes;
    private MoveableShape shape;
}
 

