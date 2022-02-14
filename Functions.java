import java.util.*;
public class Functions {
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }
    public static void sum(int a,int b)
    {
        System.out.println(a+b);
        return;
    }
    public static void prod(int a,int b)
    {
        System.out.println(a+b);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String myname=sc.next();
        int a=sc.nextInt();
        int b=sc.nextInt();
        printMyName(myname);
        sum(a, b);
        prod(a, b);
        
    }
    
}
