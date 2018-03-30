import javax.swing.*;
import java.awt.*;

/**
 * Creates a JFrame window where a mouse click creates a random
 * number of circles at the point where the mouse clicks
 */
public class ExerciseWindow extends JFrame{
    private int win_width = 400;
    private int win_height = 300;
    private ExerciseDisplay panel;

    /**
     * creates a JFrame window
     * initializeWindow method used
     */
    public ExerciseWindow(){
        this.setTitle("Exercise Window");
        this.setSize(win_width,win_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inititalizeWindow();
        this.setVisible(true);
    }

    /**
     * Main method - creates a new ExerciseWindow
     * @param args
     */
    public static void main(String[] args) {
        ExerciseWindow ew = new ExerciseWindow();
    }

    /**
     * creates a new ExerciseDisplay
     */
    public void inititalizeWindow() {
        panel = new ExerciseDisplay();
        this.add(panel, BorderLayout.CENTER);
    }
}
