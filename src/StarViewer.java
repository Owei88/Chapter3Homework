import javax.swing.*;

public class StarViewer{
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700, 700);
        frame.setTitle("Starry Night");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StarComponent Star1 = new StarComponent();
        frame.add(Star1);
        StarComponent Star2 = new StarComponent();
        frame.add(Star2);
        StarComponent Star3 = new StarComponent();
        frame.add(Star3);


        frame.setVisible(true);
    }
}
