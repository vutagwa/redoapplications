import java.awt.*;
import java.util.Random;
import javax.swing.*;
public class dotframe extends JFrame {
    static final int SCREEN_HEIGHT = 550,SCREEN_WIDTH = 550, UNIT_SIZE = 30;
    int dotx,doty;
    Random random;
    dotframe(){
        JPanel pan = new JPanel();
        pan.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        pan.setBackground(Color.pink);
        pan.setFocusable(true);
        this.add(pan);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setTitle("graphics test");
        this.setVisible(true);
    }
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        draw(g);
    }
    public void draw(Graphics g){
        for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++){
            g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        }}
   
    public void newdot(){
        dotx = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        doty = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }
}
