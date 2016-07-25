import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
    
     int n,k,i,j,t=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    k=s.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++){
        a[i]=s.nextInt();
        
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(a[i]+a[j]==k&&i!=j){
              System.out.println(a[i]);
              System.out.println(a[j]);
              System.out.println(k);
              t=1;
              break;
            }
        }
        if(t==1)
         break;
    }
    
     }
}
