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
class prime_function {
     public static  boolean prime(int n){
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c=c+1;
                break;
            }          
        }
        if(c==0){
             return true;
        }
        else{
            return false;
        }
    }
}
