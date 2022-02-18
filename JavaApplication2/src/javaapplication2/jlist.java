/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class jlist {
    JFrame fm=new JFrame("List Demo");
    jlist(){
    String s[]=new String[]{"lavender","Green","Black","Yellowish","parjai","dfgh","rtsyg","fgh","rttyyukkut","ertyhu"};
    JList j =new JList(s);
    JScrollPane jsp=new JScrollPane(j,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    jsp.setBounds(50,30,100,90);
    fm.add(jsp);
    fm.setSize(300,200);
    fm.setLayout(null);
    fm.setLocationRelativeTo(null);
    fm.setResizable(false);
   // fm.setBackground(Color.yellow);
    fm.setVisible(true);
    }
    public static void main(String args[]){
        new jlist();
    }
}
