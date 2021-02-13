package myGraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    BouncingBox box1;
    BouncingBox box2;
    BouncingBox box3;
    
    BouncingBall ball;
    
    ArrayList<BouncingBox> l = new ArrayList<BouncingBox>();
    
    
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 100, Color.white);
        ball = new BouncingBall(200,100,50,Color.red);
        box1 = new BouncingBox(100, 200, Color.yellow);
        box2 = new BouncingBox(300, 100, Color.red);
        box3 = new BouncingBox(200, 200, Color.blue);
        //ArrayList<BouncingBox> l = new ArrayList<BouncingBox>();
        l.add(box1);
        l.add(box2);
        l.add(box3);
        box.setMovementVector(4, 5);
        box1.setMovementVector(1, 2);
        box2.setMovementVector(2, 3);
        box3.setMovementVector(0, 5);
        ball.setMovementVector(1, 2);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        box.draw(surface);
        ball.draw(surface);
        surface.drawOval(50, 50, 300, 300);
        surface.drawRect(20, 20, 50, 50);
        surface.drawString("My name is sanjaya", 100, 100);
        surface.drawArc(20, 30, 40, 10, 45, 45);
        
        for(BouncingBox b:l) {
        	b.draw(surface);
        }
        
    }
} 
