
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hum
 */
public class NAME {
    public static void main (String ra[]){
     Scanner aj=new Scanner(System.in);  
     System.out.println("Enter your name......");
     String str=aj.nextLine();
     System.out.println("Enter size of A Single letter .");
     int l=aj.nextInt();
    int jloop=(l*str.length())+l;
     int c=l/2;
     int aage=l-1;
     int pechhe=l-1;
     
     for(int i=0;i<l;i++){
          for(int j=0;j<jloop;j++){
              
              if(j==aage||j==pechhe){
                  System.out.print(" @ ");
              }
              else if(j==c&&i==l/2){
                  System.out.print(" @ ");
              }
              else{
                  System.out.print(" * ");
              }
              c++;
              }
          
          
          System.out.println();
      pechhe--;
      aage++;
      
    }
}

}