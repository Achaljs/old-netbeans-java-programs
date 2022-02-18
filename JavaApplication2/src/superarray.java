/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hum
 */
import java.util.*;

public class superarray {
    public static void main (String ra[]){
     Scanner aj=new Scanner(System.in);  
     System.out.println("Enter the row of matrix");
     int m=aj.nextInt();
     System.out.println("Enter the column of matrix");
     int n=aj.nextInt();
     int c=0;
     
     System.out.println("Enter the element of matrix");
     int a[][] =new int[m][n];
     for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              a[i][j]=aj.nextInt();
          }
          
     }
     
     
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            
              if(a[i][j]==0){
              c++;
              }
           
}

      }
      if(c>=((m*n)-c)){
          System.out.println("yes");
          
      }
      else{
          System.out.println("no");
          
    }
    }
}