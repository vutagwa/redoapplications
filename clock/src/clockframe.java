import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class clockframe extends JFrame{
    SimpleDateFormat timeformat;;
    String time;
    JLabel timelabel;
    clockframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("clock");
        this.setResizable(true);
        this.setSize(400,400);
        timeformat = new SimpleDateFormat("hh:mm:ss a");
        timelabel = new JLabel();
        timelabel.setFont(new Font("Times new roman", Font.BOLD,60));
        timelabel.setBackground(Color.black);
        this.add(timelabel);
        this.setVisible(true);
        settime();
    }
    public void settime(){
        while(true){
            time = timeformat.format(Calendar.getInstance().getTime());
            timelabel.setText(time);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        
    }
    }
}
