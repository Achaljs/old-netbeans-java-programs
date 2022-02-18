package javaapplication2;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
 class swing3 extends logic_function implements ActionListener{
    JFrame j=new JFrame("Addition");
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    swing3(){
        l1=new JLabel("First number");
        l1.setBounds(30,100,120,30);
        j.add(l1);
        t1=new JTextField();
        t1.setBounds(130,100,140,30);
        j.add(t1);
        l2=new JLabel("Second number");
        l2.setBounds(30,150,120,30);
        j.add(l2);
        t2=new JTextField();
        t2.setBounds(130,150,140,30);
        j.add(t2);
        b1=new JButton("ADD");
        b1.setBounds(50,200,80,30);
        j.add(b1);
        b2=new JButton("Clear");
        b2.setBounds(140,200,100,30);
        j.add(b2);
        l3=new JLabel();
        l3.setBounds(60,250,300,30);
        j.add(l3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        j.setSize(300,400);
        j.setBackground(Color.RED);
        j.setLayout(null);
        j.setLocationRelativeTo(null);
        j.setResizable(false);
        j.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the first number!!!!");
            }
                else if(empty(t2.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the Second number!!!!");
            }
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                else if(check(t2.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                else if(length(t2.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                
                else{
        String s1=t1.getText();
        String s2=t2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=a+b;
        String result=String.valueOf(c);
        l3.setVisible(true);
        l3.setText("Addition of two numbers = "+result);
                }
        }
        if(ae.getSource()==b2){
        t1.setText("");
        t2.setText("");
        l3.setVisible(false);
        }
    }

public static void main(String args[]){
    swing3 b= new swing3();
   }
}