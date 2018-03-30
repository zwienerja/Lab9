import java.util.Random;

/**
 * ExerciseGame creates a FormCircleArray object
 * has access to the width and height of the circle
 * has access to the processMove method which moves the circleArray
 */
public class ExerciseGame {
    FormCircleArray circleArray;
    private int circleWidth = 50;
    private int circleHeight= 100;
    Random r = new Random();
    private final int maxCircles = 20;

    /**
     * set the width of the circle
     * @param circleWidth
     */
    public void setCircleWidth(int circleWidth) {
        this.circleWidth = circleWidth;
    }

    /**
     * set the height of the circle
     * @param circleHeight
     */
    public void setCircleHeight(int circleHeight) {
        this.circleHeight = circleHeight;
    }

    /**
     * exercise game constructor, forms a new circle array
     * @param x
     * @param y
     * @param wid
     * @param hei
     * @param rSeed
     */
    public ExerciseGame(int x, int y, int wid, int hei, int rSeed)
    {
        circleArray = new FormCircleArray(x, y, wid, hei, r.nextInt(maxCircles)+1);
        setCircleWidth(wid);
        setCircleHeight(hei);
    }

    /**
     * generates a new circle array at the point 'x', 'y' inputted
     * @param x
     * @param y
     * @return
     */
    public int [][] processMove( int x, int y)
    {
        int[][] circs = circleArray.genNewArray(x, y, circleWidth, circleHeight, r.nextInt(maxCircles)+1);
        return circleArray.getCircs();
    }
}
