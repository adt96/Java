import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class SwitchCas {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int choice=sc.nextInt();
         switch(choice){
             case 1:
             System.out.println("Red");
             break;
             case 2:
             System.out.println("Blue");
             break;
             case 3:
             System.out.println("Green");
             break;
             default:
             System.out.println("Select between 1 and 3");

         }
    }
    
}
