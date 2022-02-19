import java.util.*;
public class Prime {
     
    //number divisible by 1 and itself
    //if number is divisible by any number between 2 to n-1 then it is not prime
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int flag=0;
    for(int i=2;i<=n-1;i++)
    {
        if(n%i==0)
        {
            flag++;
        }
    }
    if(flag>0)
    {
        System.out.println("Not a prime number");
    }
    else{
        System.out.println("Prime number");
    }
    sc.close();

        
    }
   
    
}
