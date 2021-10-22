import java.awt.*;
import java.awt.geom.Line2D;


public class Star {

    private int s1;
    private int t1;

    public Star(int x, int y) {
        t1 = x;
        s1 = y;

    }
        public void draw(Graphics2D g2){
        Line2D line1 = new Line2D.Double(t1,s1,t1+100,s1+100);
        g2.draw(line1);


        Line2D line2 = new Line2D.Double(t1,s1+50,t1+100,s1+50);
        g2.draw(line2);


        Line2D line3 = new Line2D.Double(t1,s1+100,t1+100,s1);
        g2.draw(line3);


        Line2D line4 = new Line2D.Double(t1+50,s1,t1+50,s1+100);
        g2.draw(line4);


    }

}
