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
public class pattern {
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (i==j){
                System.out.print(" "+i+" ");
                }
                else{
                   System.out.print(" 0 " ); 
                }
            }
        System.out.println();
        }
    }
}
