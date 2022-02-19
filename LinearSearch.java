import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Liner Search");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter Key to Search");
        int key=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(key==arr[i])
            {
                System.out.println("key found at "+i+"index");
            }
        }

    }
}
