import java.awt.*;
import javax.swing.*;
public class pan extends JPanel {
    static final int U_WIDTH = 550, LENGTH=550, UNIT=60;
    pan(){
        this.setPreferredSize(new Dimension(LENGTH, U_WIDTH));
        this.setFocusable(true);
        this.setBackground(Color.black);
      
    }
    public void painComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        for(int i=0; i<LENGTH/UNIT;i++){
            g.drawLine(i*UNIT, 0, i*UNIT, LENGTH);
            g.drawLine(0, i*UNIT, U_WIDTH, i*UNIT);
        }
    }
}
