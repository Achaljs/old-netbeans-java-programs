
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
public class NewClass {
    public static void main(String ag[]){
        
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit......");
        int l=sc.nextInt();
        int i=0;
       String temp;
       String t2;
        System.out.println("Enter the elements of array");
        String a[]=new String [l];
        String b[]=new String [l];
        for( i=0;i<l;i++){
            a[i]=sc.next();
        }
        for( i=0;i<l;i++){
            b[i]=sc.next();
        }
        for( i=0;i<l;i++){
            for(int j=0;j<(l-i-1);j++){
                if(a[j+1].compareTo(a[j])<0){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    t2=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t2;
                }
            }
        }
        for( i=0;i<l;i++){
            System.out.print(b[i]+"\n"+a[i]);
            System.out.println();
        }
    }
}
