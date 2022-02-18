/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author sujal
 */
public class check_box_demo {
    check_box_demo (){
        JFrame j=new JFrame("Let's go!!!!!");
        JCheckBox f=new JCheckBox("Pizza");
        f.setSelected(false);
        f.setBounds(150,100,300,50);
        j.add(f);
        if(f.isSelected()){
            JOptionPane.showMessageDialog(null,"you clicked pizza button...");
        }
    j.setSize(300,220);
        j.setLocationRelativeTo(null);
        j.setResizable(false);
        //j.setBackground(Color.RED);
         j.setLayout(null);
        j.setVisible(true);
}
    public static void main(String args[]){
        check_box_demo dhjm=new check_box_demo();
    }
}
