// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        Random rand = new Random(420);

        int maxx = 400;
        int maxy = 300;
        int minx = 10;
        int miny = 10;
        for(int k = 0; k<= 100; k++){
            int x1 = rand.nextInt(maxx - minx + 1)+ minx;
            int y1 = rand.nextInt(maxy - miny + 1) + miny;
            int x2 = rand.nextInt(maxx - minx + 1) + minx;
            int y2 = rand.nextInt(maxy - miny + 1) + miny;
            int red = rand.nextInt(256);
            int blue = rand.nextInt(256);
            int green = rand.nextInt(256);
            g.setColor(new Color(red,green,blue));
            g.drawLine(x1,y1,x2,y2);
        }






        // Draw Random Squares
        maxx = 740;
        maxy = 250;
        minx =400;
        miny = 10;

        Random rndInt = new Random(444);
        for (int k = 0; k<=100;k++){
            int x1 = rand.nextInt(maxx - minx + 1)+ minx;
            int y1 = rand.nextInt(maxy - miny + 1) + miny;
            int red = rand.nextInt(256);
            int blue = rand.nextInt(256);
            int green = rand.nextInt(256);
            g.setColor(new Color(red,green,blue));
            g.fillRect(x1,y1,50,50);

        }





        // Draw Random Circles
        maxx = 400;
        maxy = 590;
        minx = 10;
        miny = 300;

        for (int k = 0; k<=100;k++) {
            int diameter = rand.nextInt(200);
            int x1 = rand.nextInt(maxx - minx + 1-diameter) + minx;
            int y1 = rand.nextInt(maxy - miny + 1-diameter) + miny;
            int red = rndInt.nextInt(256);
            int blue = rndInt.nextInt(256);
            int green = rndInt.nextInt(256);
            g.setColor(new Color(red, green, blue));

            g.drawOval(x1, y1, diameter, diameter);
        }





        // Draw 3-D Box

        Polygon cube = new Polygon();
            cube.addPoint(675,425);
        cube.addPoint(675,575);
        cube.addPoint(525,575);
        cube.addPoint(625,400);
        cube.addPoint(625,375);
        cube.addPoint(450,375);
        cube.addPoint(475,400);
        cube.addPoint(525,425);
        g.setColor(Color.yellow);
            g.fillPolygon(cube);


        Polygon diamond = new Polygon();
        diamond.addPoint(525,575);
        diamond.addPoint(475,525);
        diamond.addPoint(475,375);
        diamond.addPoint(525,425);
        g.setColor(Color.red);
        g.fillPolygon(cube);






    }

}



    
 