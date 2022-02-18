package javaapplication2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
public class frame_in_frame implements ActionListener{
  JFrame j=new JFrame("SUPERB!!!");
       JTextField t1,t2;
       JLabel l1,l2;
       JButton b1,b2;
    frame_in_frame() {
        t1=new JTextField();
       t1.setBounds(60,100,200,40);
       j.add(t1);
       l2=new JLabel("PLEASE!!!!");
        l2.setBounds(120,50,120,30);
        j.add(l2);
        l1=new JLabel("Enter your name!!!!");
        l1.setBounds(100,70,140,30);
        j.add(l1);
        b1=new JButton("NEXT");
        b1.setBounds(110,150,80,30);
        j.add(b1);
        b1.addActionListener(this);
        j.setSize(300,220);
        j.setLocationRelativeTo(null);
        j.setResizable(false);
        j.setBackground(Color.RED);
        
         j.setLayout(null);
        j.setVisible(true);
   

}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1){
            if(t1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Firstly , enter string....");
            }
            else{
            JFrame s2=new JFrame();
            s2.setSize(300,100);
            s2.setLocationRelativeTo(null);
            s2.setLayout(null);
            s2.setVisible(true);
             JLabel l4;
                l4=new JLabel("OH!!!!,,My god "+t1.getText()+",,,I am your bigest fan!!");
                l4.setBounds(10,10,250,50);
                l4.setForeground(Color.red);
                //l4.prepareImage();
                s2.add(l4);
            
            }
        }
    }

  public static void main(String arg[]){
      frame_in_frame ad=new frame_in_frame();
  }
   
}
