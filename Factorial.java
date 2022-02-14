import java.util.*;
public class Factorial {
    // public static void printMyName(String name)
    // {
    //     System.out.println(name);
    //     return;
    // }
    // public static void sum(int a,int b)
    // {
    //     System.out.println(a+b);
    //     return;
    // }
    // public static void prod(int a,int b)
    // {
    //     System.out.println(a+b);
    //     return;
    // }
    public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
  
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
  
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String myname=sc.next();
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // printMyName(myname);
        // sum(a, b);
        // prod(a, b);
        int n = sc.nextInt();
 
       printFactorial(n);
        

    }
    
}
