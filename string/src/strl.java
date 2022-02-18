/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hum
 */
import java.util.*;

class ISC2015
    
{
    
public int c;
public int v;
ISC2015(){
    c=0;v=0;
}
void isVowel(String w)
{
char ch1=0;
int l=w.length();
c=0;v=0;
for(int i=0;i<l;i++)
{
    
ch1=Character.toUpperCase(w.charAt(i));

if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='0'||ch1=='U')
{
    c++;

}
else
{
v++;
}

}
}

public static void main(String args[])
{
ISC2015 ob=new ISC2015();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Sentence :");
String s=sc.nextLine().toUpperCase();
int l=s.length();
char last=s.charAt(l-1);
if(last=='.'||last=='?'||last=='!')
{
System.out.println("INVALID INPUT");
}
else
{
StringTokenizer st=new StringTokenizer(s);
int x=st.countTokens();

System.out.println("ORINGIAL STRING :"+s);
System.out.println("words"+"\t"+"vowel"+"\t"+"consonents");
for(int i=1;i<=x;i++)
{
String str=st.nextToken();

ob.isVowel(str);


System.out.println(str+"\t"+ob.c+"\t"+ob.v);
}
}
}
}

