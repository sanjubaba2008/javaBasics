package myGraphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class BouncingBall {
    int x;
    int y;
    int diameter;
    Color color;
    int xDirection = 0;
    int yDirection = 0;
    
    final int SIZE = 40;

    /**
     * Initialize a new ball with its center located at (startX, startY), filled
     * with startColor.
     */
    public BouncingBall(int startX, int startY, int radius, Color startColor) {
        x = startX;
        y = startY;
        diameter = radius*2;
        color = startColor;
    }

    /** Draws the ball at its current position on to surface. */
    public void draw(Graphics surface) {
        // Draw the object
        surface.setColor(color);
        surface.fillOval(x - diameter/2, y - diameter/2, diameter, diameter);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(x - diameter/2, y - diameter/2, diameter, diameter);
        
        // Move the center of the object each time we draw it
        x += xDirection;
        y += yDirection;

        // If we have hit the edge and are moving in the wrong direction, reverse direction
        // We check the direction because if a box is placed near the wall, we would get "stuck"
        // rather than moving in the right direction
        if ((x - diameter/2 <= 0 && xDirection < 0) ||
                (x + diameter/2 >= SimpleDraw.WIDTH && xDirection > 0)) {
            xDirection = -xDirection;
        }
        if ((y - diameter/2 <= 0 && yDirection < 0) ||
                (y + diameter/2 >= SimpleDraw.HEIGHT && yDirection > 0)) {
            yDirection = -yDirection;
        }
    }

    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }
}