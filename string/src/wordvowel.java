
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujalsdfjjkdsfk
 */
public class wordvowel {
    public void sort(String a[]){
       String swap="";
   for(int i=0;i<a.length;i++){
       
       for(int j=0;j<a.length-i-1;j++){
           if(a[j].length()>a[j+1].length()){
               swap=a[j];
               a[j]=a[j+1];
               a[j+1]=swap;
               
           }
       }
       
   }
   
        
    }
    public static void main(String args []){
        
        wordvowel obj=new wordvowel();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringTokenizer tk=new StringTokenizer(s);
        int x=tk.countTokens();
        String ar[] =new String [x];
        for(int i=0;i<x;i++){
        String str=tk.nextToken();
        ar[i]=str;
        }
        obj.sort(ar);
        for(int i=0;i<x;i++){
    System.out.print(ar[i]+" ");
    }
    }
}
