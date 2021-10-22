import javax.swing.*;
import java.awt.*;


    public class StarComponent extends JComponent {
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            Star Star1 = new Star(200,200);
            int t1 = getWidth()  -350;
            int s1 = getHeight()  -420;


            Star Star2 = new Star(t1,s1);
            t1 = getWidth()  -269;
            s1 = getHeight()  -154;

            Star Star3 = new Star(t1,s1);
            t1 = getWidth()  -100;
            s1 = getHeight()  -200;

            Star1.draw(g2);
            Star2.draw(g2);
            Star3.draw(g2);


        }
}
