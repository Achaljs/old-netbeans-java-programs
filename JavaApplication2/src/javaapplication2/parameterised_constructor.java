package javaapplication2;
import java.util.Scanner;
public class parameterised_constructor {
    public parameterised_constructor( int a , int b){
      int c=a+b;
      System.out.println("addition of the number : "+c);
    }
    public static void main(String args[]){
        parameterised_constructor aj;
        aj = new parameterised_constructor(2,3);
        
    }
}
