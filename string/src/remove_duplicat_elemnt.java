import java .util.*;
public class remove_duplicat_elemnt {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range....");
        int n=sc.nextInt();
        int a[]=new int[n];
        int k;
        System.out.println("Enter the element in array...");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        } 
        System.out.println("your element in array...");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        } 
       
        for(int j=0;j<n;j++){
            k=(j+1);
        while(k<n){
            if(a[j]==a[k]){
                for(int temp=k;temp<n;temp++){
                    a[temp]=a[temp+1];
                }
                n=n-1;
            }
            else{
                k++;
            }
           
        }
        }
         System.out.println("After removeing the duplicate array.....");
         for(int l=0;l<n;l++){
            System.out.println(a[l]);
        }
           
    }
}
