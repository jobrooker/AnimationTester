/*
 * Exercise 4.20. Enhance the ShapeIcon class so that it displays 
 * multiple moveable shapes. Then modify the animation program to 
 * show a number of moving cars. Hint: Store all shapes in an array
 * list.
 * 
 */
package animationtester;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import javax.swing.Timer;
import java.lang.Object.*;

/**
 * This program implements an animation that moves a car shape.
 */

public class AnimationTester {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        final MoveableShape shape = new CarShape(0, 0, CAR_WIDTH);
        final MoveableShape shape1 = new CarShape(20,55, CAR_WIDTH);
        final MoveableShape shape2 = new CarShape(50, 110, CAR_WIDTH);
        final MoveableShape shape3 = new CarShape(90, 165, CAR_WIDTH);
        final MoveableShape shape4 = new CarShape(50, 220, CAR_WIDTH);
        final MoveableShape shape5 = new CarShape(20, 275, CAR_WIDTH);
        final MoveableShape shape6 = new CarShape(0, 330, CAR_WIDTH);
        
        shapes = new ArrayList<MoveableShape>();
        shapes.add(shape);
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        shapes.add(shape4);
        shapes.add(shape5);
        shapes.add(shape6);

        ShapeIcon icon = new ShapeIcon(shapes, 
              ICON_WIDTH, ICON_HEIGHT);

        snow = "Snowbirds flying south for the winter!";
        final JLabel labely = new JLabel(snow);
        final JLabel label = new JLabel(icon);
        
        frame.setLayout(new FlowLayout());
        frame.add(labely);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int DELAY = 100;
        // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                for (int i = 0; i < shapes.size(); i++) {
                     shapes.get(i).translate(1, 0);
                }
                
                    label.repaint();
                
            }
        });
        t.start();
    }
    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 400;
    private static final int CAR_WIDTH = 100;
    public static ArrayList<MoveableShape> shapes;
    public static ArrayList<JLabel> labels;
    public static String snow;
}