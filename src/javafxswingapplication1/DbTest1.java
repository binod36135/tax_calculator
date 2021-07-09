package javafxswingapplication1;
import javax.swing.*;
import java.awt.*;

public class DbTest1 {
    private JFrame f;
    private JLabel l1;
    private JLabel l2;
    private JButton b;
    private JTextField t1;
    private JTextField t2;
    
    public DbTest1(){
        gui();
    }
    public void gui(){
        f=new JFrame();
        l1=new JLabel("Name:");
        t1=new JTextField();
        l2=new JLabel("Addrerss:");
        t2=new JTextField();
        b=new JButton("Submit");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.setBounds(470,200,400,300);
        l1.setBounds(10, 10, 20, 50);
        t1.setBounds(30, 10, 23, 50);
        l2.setBounds(10, 20, 45, 50);
        t2.setBounds(30, 20, 23, 50);
        b.setBounds(10, 34, 20, 50);
        f.setVisible(true);
        f.setLayout(null);
        
        
    }
    public static void main(String[] args){
        DbTest1 dbTest1 = new DbTest1();
    }
    
}
