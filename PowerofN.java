import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class PowerofN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        System.out.println("Enter power");
        int p=sc.nextInt();
        int result=1;
        for(int i=1;i<=p;i++)
        {
            result *= n;
        }
System.out.println(result);
    }
    
}
