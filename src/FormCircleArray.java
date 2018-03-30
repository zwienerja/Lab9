/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Forms an array holding values (x, y, width, height) to create a circle
 * @author canderson
 * @author jaredzwiener
 */
public class FormCircleArray {
    int startX = 100;
    int startY = 50;
    int width = 50;
    int height= 50;
    int[][] circs;

    /**
     * class constructor
     * inputs circle's values into the circle array
     * @param X
     * @param Y
     * @param wide
     * @param high
     * @param rSeed
     */
    public FormCircleArray(int X, int Y, int wide, int high, int rSeed)
    {
        generateCircArray(X, Y, wide, high, rSeed);
        
    }

    /**
     * returns the array of circle's values generated from the generateCircArray method
     * @param X
     * @param Y
     * @param wide
     * @param high
     * @param rs
     * @return circs
     */
    public int[][] genNewArray(int X, int Y, int wide, int high, int rs)
    {
        generateCircArray(X, Y, wide, high, rs);
        return circs;
    }

    /**
     * generates and sets up the array holding the circle's values
     * @param X
     * @param Y
     * @param wide
     * @param high
     * @param rs
     */
    private void generateCircArray(int X, int Y, int wide, int high, int rs)
    {
        startX = X;
        startY = Y;
        width = wide;
        height= high;
        circs = new int[rs][7];


        int colorNum1 = 10; //Red
        int colorNum2 = 50; //Green
        int colorNum3 = 150; //Blue
       
        for(int dex = 0; dex < circs.length; dex++)
        {
            circs[dex][0] = startX;
            circs[dex][1] = startY;
            circs[dex][2] = width;
            circs[dex][3] = height;
            circs[dex][4] = colorNum1;
            circs[dex][5] = colorNum2;
            circs[dex][6] = colorNum3;
            
            startX = startX + 10;
            startY += 10;
            width += 10;
            height += 5;
            colorNum1+= 10;
            if(colorNum1 >254)
                 colorNum1 = 10;
            colorNum2+= 10;
            if(colorNum2 >254)
                 colorNum2 = 10;
            colorNum3+= 10;
            if(colorNum3 >254)
                 colorNum3 = 10;
        }
    }

    /**
     * returns a 2-dimensional array holding the circle's variables
     * @return
     */
    public int[][] getCircs()
    {
        return circs;
    }

    /**
     * returns the width of the circle
     * @return width
     */
    public int getWidth() {return width;}

    /**
     * returns the height of the circle
     * @return height
     */
    public int getHeight() {return height;}


}
