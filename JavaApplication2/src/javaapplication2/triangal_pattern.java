/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author sujal
 */
import java.util.*;
public class triangal_pattern {
    public static void main(String args[]){
        Scanner aj=new Scanner(System.in);
        System.out.println("Enter the row.");
        int row=aj.nextInt();
         for(int i=1;i<=row;i++){
            for(int j=1;j<i;j++){
                System.out.print("");
            }
            for(int j=i;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=(row-1);i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print("");
            }
            for(int j=i;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    }

