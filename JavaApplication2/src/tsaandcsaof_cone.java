
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujal
 */
public class tsaandcsaof_cone {
    public static void main(String agrs[])
    {
    Scanner aj =new Scanner(System.in);
        System.out.println("Enter the  radius of cone.");
        int r=aj.nextInt();
         System.out.println("Enter the  height of cone.");
        int h=aj.nextInt();
        double l=Math.sqrt((r*r)+h*h);
    }
}
