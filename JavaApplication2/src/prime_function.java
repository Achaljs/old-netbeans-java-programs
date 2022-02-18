/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujal
 */
public class prime_function {
    public static  boolean prime(int n){
        int c=0;
        for(int i=2;i<=n/2;++i){
            if(n%i==0){
                c=2;
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
