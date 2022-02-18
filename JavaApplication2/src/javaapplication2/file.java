/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.*;

/**
 *
 * @author sujal
 */
public class file {
    
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Runtime run = Runtime.getRuntime();     
 String a[] =new String []{"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","https://www.youtube.com"}; 
        
         Process  pro= run.exec(a);        
         Thread.sleep(5000);
 
        pro.destroy();
            
        
    }
}

