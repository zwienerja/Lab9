import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * creates the display of circles from ExerciseGame and FormCircleArray
 */
public class ExerciseDisplay extends JPanel{
    private ExerciseGame game;
    private final int START_X = 200;
    private final int START_Y = 100;
    private final int START_Width = 50;
    private final int START_Height= 100;
    private final int maxCircles = 20;
    Random r = new Random();
    int[][] circles;

    /**
     * creates a new excerciseGame which in turn creates a new circleArray
     * also adds a mouse listener which moves the circle on a mouse click
     */
    public ExerciseDisplay(){
        game = new ExerciseGame(START_X,START_Y ,START_Width, START_Height, r.nextInt(maxCircles)+1);
        this.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {
                circles = game.processMove(me.getX()-50,me.getY()-50);
                System.err.print("\n mouse clicked");
                repaint();
            }
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
        });
    }


    /**
     * paints the circle graphics on the display
     * @param g
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(circles != null && circles.length > 0 )
            for(int dex = 0; dex < circles.length; dex++)
            {
                g.setColor(Color.black);
                g.drawOval(circles[dex][0],circles[dex][1],circles[dex][2],circles[dex][3]);//outline
                g.setColor(new Color(circles[dex][4],circles[dex][5],circles[dex][6]));//set color to red, green, blue
                g.fillOval(circles[dex][0],circles[dex][1],circles[dex][2],circles[dex][3]);//draw oval

            }
    }
}
