

import java.time.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujal
 */
public class current_age {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your date of birth......");
        System.out.print("Date:- ");
        int a=sc.nextInt();
        System.out.print("Month:- ");
        int b=sc.nextInt();
        System.out.print("YEAR:- ");
       int c=sc.nextInt();
       LocalDate p=LocalDate.now();
        int y = p.getYear(); 
    Month m = p.getMonth();
    System.out.println("years= " + (y-c)+m);
     
}
}
