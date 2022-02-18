/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.time.*;
public class date_and_time {
    public static void main(String args[]){
    LocalDate days=LocalDate.now();
    LocalDate yesterday=days.minusDays(1);
    LocalDate tomorrow=yesterday.plusDays(2);
    System.out.println("Current date is = " + days);
     System.out.println("Yesterday date is = " +yesterday);
      System.out.println("Tommorrow date is = " +tomorrow);
}
}