
import javax.swing.JFrame;


public class fram extends JFrame{
    fram(){
        this.add(new pan());
        this.setTitle("Graph box");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
}
