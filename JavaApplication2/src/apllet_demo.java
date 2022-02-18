/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujal
 */
import java.applet.*;
import java.awt.*;
public class apllet_demo extends Applet {
    public void init(){
        Button b;
        b = new Button("Submit")
        {
            
        };
                }
    public void paint(Graphics g){
        setBackground(Color.CYAN);
        g.setColor(Color.RED);
        g.drawLine(35,40,300,40);
        g.setColor(Color.BLACK);
        g.drawString("Hello first day in applet class", 40,60);
        g.drawRect(100, 100, 120,100);
        add(b);
    }

}
//<Applet code="apllet_demo.class" width="400" height="400"></Applet>
        