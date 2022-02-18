/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujalsdfjjkdsfk
 * 
 */
import java.util.*;
public class fascinating {
    public boolean cheakfas(int num){
        int conc=0;
        int n1=num*2;
        int n2=num*3;
        int c1=0,c2=0;
        int num1=n1;
        int num2=n2;
        while(n1!=0){
            c1++; n1=n1/10;
        }
        while(n2!=0){
            c2++; n2=n2/10;
        }
        int b1=(int) Math.pow(10,c1);
        System.out.println(b1);
        int b2=(int)Math.pow(10,c2);
        System.out.println(b2);
        conc= (num*b1)+(num1*b2)+num2;
        System.out.println(conc);
        int k=0;
        /*for(int i=1;i<=9;i++){
            while(conc!=0){
                int r1=conc%10;
                 conc=conc/10;
                if(r1==i){
                    k++;
                    break;
                }
               
            }
            
        }*/
        if(k==9){
               return true; 
            }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        fascinating obj=new fascinating();
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        /*int n=sc.nextInt();
        int count=0;
        if(m<n&&m>99&&n<10000){
            for(int i=m;i<=n;i++){
                if(obj.cheakfas(i)==true){
                    System.out.print(i+" ");
                    count++;
                }
            }
            System.out.println(count);
        }
        else{
            System.out.println("invalid input");
            
        
        }*/
        System.out.println(obj.cheakfas(m));
        
    }
}
