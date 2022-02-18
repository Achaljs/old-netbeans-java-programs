/*Hiiii,,,,,,Friends I am achal and this is my second favorite program in java not first,because my first favorite programe is of "MENU of maths formulae" 
which is done by java core,,,when I was begnnier and now I am expert in core and begnnier in GUI!!!!!!*/
/*wait,Because my next program is coming soon!!!!!!!!!!!!,Don't forget about it!!!!!*/
package javaapplication2;
import java.awt.event.*;
import javax.swing.*;
public class calculator extends logic_function implements ActionListener//starting of class
{
    JFrame j=new JFrame("CALCULATOR");//me
        JTextField t1,t2,t3,t4,t5,tdis=new JTextField();
        JLabel l1,l2,l3,l4,l5;
        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    calculator(){//opening of constructor
       t1=new JTextField();
        t1.setBounds(20,40,350,40);
        j.add(t1);
        l2=new JLabel("Enter the number,Here!!!");
        l2.setBounds(20,5,250,40);
        j.add(l2);
        t2=new JTextField();
        t2.setBounds(20,80,350,40);
        t2.setEditable(false);
        tdis=new JTextField();
        tdis.setBounds(300,0,50,40);
        tdis.setEditable(false);
        t2.add(tdis);
        j.add(t2);
        l1=new JLabel ("---------------------------------------------------------------------------------------------------------------");
        l1.setBounds(00,120,600,40);
        j.add(l1);
        b1=new JButton("=");
        b1.setBounds(160,280,60,40);
        j.add(b1);
         b2=new JButton("+");
        b2.setBounds(160,240,60,40);
        j.add(b2);
         b3=new JButton("-");
        b3.setBounds(160,320,60,40);
        j.add(b3);
         b4=new JButton("*");
        b4.setBounds(100,280,60,40);
        j.add(b4);
         b5=new JButton("/");
        b5.setBounds(220,280,60,40);
        j.add(b5);
         b6=new JButton("Clear All");
        b6.setBounds(270,400,100,40);
        j.add(b6);
         b7=new JButton("#History#");
        b7.setBounds(10,400,100,40);
        j.add(b7);
         b8=new JButton("%");
        b8.setBounds(160,170,60,40);
        j.add(b8);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        j.setSize(400,500);//jframe is started here
        j.setLocationRelativeTo(null);
        j.setLayout(null);
        j.setVisible(true);
        
    }
    public static void main(String args[]){
    calculator ca=new calculator();
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            if(empty(t1.getText())){//additon
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                
                else{
                    
            t2.setText(t1.getText());
            t1.setText("");
            tdis.setText("+");
            String s1=t1.getText();
        }
        }
        if(tdis.getText().equals("+")){
         if(e.getSource()==b1){
             if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number under int.");
                }
                else{
             String s1=t1.getText();
        String s2=t2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=a+b;
        String result=String.valueOf(c);
        t1.setText(result);
        t2.setText("Your's Sum is,Here^^^");
        tdis.setText("=");
                }
         }
                }
        
          if(e.getSource()==b3){
            if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                
                else{
                    
            t2.setText(t1.getText());
            t1.setText("");
            tdis.setText("-");
            String s1=t1.getText();
                }
          }
        if(tdis.getText().equals("-")){
         if(e.getSource()==b1){
             if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                else{
             String s1=t2.getText();
        String s2=t1.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=a-b;
        String result=String.valueOf(c);
        t1.setText(result);
        t2.setText("Your's Substraction is,Here^^^");
        tdis.setText("=");
                }
         }
         }
         if(e.getSource()==b4){
            if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                
                else{
                    
            t2.setText(t1.getText());
            t1.setText("");
            tdis.setText("*");
            String s1=t1.getText();
                }
          }
        if(tdis.getText().equals("*")){
         if(e.getSource()==b1){
             if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                else{
             String s1=t2.getText();
        String s2=t1.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=a*b;
        String result=String.valueOf(c);
        t1.setText(result);
        t2.setText("Your's multiplication is,Here^^^");
        tdis.setText("=");
                }
         }
        }
         if(e.getSource()==b5){
            if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                
                else{
                    
            t2.setText(t1.getText());
            t1.setText("");
            tdis.setText("/");
            String s1=t1.getText();
                }
          }
        if(tdis.getText().equals("/")){
         if(e.getSource()==b1){
             if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                else{
             String s1=t2.getText();
        String s2=t1.getText();
        float a=Integer.parseInt(s1);
        float b=Integer.parseInt(s2);
        float c=a/b;
        String result=String.valueOf(c);
        t1.setText(result);
        t2.setText("Your's your division is,Here^^^");
        tdis.setText("=");
                }
         }
         }
         if(e.getSource()==b8){
            if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                
                else{
                    
            t2.setText(t1.getText());
            t1.setText("");
            tdis.setText("%");
            String s1=t1.getText();
                }
          }
        if(tdis.getText().equals("%")){
         if(e.getSource()==b1){
             if(empty(t1.getText())){
                JOptionPane.showMessageDialog(null,"Please enter the number!!!!");
            }
                
                else if(check(t1.getText())){
                    JOptionPane.showMessageDialog(null,"Please enter numbers only...");
                }
                
                else if(length(t1.getText())){
                    JOptionPane.showMessageDialog(null,"please enter the number less than under int.");
                }
                else{
             String s1=t2.getText();
        String s2=t1.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=a%b;
        String result=String.valueOf(c);
        t1.setText(result);
        t2.setText("Your's rimender is,Here^^^");
        tdis.setText("=");
                }
         }
         }
        ////////////////////////////////////////////////////////
        if(e.getSource()==b6){
        t1.setText("");
        t2.setText("");
        tdis.setText("");
        }
        if(e.getSource()==b7){
            JFrame s2=new JFrame();
            
            s2.setSize(250,300);
            s2.setLocationRelativeTo(null);
            s2.setLayout(null);
            s2.setVisible(true);
        }
}
}
//Thanks friends,for testing my program!!! 
    //I think you all enjoy it...........//
