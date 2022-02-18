/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author sujal
 */
public class table_demo {
    JFrame frm=new JFrame();
    JTable j;
    table_demo(){
        
        Object[][]data=new Object[][]{
            {"Banana", "9" , "145"},
            {"Apple","8", "123"},
            {"Banana", "9" , "145"},
            {"Apple","8", "123"},
            {"Banana", "9" , "145"},
            {"Apple","8", "123"},
        };
        String [] col=new String[]{"Name","Class","Roll_no"};
       JTable jt = new JTable(data,col);
      // jt.setPreferredScrollableViewportSize(new Dimension(300,50) );
     JScrollPane gh=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     gh.setBounds(100,30,200,100);
       frm.add(gh);
        frm.setSize(400,300);
        frm.setLayout(null);
        frm.setVisible(true);
    }
    public static void main(String kutta[]){
        new table_demo();
    }
}
