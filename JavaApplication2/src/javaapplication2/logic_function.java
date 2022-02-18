package javaapplication2;
import java.util.*;
class logic_function {
    public boolean empty(String n){
        if(n.equals("")){
            return true;
        }
        else{
        return false;
        }
    }
    public boolean check(String n){
        Scanner sc=new Scanner(System.in);
        try{
          Integer.parseUnsignedInt(n);
            return false;
        }
        catch(NumberFormatException e){
            e.printStackTrace();
            return true;
        }
    }
    public boolean length( String n){
      int b=n.length();
      if(b>2147483647){
          return true;
      }
      else{
          return false;
      }
    }
}
