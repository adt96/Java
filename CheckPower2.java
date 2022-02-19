import java.util.*;

public class CheckPower2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;

        if(n%2==0)
        {   while((n/2)>=1)
            {   n= n/2;
                count++;
            }
            //multiply 2 count times
            int prod=1;
            for(int i=1;i<=count;i++)
            {
                prod *=2;
            }

            if(prod==temp)
            {
                System.out.println("Number is a power of 2");
            }
            else{
                System.out.println("Not a power of 2");
            } 
        }
        else if(n==1){
            System.out.println("Number is a power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
     
    }
    
    
}
