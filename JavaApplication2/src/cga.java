/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujal
 */
import java.util.*;
public class cga {
    public static void main(String akj[]){
        Scanner aj=new Scanner(System.in);
        String s[]=new String [5];
       System.out.println("Enter the subjects");
       for(int i=0;i<5;i++){
           s[i]=aj.nextLine();
           
       }
       int a[] =new int[5];
      float b[] =new float[5];
      float sum=0;
        System.out.println("Enter the marks obtained in subjects respectively....");
        for(int i=0;i<5;i++){
            a[i]=aj.nextInt();
            if(a[i]<=100){
                
            }
            else{
                System.out.println("Enter the number in the range of 100 only!!!!!!!! ");
                 a[i]=aj.nextInt();
            }
            
        }
        System.out.println("\n"+"\n");
        System.out.println("<<<<<<< HAVE A LOOK BELOW >>>>>>>>"+"\n"+"\n");
        for(int i=0;i<5;i++){
           System.out.println(s[i]+" - "+a[i]+"/100");
         
        }
        
        for(int i=0;i<5;i++){
            b[i]=a[i]/10;
          sum=sum+b[i];
         
        }
        System.out.println("\n");
        System.out.println("CGA of the candidate is - "+(sum/5)+".");
         System.out.println(" AND ");
         System.out.println("CGA Percentage(%) of the candidate is - "+((sum*9.5)/5)+"%");
    }
}
