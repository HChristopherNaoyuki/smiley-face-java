package Solutions;

import javax.swing.*;
import java.awt.*;

/**
 * Smile
 * 
 * This class extends JFrame and draws a blue smiling face on the screen.
 * The smiley face includes two eyes and a curved mouth, created using
 * Graphics methods.
 */
public class Smile extends JFrame
{
    /**
     * Constructor to initialize the JFrame properties.
     */
    public Smile()
    {
        super("Blue Smiling Face");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
    }

    /**
     * Overrides the paint method to draw the smiling face.
     * @param g the Graphics object used for drawing
     */
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        // Cast Graphics to Graphics2D for more control
        Graphics2D g2d = (Graphics2D) g;

        // Set color for the face
        g2d.setColor(Color.BLUE);

        // Draw face (circle)
        g2d.fillOval(100, 100, 200, 200);

        // Set color for eyes
        g2d.setColor(Color.WHITE);
        g2d.fillOval(155, 160, 20, 20); // Left eye
        g2d.fillOval(225, 160, 20, 20); // Right eye

        // Set color for the mouth and draw an arc for the smile
        g2d.setColor(Color.WHITE);
        g2d.drawArc(150, 200, 100, 50, 0, -180);
    }

    /**
     * Main method to run the application.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        // Create the smile frame and make it visible
        SwingUtilities.invokeLater(() -> 
        {
            Smile smileFrame = new Smile();
            smileFrame.setVisible(true);
        });
    }
}
